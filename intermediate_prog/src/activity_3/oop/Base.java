package activity_3.oop;

public class Base{
    private static String category;
    private static String[] variants;
    private static byte variantChoice;

    public static void run(){
        Food.printMenu(Food.food);
        byte categoryChoice = Food.categoryInput();
        mainSwitch(categoryChoice);
    }

    public static void mainSwitch(int choice){

        switch (choice) {
            case 1 -> burgerChoice();
            case 2 -> pizzaChoice();
            case 3 -> sandwichChoice();
            default -> System.out.println("Invalid entry");
        }
    }

    public static void subSwitch(byte choice, int[] prices){
        double totalPrice = 0;
        String variant;
        switch (choice) {
            case 1 -> {
                variant = variants[0];
                int aQty = Food.quantityInput();
                totalPrice += aQty * prices[0];
                Food.payBill(totalPrice, aQty, variant, category);
            }
            case 2 -> {
                variant = variants[1];
                int bQty = Food.quantityInput();
                totalPrice += bQty * prices[1];
                Food.payBill(totalPrice, bQty, variant, category);
            }
            case 3 -> {
                variant = variants[2];
                int cQty = Food.quantityInput();
                totalPrice += cQty * prices[2];
                Food.payBill(totalPrice, cQty, variant, category);
            }
            default -> System.out.println("Invalid entry");
        }
    }

    public static void burgerChoice(){
        category = "Burger";
        variants = Burger.burgers;
        Food.printSubMenu(Burger.burgers, Burger.burgerPrices);
        variantChoice = Food.categoryInput();
        subSwitch(variantChoice, Burger.burgerPrices);
    }

    public static void pizzaChoice(){
        category = "Pizza";
        variants = Pizza.pizzas;
        Food.printSubMenu(Pizza.pizzas, Pizza.pizzaPrices);
        variantChoice = Food.categoryInput();
        subSwitch(variantChoice, Pizza.pizzaPrices);
    }

    public static void sandwichChoice(){
        category = "Sandwich";
        variants = Sandwich.sandwiches;
        Food.printSubMenu(Sandwich.sandwiches, Sandwich.sandwichPrices);
        variantChoice = Food.categoryInput();
        subSwitch(variantChoice, Sandwich.sandwichPrices);
    }
}