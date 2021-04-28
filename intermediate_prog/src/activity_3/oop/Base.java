package activity_3.oop;

public class Base {
    public static void run(){
        Food.printMenu(Food.food);
        byte categoryChoice = Food.categoryInput();
        mainSwitch(categoryChoice);
    }

    public static void mainSwitch(int choice){
        byte variantChoice;
        switch(choice){
            case 1:
                Food.printMenu(Burger.burgers);
                variantChoice = Food.categoryInput();
                subSwitch(variantChoice, Burger.burgerPrices);
                break;
            case 2:
                Food.printMenu(Pizza.pizzas);
                variantChoice = Food.categoryInput();
                subSwitch(variantChoice, Pizza.pizzaPrices);
                break;
            case 3:
                Food.printMenu(Sandwich.sandwiches);
                variantChoice = Food.categoryInput();
                subSwitch(variantChoice, Sandwich.sandwichPrices);
                break;
            default:
                System.out.println("Invalid entry");
                mainSwitch(choice);
        }
    }

    public static void subSwitch(byte choice, int[] prices){
        double totalPrice = 0;
        switch(choice){
            case 1:
                int aQty = Food.quantityInput();
                totalPrice += aQty * prices[0];
                break;
            case 2:
                int bQty = Food.quantityInput();
                totalPrice += bQty * prices[1];
                break;
            case 3:
                int cQty = Food.quantityInput();
                totalPrice += cQty * prices[2];
                break;
            default:
                System.out.println("Invalid entry");
                subSwitch(choice, prices);
        }
    }
}
