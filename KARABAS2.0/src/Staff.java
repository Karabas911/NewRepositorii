import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Staff{
	private Person[] everybody; //��������� ������ ����� ���� Person
	public Staff(Person[] list){
		everybody=list;
	}
	public void printList() {//���� ��� ����������
		for(Person person : everybody){
			System.out.println(person);
		}
	}
	public void printList(boolean presence){//���� ������� ��� ������� ����������
		for (Person person : everybody) {
		if (person.presence() == presence)System.out.println(person);
		}
		}
	public String findPersonBySecondName (String secondname){//����� ���������� �� ��������
		String result="";
		for (Person person : everybody){
		if (person.getSecondname().contains( secondname))
			result+=person.toString() + "\n";
	}
	return result.isEmpty()?"ͳ���� �� ��������":result;
}
	public void saveToFile(String fileName){//����� ����� � ��������� ��������
		File file = new File(fileName);
		try {
		FileOutputStream fileOut = new FileOutputStream(file);
		ObjectOutputStream outStream = new ObjectOutputStream(fileOut);
		for(Person person : everybody){
		outStream.writeObject(person);
		}
		outStream.close();
		} catch (FileNotFoundException e) {
		System.out.println("���� ��� ������ ����� �� �������� - " +
		e.getMessage() );
		} catch (IOException e) {
		System.out.println("������� ������ ����� - " + e.getMessage() );
		}
		}
	
	public void loadFromFile(String fileName){//������������ ������ � ���������� ���������
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
		System.out.println("�� �������� ���� � ������ - " + e.getMessage() );
		}catch (ClassNotFoundException e) {
		System.out.println("������� � �������� ����� - " + e.getMessage() );
		} catch (IOException e) {
		System.out.println("������� ������� ����� - " + e.getMessage() );
		}
		}
}
