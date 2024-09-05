

import java.util.List;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named
@RequestScoped
public class EmissionBean {

    private String country;
    private List<CO2Data> co2DataList;

    @Inject
    private EmissionService emissionService;

    public void searchEmissions() {
        co2DataList = emissionService.getEmissionByCountry(country);
    }

    // Геттеры и сеттеры
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<CO2Data> getCo2DataList() {
        return co2DataList;
    }

    public void setCo2DataList(List<CO2Data> co2DataList) {
        this.co2DataList = co2DataList;
    }
}
