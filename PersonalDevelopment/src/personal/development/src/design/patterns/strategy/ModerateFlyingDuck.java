package personal.development.src.design.patterns.strategy;

public class ModerateFlyingDuck extends Duck 
{
	public static void main(String[] args) {
		Duck duck = new ModerateFlyingDuck();
		
		duck.setFlyBehavior(new ModerateFlyingBehavior());
		duck.performFly();
//		duck.performQuack();
	}
}
