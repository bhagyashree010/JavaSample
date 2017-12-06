package personal.development.src.design.patterns.strategy;

public class NoFlyBehaviour implements FlyBehavior
{
	@Override
	public void fly() {
		System.out.println("This can not fly ..");
		
	}

}
