package personal.development.src.design.patterns.factory;

import java.util.Scanner;

public class PizzaStore {

	public static void main(String[] args) {
		
		System.out.println("Enter style: ");
		Scanner scanner = new Scanner(System.in);
		String pizzaStore = scanner.nextLine();
		
		Pizza pizza = null;
		if(pizzaStore.equals("US"))
		{
			System.out.println("Enter type : ");

			String type = scanner.nextLine();
			pizza = new USPizzaMaker().orderPizza(type);
		}
		else if(pizzaStore.equals("Asian"))
		{
			System.out.println("Enter type : ");

			String type = scanner.nextLine();
			pizza = new AsianPizzaMaker().orderPizza(type);
		}
		
		System.out.println("Pizza is created :: "+pizza.toString());
		
	}
}
