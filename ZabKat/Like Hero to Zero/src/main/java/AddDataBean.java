

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named
@RequestScoped
public class AddDataBean {

    private String country;
    private int year;
    private double emissions;

    @Inject
    private EmissionService emissionService;


    public void addCO2Data() {
        CO2Data newData = new CO2Data();
        newData.setCountry(country);
        newData.setYear(year);
        newData.setEmissions(emissions);
        emissionService.addCO2Data(newData);
    }

    // Геттеры и сеттеры
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getEmissions() {
        return emissions;
    }

    public void setEmissions(double emissions) {
        this.emissions = emissions;
    }
}

