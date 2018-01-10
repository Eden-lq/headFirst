package oderModel;

public class RemoteLoader {
    public static void main (String[] args){
        RemoteControl remoteControl = new RemoteControl();
        Light livingLight = new Light("Living Room");
        Light kitchenLight = new Light("KitchenLight");
        GarageDoor garageDoor = new GarageDoor("");
        Stereo stereo = new Stereo("Living room");

        LigthOnCommand livingRoomLightOn = new LigthOnCommand(livingLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingLight);
        LigthOnCommand kitchenLightOn = new LigthOnCommand(kitchenLight);
        LigthOnCommand kitchenLightOff = new LigthOnCommand(kitchenLight);

        remoteControl.setCommand(0,livingRoomLightOn,livingRoomLightOff);
        remoteControl.setCommand(1,kitchenLightOn,kitchenLightOff);

        System.out.println(remoteControl);
        remoteControl.onButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(0);
        remoteControl.offButtonWasPushed(1);
        remoteControl.offButtonWasPushed(2);
    }
}
