package personal.development.src.design.patterns.factory;

public class AsianPizzaMaker extends PizzaMaker
{

	@Override
	public Pizza createPizza(String type) {

		Pizza pizza = null;
		if(type.equals("Chicken"))
		{
			pizza = new AsianBasicChickenPizza();
			pizza.base = "Chicken";
		}
		else if(type.equals("Chicken Barbeque"))
		{
			pizza = new AsianChickenBarbequePizza();
			pizza.base = "Barbeque sauce";
		}
		
		return pizza;
	
	}

}
