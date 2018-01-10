package weather;

public class CurrentConditionsDisplay implements Observer,DisplayElement{
	private float tempreature;
	private float humidity;
	private Subject weatherData;
	public CurrentConditionsDisplay(Subject weatherData){
		this.weatherData=weatherData;
		weatherData.registerObserver(this);
	}
	@Override
	public void dispaly() {
		System.out.println("current condition:"+tempreature+"F degrees and"+humidity+"%humidity");
	}

	@Override
	public void update(float temp, float hunidity, float pressure) {
		this.tempreature=temp;
		this.humidity=hunidity;
		dispaly();
	}

}
