import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Staff{
	private Person[] everybody; //Створення масиву обєктів типу Person
	public Staff(Person[] list){
		everybody=list;
	}
	public void printList() {//друк всіх працівників
		for(Person person : everybody){
			System.out.println(person);
		}
	}
	public void printList(boolean presence){//друк наявних або відсутніх працівників
		for (Person person : everybody) {
		if (person.presence() == presence)System.out.println(person);
		}
		}
	public String findPersonBySecondName (String secondname){//пошук працівника за прізвищем
		String result="";
		for (Person person : everybody){
		if (person.getSecondname().contains( secondname))
			result+=person.toString() + "\n";
	}
	return result.isEmpty()?"Нічого не знайдено":result;
}
	public void saveToFile(String fileName){//запис даних в текстовий документ
		File file = new File(fileName);
		try {
		FileOutputStream fileOut = new FileOutputStream(file);
		ObjectOutputStream outStream = new ObjectOutputStream(fileOut);
		for(Person person : everybody){
		outStream.writeObject(person);
		}
		outStream.close();
		} catch (FileNotFoundException e) {
		System.out.println("Файл для запису даних не створено - " +
		e.getMessage() );
		} catch (IOException e) {
		System.out.println("Помилка запису даних - " + e.getMessage() );
		}
		}
	
	public void loadFromFile(String fileName){//завантаження данних з текстового документу
		File file = new File(fileName);
		int i = 0;
		Person person=null;
		ObjectInputStream inStream = null;
		try {
		FileInputStream fileIn = new FileInputStream(file);
		inStream = new ObjectInputStream(fileIn);
		if(inStream != null){
		while(true){
		person = (Person) inStream.readObject();
		if(person==null)break;
		everybody[i++] = person;
		}
		inStream.close();
		}
		} catch (FileNotFoundException e) {
		System.out.println("Не знайдено файл з даними - " + e.getMessage() );
		}catch (ClassNotFoundException e) {
		System.out.println("Помилка в структурі даних - " + e.getMessage() );
		} catch (IOException e) {
		System.out.println("Помилка читання даних - " + e.getMessage() );
		}
		}
}
