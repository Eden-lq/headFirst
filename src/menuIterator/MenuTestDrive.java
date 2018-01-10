package menuIterator;

public class MenuTestDrive {
    public static void main (String args[]){
        MenuComponent pancakeHouseMenu = new Menu("PANCKE HOUSE MENU","Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU","Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU","diner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU","Dessert of course!");
        MenuComponent allMenus = new Menu("ALL MENUS","ALL menus combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        dinerMenu.add(new MenuItem("Pasta","Spaghetti with Marinara Suce",true,3.89));
        dinerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem("Apple pie","This is a apple pie",true,1.59));

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}
