package personal.development.src.design.patterns.factory;

public abstract class PizzaMaker 
{
	public abstract Pizza createPizza(String type);
	public Pizza orderPizza(String type)
	{
		return createPizza(type);
	}
	
}
