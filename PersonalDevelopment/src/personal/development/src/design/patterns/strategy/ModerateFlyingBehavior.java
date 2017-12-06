package personal.development.src.design.patterns.strategy;

public class ModerateFlyingBehavior implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("This can fly moderately");
	}

}
