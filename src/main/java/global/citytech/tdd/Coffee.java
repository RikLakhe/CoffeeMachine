package global.citytech.tdd;

public class Coffee {
    private int machineMoney;
    private int machineWater;
    private int machineMilk;
    private int machineCoffeeBeans;
    private int numberOfCups;

    public Coffee() {
        machineMoney = 550;
        machineWater = 400;
        machineMilk = 540;
        machineCoffeeBeans = 120;
        numberOfCups = 9;
    }

    public void testCoffeeInitial() {
        throw new IllegalArgumentException("Test is connected");
    }

    public int getWater() {
        return machineWater;
    }

    public int getMilk() {
        return machineMilk;
    }

    public int getCoffeeBeans() {
        return machineCoffeeBeans;
    }

    public int getNumberOfCups() {
        return numberOfCups;
    }

    public int getMoney() {
        return machineMoney;
    }

    public void addWater(int newWaterAdded) {
        this.machineWater = this.machineWater + newWaterAdded;
    }

    public void addMilk(int newMilkAdded) {
        this.machineMilk = this.machineMilk + newMilkAdded;
    }

    public void addCoffeeBeans(int newCoffeeBeansAdded) {
        this.machineCoffeeBeans = this.machineCoffeeBeans + newCoffeeBeansAdded;
    }

    public void addCups(int newCupsAdded) {
        this.numberOfCups = this.numberOfCups + newCupsAdded;
    }

    public void refillItems(
            int newWaterAdded,
            int newMilkAdded,
            int newCoffeeBeansAdded,
            int newCupsAdded) {
        this.machineWater = this.machineWater + newWaterAdded;
        this.machineMilk = this.machineMilk + newMilkAdded;
        this.machineCoffeeBeans = this.machineCoffeeBeans + newCoffeeBeansAdded;
        this.numberOfCups = this.numberOfCups + newCupsAdded;
    }

    public void checkNewCoffeePossible(int choice) {
        int maxWater = 0;
        int maxMilk = 0;
        int maxCoffeeBeans = 0;
        int maxCups = 0;
        if (choice == 1) {
            maxWater = 250;
            maxCoffeeBeans = 16;
            maxCups = 1;
        } else if (choice == 2) {
            maxWater = 350;
            maxMilk = 75;
            maxCoffeeBeans = 20;
            maxCups = 1;
        } else {
            maxWater = 200;
            maxMilk = 100;
            maxCoffeeBeans = 12;
            maxCups = 1;
        }

        if (this.machineWater < maxWater) {
            throw new IllegalArgumentException("Sorry, Not enough water!");
        }
        if ((choice == 2 || choice == 3) && this.machineMilk < maxMilk) {
            throw new IllegalArgumentException("Sorry, Not enough milk!");
        }
        if (this.machineCoffeeBeans < maxCoffeeBeans) {
            throw new IllegalArgumentException("Sorry, Not enough coffee beans!");
        }
        if (this.numberOfCups < maxCups) {
            throw new IllegalArgumentException("Sorry, Not enough cups!");
        }
    }

    public void makeEspresso() {
        try {
            checkNewCoffeePossible(1);
            this.machineWater = this.machineWater - 250;
            this.machineCoffeeBeans = this.machineCoffeeBeans - 16;
            this.numberOfCups = this.numberOfCups - 1;
            this.machineMoney = this.machineMoney + 4;
            System.out.println("I have enough resources, making you a coffee!");
            System.out.println("");
        } catch (IllegalArgumentException err) {
            System.out.println(err.getMessage());
            System.out.println("");
        }
    }

    public void makeLatte() {
        try {
            checkNewCoffeePossible(2);
            this.machineWater = this.machineWater - 350;
            this.machineMilk = this.machineMilk - 75;
            this.machineCoffeeBeans = this.machineCoffeeBeans - 20;
            this.numberOfCups = this.numberOfCups - 1;
            this.machineMoney = this.machineMoney + 7;
            System.out.println("I have enough resources, making you a coffee!");
            System.out.println("");
        } catch (IllegalArgumentException err) {
            System.out.println(err.getMessage());
            System.out.println("");
        }
    }

    public void makeCappuccino() {
        try {
            checkNewCoffeePossible(3);
            this.machineWater = this.machineWater - 200;
            this.machineMilk = this.machineMilk - 100;
            this.machineCoffeeBeans = this.machineCoffeeBeans - 12;
            this.numberOfCups = this.numberOfCups - 1;
            this.machineMoney = this.machineMoney + 6;
            System.out.println("I have enough resources, making you a coffee!");
        } catch (IllegalArgumentException err) {
            System.out.println(err.getMessage());
        }

    }

    public int takeMoney() {
        int money = this.machineMoney;
        this.machineMoney = 0;
        return money;
    }

    public void printMachineStatus() {
        System.out.println("The coffee machine has:");
        System.out.println(this.machineWater + " of water");
        System.out.println(this.machineMilk + " of milk");
        System.out.println(this.machineCoffeeBeans + " of coffee beans");
        System.out.println(this.numberOfCups + " of disposable cups");
        System.out.println((this.machineMoney>0 ? "$" : "") + this.machineMoney + " of money");
        System.out.println("");
    }
}