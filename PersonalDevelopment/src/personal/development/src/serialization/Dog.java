package personal.development.src.serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Dog extends Animal implements Serializable {

//	transient 
	Collar c ;
	int weight;
	Dog(Collar c, int weight)
	{
		this.c = c;
		this.weight = weight;
	}
	
	/*private void writeObject(ObjectOutputStream os)
	{
		try
		{
			os.defaultWriteObject();
			os.writeInt(c.collarSize);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}
	private void readObject(ObjectInputStream is)
	{
		try
		{
			is.defaultReadObject();
			c = new Collar(is.readInt());
		}
		catch(ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	*/
}

class Collar implements Serializable
{
	int collarSize = 1;
	public Collar(int size) {
		collarSize = size;
	}
}