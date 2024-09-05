


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import jakarta.enterprise.context.RequestScoped;

/**
 * Сервисный класс для работы с данными выбросов CO2.
 * Отвечает за взаимодействие с базой данных через JPA.
 */
@RequestScoped  // Используем CDI для управления состоянием
public class EmissionService {

    // EntityManager используется для взаимодействия с базой данных через JPA
    @PersistenceContext
    private EntityManager em;

    /**
     * Метод для получения данных о выбросах по стране.
     *
     * @param country Название страны для поиска данных.
     * @return Список данных о выбросах CO2 для указанной страны.
     */
    public List<CO2Data> getEmissionByCountry(String country) {
        return em.createQuery("SELECT e FROM CO2Data e WHERE e.country = :country", CO2Data.class)
                 .setParameter("country", country)
                 .getResultList();
    }

    /**
     * Метод для добавления новой записи данных о выбросах CO2 в базу данных.
     *
     * @param co2Data Объект данных о выбросах CO2 для сохранения.
     */
    public void addCO2Data(CO2Data co2Data) {
        em.persist(co2Data);
    }
}
