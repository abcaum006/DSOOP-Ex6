public class App {

    public static void main(String[] args) {
        Beverage plainBeverage = new PlainBeverage();
        Beverage milkBeverage = new MilkDecorator(plainBeverage);
        Beverage sugarBeverage = new SugarDecorator(milkBeverage);
        Beverage sugarMilkBeverage = new SugarDecorator(sugarBeverage);

        System.out.println("You order " + plainBeverage.getDescription());
        System.out.println("The cost is " + plainBeverage.getCost());

        System.out.println();

        System.out.println("You order " + milkBeverage.getDescription());
        System.out.println("The cost is " + milkBeverage.getCost());

        System.out.println();

        System.out.println("You order " + sugarBeverage.getDescription());
        System.out.println("The cost is " + sugarBeverage.getCost());

        System.out.println();

        System.out.println("You order " + sugarMilkBeverage.getDescription());
        System.out.println("The cost is " + sugarMilkBeverage.getCost());
    }
}