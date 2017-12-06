package personal.development.src.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeDog {

	public static void main(String[] args) {
		
		Collar c = new Collar(45);
		Dog dog = new Dog(c, 566);
		dog.name = "Hitler";
		try
		{
			FileOutputStream fo = new FileOutputStream("SerializeDog.txt");
			ObjectOutputStream os = new ObjectOutputStream(fo);
			
			os.writeObject(dog);
			os.close();

			System.out.println("After writing: Collar size : "
			+dog.c.collarSize+ "Dog weight :: "+dog.weight+" name ::"+ dog.name);
			
			
			FileInputStream fis = new FileInputStream("SerializeDog.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			try 
			{
				dog = (Dog) ois.readObject();
			}
			catch (ClassNotFoundException e) 
			{
				e.printStackTrace();
			}
			
			System.out.println("After Reading: Collar size : "
					+dog.c.collarSize+ "Dog weight :: "+dog.weight+" name ::"+ dog.name);
					
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}
}

