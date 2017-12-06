package personal.development.src.design.patterns.factory;

public class USPizzaMaker extends PizzaMaker
{

	@Override
	public Pizza createPizza(String type) {

		Pizza pizza = null;
		if(type.equals("Chicken"))
		{
			pizza = new USBasicChickenPizza();
			pizza.base = "Chicken";
		}
		else if(type.equals("Chicken Barbeque"))
		{
			pizza = new USChickenBarbequePizza();
			pizza.base = "Barbeque sauce";
		}
		
		return pizza;
	
	}

}
