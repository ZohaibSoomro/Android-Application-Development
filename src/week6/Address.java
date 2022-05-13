package week6;

public class Address {
    private String cityName;
    private String stateName;

    public Address() {
    }

    public Address(String cityName, String stateName) {
        this.cityName = cityName;
        this.stateName = stateName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }
}
