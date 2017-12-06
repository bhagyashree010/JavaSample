package personal.development.src.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializableExample {

	public static void main(String[] args) {
		
		try
		{
			System.out.println("Serialization starts.. ");
			SerializableClass obj = new SerializableClass(4747, 777);
			FileOutputStream fos = new FileOutputStream(new File("Serializexa.ser"));
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(obj);
			
			System.out.println("Serialization ends..");
			
			FileInputStream fis = new FileInputStream(new File("Serializexa.ser"));
			ObjectInputStream ois = new ObjectInputStream(fis);
			SerializableClass objRead =  (SerializableClass) ois.readObject();
			System.out.println(objRead.toString());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
}

class SomeClass
{
	
}

class SerializableClass implements Serializable
{
	private	transient int n ;
	
	transient int num2;
	private SomeClass cls;
	public SerializableClass(int num, int nu2)
	{
		n = num;
		num2 = nu2;
	}
	
	private void writeObject(ObjectOutputStream os)
	{
		try {
			os.defaultWriteObject();
			os.writeInt(n);
			os.writeInt(num2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void readObject(ObjectInputStream is)
	{
		try {
			is.defaultReadObject();
			n =is.readInt();
			num2 = is.readInt();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return n+" ;) "+num2+cls;
	}
}