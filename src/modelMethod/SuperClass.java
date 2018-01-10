package modelMethod;

public abstract class SuperClass {
    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();

    }
    abstract void brew();
    abstract void addCondiments();
    void boilWater(){
        System.out.println("boiling water");
    }
    void pourInCup(){
        System.out.println("Pouring into cup");
    }
}
