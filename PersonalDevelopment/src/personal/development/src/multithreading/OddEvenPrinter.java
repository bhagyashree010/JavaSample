package personal.development.src.multithreading;

public class OddEvenPrinter {

	public static void main(String[] args) {
		
		MyNumber obj = new MyNumber();
		Thread t1 = new Thread(new EvenPrinter(obj));
		t1.setName("1");
		Thread t2 = new Thread(new OddPrinter(obj));
		t2.setName("2");
		
		t1.start();
		t2.start();
		
	}
}

class MyNumber
{
	int num = 0;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
}
