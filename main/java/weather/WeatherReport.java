package weather;

public class WeatherReport {
    public String city;
    public String country;
    public String id;
    public String visibility;
    public int highestTemp;
    public int lowestTemp;
    public String pressure;

    public WeatherReport(String city, String country, String id) {
        this.city = city;
        this.country = country;
        this.id = id;
    }

    public WeatherReport(int highestTemp, int lowestTemp) {
        this.highestTemp = highestTemp;
        this.lowestTemp = lowestTemp;

    }
}

