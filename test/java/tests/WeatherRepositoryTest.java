package tests;

import org.junit.Test;
import weather.WeatherReport;
import weather.WeatherRepository;
import weather.WeatherRequest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class WeatherRepositoryTest {
    @Test
    public void testForMatchingCity() {

        try {
            WeatherRequest request = new WeatherRequest("London", "GB", "5091");
            WeatherRepository weatherRepository = new WeatherRepository();
            WeatherReport report = weatherRepository.getCurrentWeather(request);
            assertEquals(report.city, request.city);
        } catch (Exception random) {
            fail("Testing failure caused " + random.getMessage());

        }
    }

    @Test
    public void testForMatchingId() {

        try {
            WeatherRequest request = new WeatherRequest("London", "GB", "5091");
            WeatherRepository weatherRepository = new WeatherRepository();
            WeatherReport report = weatherRepository.getCurrentWeather(request);
            assertEquals(report.id, request.id);
        } catch (Exception random) {
            fail("Testing failure caused " + random.getMessage());

        }
    }

    @Test
    public void testIfHighTempIsHigh() {
        try {
            WeatherRequest request = new WeatherRequest("London", "GB", "5091");
            WeatherRepository weatherRepository = new WeatherRepository();
            WeatherReport report = weatherRepository.getCurrentMinandMax(request);
            assertEquals(report.highestTemp, request.highestTemp);
        } catch (Exception random) {
            fail("Testing failure caused " + random.getMessage());

        }
    }

    @Test
    public void testPressure() {
        try {
            WeatherRequest request = new WeatherRequest("London", "GB", "5091");
            WeatherRepository weatherRepository = new WeatherRepository();
            WeatherReport report = weatherRepository.getCurrentWeather(request);
            assertTrue(report.pressure.matches("1019"));
        } catch (Exception random) {
            fail("Testing failure caused " + random.getMessage());

        }
    }

    @Test
    public void testVisibility() {
        try {
            WeatherRequest request = new WeatherRequest("London", "GB", "5091");
            WeatherRepository weatherRepository = new WeatherRepository();
            WeatherReport report = weatherRepository.getCurrentWeather(request);
            assertTrue(report.visibility.matches(":10000"));
        } catch (Exception random) {
            fail("Testing failure caused " + random.getMessage());

        }
    }
}
