package weather;

public class WeatherRepository {

    public WeatherReport getCurrentWeather(WeatherRequest request) {
        return new WeatherReport(request.getCity(), request.getCountry(), request.getId());

    }
    public WeatherReport getCurrentMinandMax(WeatherRequest request) {
        return new WeatherReport(request.getCurrentHighetTemperature(), request.getCurrentLowestTemperature());
    }
}
