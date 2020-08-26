package global.citytech.tdd;

import org.junit.Test;

import static org.junit.Assert.*;

public class coffeeTest {

    @Test(expected = IllegalArgumentException.class)
    public void doInitialTesting() {
        Coffee c = new Coffee();
        c.testCoffeeInitial();
    }

    @Test
    public void doTakeInitialValueTesting() {
        Coffee c = new Coffee();
        int waterLeft = c.getWater();
        int milkLeft = c.getMilk();
        int coffeeBeansLeft = c.getCoffeeBeans();
        int cupsLeft = c.getNumberOfCups();
        int MoneyLeft = c.getMoney();
        assertEquals(400, waterLeft);
        assertEquals(540, milkLeft);
        assertEquals(120, coffeeBeansLeft);
        assertEquals(9, cupsLeft);
        assertEquals(550, MoneyLeft);
    }

    @Test
    public void doWaterAddTesting() {
        Coffee c = new Coffee();
        c.addWater(2000);
        int waterLeft = c.getWater();
        assertEquals(2400, waterLeft);
    }

    @Test
    public void doMilkAddTesting() {
        Coffee c = new Coffee();
        c.addMilk(500);
        int milkLeft = c.getMilk();
        assertEquals(1040, milkLeft);
    }

    @Test
    public void doCoffeeBeansAddTesting() {
        Coffee c = new Coffee();
        c.addCoffeeBeans(100);
        int coffeeBeansLeft = c.getCoffeeBeans();
        assertEquals(220, coffeeBeansLeft);
    }

    @Test
    public void doCupAddTesting() {
        Coffee c = new Coffee();
        c.addCups(10);
        int numberOfCups = c.getNumberOfCups();
        assertEquals(19, numberOfCups);
    }

    @Test
    public void doRefillTesting() {
        Coffee c = new Coffee();
        c.refillItems(2000, 500, 100, 10);
        int waterLeft = c.getWater();
        int milkLeft = c.getMilk();
        int numberOfCups = c.getNumberOfCups();
        int coffeeBeansLeft = c.getCoffeeBeans();
        assertEquals(2400, waterLeft);
        assertEquals(1040, milkLeft);
        assertEquals(220, coffeeBeansLeft);
        assertEquals(19, numberOfCups);
    }

    @Test
    public void doMakeEspressoTesting() {
        Coffee c = new Coffee();
        c.makeEspresso();
        int waterLeft = c.getWater();
        int milkLeft = c.getMilk();
        int coffeeBeansLeft = c.getCoffeeBeans();
        int numberOfCups = c.getNumberOfCups();
        int moneyLeft = c.getMoney();
        assertEquals(150, waterLeft);
        assertEquals(540, milkLeft);
        assertEquals(104, coffeeBeansLeft);
        assertEquals(8, numberOfCups);
        assertEquals(554, moneyLeft);
    }

    @Test
    public void doMakeLatteTesting() {
        Coffee c = new Coffee();
        c.makeLatte();
        int waterLeft = c.getWater();
        int milkLeft = c.getMilk();
        int coffeeBeansLeft = c.getCoffeeBeans();
        int numberOfCups = c.getNumberOfCups();
        int moneyLeft = c.getMoney();
        assertEquals(50, waterLeft);
        assertEquals(465, milkLeft);
        assertEquals(100, coffeeBeansLeft);
        assertEquals(8, numberOfCups);
        assertEquals(557, moneyLeft);
    }

    @Test
    public void doMakeCappuccinoTesting() {
        Coffee c = new Coffee();
        c.makeCappuccino();
        int waterLeft = c.getWater();
        int milkLeft = c.getMilk();
        int coffeeBeansLeft = c.getCoffeeBeans();
        int numberOfCups = c.getNumberOfCups();
        int moneyLeft = c.getMoney();
        assertEquals(200, waterLeft);
        assertEquals(440, milkLeft);
        assertEquals(108, coffeeBeansLeft);
        assertEquals(8, numberOfCups);
        assertEquals(556, moneyLeft);
    }

    @Test
    public void doTakeMoneyTesting() {
        Coffee c = new Coffee();
        int moneyReceived = c.takeMoney();
        int moneyLeft = c.getMoney();
        assertEquals(550, moneyReceived);
        assertEquals(0, moneyLeft);
    }

    @Test
    public void doCanMakeEspressoTesting() {
        Coffee c = new Coffee();
        c.checkNewCoffeePossible(1);
        c.printMachineStatus();
    }

    @Test(expected = IllegalArgumentException.class)
    public void doCanMakeEspressoAgainFailTesting() {
        Coffee c = new Coffee();
        c.makeEspresso();
        c.checkNewCoffeePossible(1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void doCanMakeLatteAgainFailTesting() {
        Coffee c = new Coffee();
        c.makeLatte();
        c.checkNewCoffeePossible(2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void doCanMakeCappuccinoAgainFailTesting() {
        Coffee c = new Coffee();
        c.makeCappuccino();
        c.makeCappuccino();
        c.checkNewCoffeePossible(3);
    }
}
