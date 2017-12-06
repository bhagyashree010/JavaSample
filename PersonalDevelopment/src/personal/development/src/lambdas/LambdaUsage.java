package personal.development.src.lambdas;

public class LambdaUsage {

	public static void main(String[] args) {
		
		LambdaUsage obj = new LambdaUsage();
		
		/*
		 * Java 7 ways - Anonymous interface implementation
		 */
		obj.addStateListener(new MyEventListener() {
			
			@Override
			public int onStateChange(int oldState, int newState) {
				System.out.println("state changed from: "+oldState+" : to : "+newState);
				return oldState + newState;
				
			}
		});
		
		/*
		 * Java 8 Using lamdas
		 */
		
		obj.addStateListener(
				(oldState, newState) -> 
					{
						System.out.println("This is getting called via lamda"+oldState+"::"+newState);
						return oldState + newState;
					}
				);
		
	}
	
	public void addStateListener(MyEventListener listener)
	{
		int i = listener.onStateChange(2, 4);
		System.out.println(i);
	}
}
