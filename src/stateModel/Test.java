package stateModel;

public class Test {
    public static void main(String[] args){
        GumballMachine gumballMachine =new GumballMachine(5);
        System.out.println(gumballMachine);

        gumballMachine.insertQuart();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
        gumballMachine.insertQuart();
        gumballMachine.turnCrank();

        gumballMachine.insertQuart();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
    }
}
