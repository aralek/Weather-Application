package weather;

public class WeatherRequest {
    public String city;
    public String country;
    public String id;
    public int highestTemp;
    public int lowestTemp;

    public WeatherRequest(String city, String country, String id) {
        this.city = city;
        this.country = country;
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getId() {
        return id;
    }

    public int getCurrentHighetTemperature() {
        return highestTemp;
    }

    public int getCurrentLowestTemperature() {
        return lowestTemp;
    }
}