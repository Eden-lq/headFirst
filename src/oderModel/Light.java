package oderModel;

public class Light {
	String a;
	public Light(String temp){
		 a = temp;
	}
	public void on(){
		System.out.println(a+"Light on");
	}
	public void off(){
		System.out.println(a+"Light off");
	}

}
