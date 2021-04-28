package activity_3.oop;

public class Base{
    public static void run(){
        Food.printMenu(Food.food);
        byte categoryChoice = Food.categoryInput();
        mainSwitch(categoryChoice);
    }

    public static void mainSwitch(int choice){
        byte variantChoice;
        switch(choice){
            case 1:
                Food.printSubMenu(Burger.burgers, Burger.burgerPrices);
                variantChoice = Food.categoryInput();
                subSwitch(variantChoice, Burger.burgerPrices);
                break;
            case 2:
                Food.printSubMenu(Pizza.pizzas, Pizza.pizzaPrices);
                variantChoice = Food.categoryInput();
                subSwitch(variantChoice, Pizza.pizzaPrices);
                break;
            case 3:
                Food.printSubMenu(Sandwich.sandwiches, Sandwich.sandwichPrices);
                variantChoice = Food.categoryInput();
                subSwitch(variantChoice, Sandwich.sandwichPrices);
                break;
            default:
                System.out.println("Invalid entry");
                break;
        }
    }

    public static void subSwitch(byte choice, int[] prices){
        double totalPrice = 0;
        switch(choice){
            case 1:
                int aQty = Food.quantityInput();
                totalPrice += aQty * prices[0];
                Food.printAndPayBill(totalPrice);
                break;
            case 2:
                int bQty = Food.quantityInput();
                totalPrice += bQty * prices[1];
                Food.printAndPayBill(totalPrice);
                break;
            case 3:
                int cQty = Food.quantityInput();
                totalPrice += cQty * prices[2];
                Food.printAndPayBill(totalPrice);
                break;
            default:
                System.out.println("Invalid entry");
                break;
        }
    }
}