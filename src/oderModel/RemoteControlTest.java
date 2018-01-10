package oderModel;

public class RemoteControlTest {

	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light("");
		LigthOnCommand lightOn = new LigthOnCommand(light);
		remote.setSlot(lightOn);
		remote.buttonWasPressed();

	}

}
