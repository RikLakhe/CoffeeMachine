package global.citytech.tdd;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Coffee c = new Coffee();

        loop: while(true){
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String choice = sc.next();
            System.out.println("");
            switch(choice){
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                    String coffeeChoice = sc.next();
                    if(coffeeChoice.equals("1")){
                        c.makeEspresso();
                    }else if(coffeeChoice.equals("2")){
                        c.makeLatte();
                    }else if(coffeeChoice.equals("3")){
                        c.makeCappuccino();
                    }else if(coffeeChoice.equals("back")){
                        System.out.println("");
                        break;
                    }else{
                        System.out.println("Invalid input!");
                    }
                    break;
                case "fill":
                    System.out.println("Write how many ml of water do you want to add:");
                    int newWater = sc.nextInt();
                    c.addWater(newWater);
                    System.out.println("Write how many ml of milk do you want to add:");
                    int newMilk = sc.nextInt();
                    c.addMilk(newMilk);
                    System.out.println("Write how many grams of coffee beans do you want to add:");
                    int newCoffeeBeans = sc.nextInt();
                    c.addCoffeeBeans(newCoffeeBeans);
                    System.out.println("Write how many disposable cups of coffee do you want to add:");
                    int newCups = sc.nextInt();
                    c.addCups(newCups);
                    System.out.println("");
                    break;
                case "take":
                    int takeAll = c.takeMoney();
                    System.out.println("I gave you $"+takeAll);
                    System.out.println("");
                    break;
                case "remaining":
                    c.printMachineStatus();
                    break;
                case "exit":
                    break loop;
                default:
                    System.out.println("Invalid input!");
            }
        }
    }
}
