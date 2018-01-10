package stateModel;

public class GumballMachine {
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;

    State state = soldState;
    int count ;
    public GumballMachine(int numberGumballs){
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldOutState = new SoldOutState(this);
        winnerState = new WinnerState(this);
        this.count=numberGumballs;
        if(numberGumballs>0)
            state=noQuarterState;


    }

    public State getWinnerState() {
        return winnerState;
    }

    public void insertQuart(){
        state.insertQuarter();
    }
    public void ejectQuarter(){
        state.ejectQuarter();

    }
    public void turnCrank(){
        state.turnCrank();
        state.dispense();

    }
    void setState(State state){
        this.state=state;
    }

    void releaseBall(){
        System.out.println("A gumball comes rolling out the slot");
        if(count!=0){
            count=count-1;
        }
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getState() {
        return state;
    }

    public int getCount() {
        return count;
    }
}
