

import java.io.Serializable;
import java.util.List;

import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named
@ViewScoped
public class ManagedBean implements Serializable {
	private static final long serialVersionUID = 1; 
    private String country; // Заменили тип на String
    private List<CO2Data> co2Data;

    @Inject
 

    // Методы для работы с данными о выбросах CO2
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<CO2Data> getCo2Data() {
        return co2Data;
    }

    public void setCo2Data(List<CO2Data> co2Data) {
        this.co2Data = co2Data;
    }
}