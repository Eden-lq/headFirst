package oderModel;

public class LigthOnCommand implements Command{
	Light light;
	public LigthOnCommand(Light light) {
		 this.light=light;
	}

	@Override
	public void execute() {
		light.on();
	}

}
