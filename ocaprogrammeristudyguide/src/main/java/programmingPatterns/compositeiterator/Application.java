package programmingPatterns.compositeiterator;

public class Application {

    public static void main(String[] args) {

        MenuComponent pancake   = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinner    = new Menu("DINNER MENU", "Lunch");
        MenuComponent cafe      = new Menu("CAFE MENU", "Dinner");
        MenuComponent desert    = new Menu("DESSERT MENU", "Dessert");

        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");

        allMenus.add(pancake);
        allMenus.add(dinner);
        allMenus.add(cafe);

        dinner.add(new MenuItem(
                "Pasta",
                "Spaghetti with Marinara Sauce, and a slice of sourdough bread",
                true,
                3.89));

        dinner.add(desert);

        desert.add(new MenuItem(
                "Apple Pie",
                "Apple pie with a flakey crust, topped with vanilla icecream",
                true,
                1.59));

        Waitress waitress = new Waitress(allMenus);
        waitress.printVegetarianMenu();

    }
}
