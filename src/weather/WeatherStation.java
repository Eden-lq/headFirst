
package weather;

public class WeatherStation {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		weatherData.setMeasurements(21, 23, 264);
		weatherData.setMeasurements(41, 223, 234);
		weatherData.setMeasurements(210, 223, 294);
	}

}
