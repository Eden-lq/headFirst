package oderModel;

public class Stereo {
	String tmp;
	public Stereo(String temp){
		tmp = temp;

	}

	public void on(){
		System.out.println(tmp+"Stereo on");
	}
	public void off(){
		System.out.println(tmp+"Stereo off");
	}
	public void setCD(){
		System.out.println(tmp+"Stereo SetCD");
	}
	public void setRadio(){
		System.out.println(tmp+"Stereo radio");
	}
	public void setVolume(int n){
		System.out.println(tmp+"Stereo volume is"+n);
	}
	public void setDvd(){
		System.out.println(tmp+"Stereo DVD");
	}

}
