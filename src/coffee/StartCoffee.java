package coffee;

public class StartCoffee {
	public static void main(String[] args) {
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription()+"$"+beverage.cost());
		
		Beverage berverage2 = new HouseBlend();
		berverage2 = new Soy(berverage2);
		berverage2 = new Mocha(berverage2);
		berverage2 = new Whip(berverage2);
		System.out.println(berverage2.getDescription()+"$"+berverage2.cost());
	}

}
