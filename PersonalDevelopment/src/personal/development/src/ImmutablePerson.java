package personal.development.src;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import com.sun.javafx.UnmodifiableArrayList;

public class ImmutablePerson {

	public static void main(String[] args) 
	{
		List<String> hobbies = new ArrayList<>();
		hobbies.add("Photography");
		hobbies.add("Movies");
		hobbies.add("Painting");
		
		int[] bankNos = {12, 33, 44, 55};
		Person person = new Person("Bhagya", new Date("13/03/1988"), hobbies, bankNos);
		
		System.out.println("Before Person details : "+person.toString());
		
		
		Date bithdate = person.getBirthDate();
//		bithdate.setTime(System.currentTimeMillis());
		Calendar cal = Calendar.getInstance();
		cal.setTime(bithdate);
		cal.add(Calendar.DATE, 3);
		bithdate.setTime(cal.getTime().getTime());
		
		
		String name = person.getName();
		name.concat("ha");
		
		hobbies = person.getHobbies();
//		hobbies.add("Corrupt");
		
		bankNos = person.getBankNumbers();
		bankNos[0]= 8888;
		System.out.println("After : "+person.toString());
		
	}
}


class Person
{
	
	private final String name ;
	private final Date birthDate;
	private final List<String> hobbies ;
	private final int[] bankNumbers;
	public Person(String name, Date date, List<String> hobbies, int[] bankNos)
	{
		this.name = name;
		birthDate = date;
		this.hobbies = hobbies;
		bankNumbers = bankNos;
	}

	public String getName() {
		return name;
	}

	public Date getBirthDate() {
		return (Date) birthDate.clone();
	}

	public List<String> getHobbies() {
		return Collections.unmodifiableList(hobbies);
	}
	
	
	public int[] getBankNumbers() {
		return bankNumbers;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name: "+name + " Birthdate : "+birthDate+"  Hobbies : "
				+ hobbies+ "Banks numbers: "
						+ " "+bankNumbers[0]+" : "+bankNumbers[1]+" : "+bankNumbers[2];
	}
}