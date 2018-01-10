package oderModel;

public class GarageDoor {
	String tmp;
	public GarageDoor(String temp){
		tmp=temp;
	}
	public void up(){
		System.out.println(tmp+"GarageDoor up");
	}
	public void down(){
		System.out.println(tmp+"GarageDoor down");
	}

	public void stop(){
		System.out.println(tmp+"GarageDoor stop");
	}

	public void lightOn(){
		System.out.println(tmp+"GarageDoor lightOn");
	}

	public void lightOff(){
		System.out.println(tmp+"GarageDoor lightOff");
	}


}
