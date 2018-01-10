package modelMethod;

public class Coffee extends SuperClass {
    @Override
    void addCondiments() {
        System.out.println("Dripping Coffee through filter");

    }

    @Override
    void brew() {
        System.out.println("Adding Sugar and Milk");

    }
}
