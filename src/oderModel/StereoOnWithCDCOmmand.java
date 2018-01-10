package oderModel;

public class StereoOnWithCDCOmmand implements Command {
	Stereo stereo;
	public StereoOnWithCDCOmmand(Stereo stereo) {
		this.stereo=stereo;
	}

	@Override
	public void execute() {
		stereo.on();
		stereo.setCD();
		stereo.setVolume(11);
	}

}
