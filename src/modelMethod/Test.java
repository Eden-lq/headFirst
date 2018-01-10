package modelMethod;

public class Test {
    public static void main(String[] args) {
        CaffeineBeverageWithHook t = new CaffeeWithHook();
        System.out.println("\nMaking coffee");
        t.prepareRecipe();
    }

}
