import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class RunStaff {
/* �������� ������� �������� ����������, �� ����������� ��� ��� ���������� �� � �� ���������, 
 * �� ���� ����, � ��������� ������ ���������� �� �������, �������� ������ ������ ��� ����������, �������, �� ��������,
 * ����� ����������� ����� ����� � ��������� ��������, �� ��������� ������ ��� ����� � �������.
 * ���� Person ����� �������������� ����������;
 * ���� Staff ������� ����� ����������, ����� ��� ��������� ������ ������ ����������, ������ �����, �� ��������� ������;
 * ���� RunStaff ���������� Main */
	public static void main(String[] args) throws ParseException, NumberFormatException, IOException {
Staff myStaff;
Person [] everybody = {new Person("���������� ", "Traine","TraineJavaDeveloper",356456,false,"22:00"),
		new Person("������","junior","WebDeveloper",256974,true,"15:00"),
		new Person("������","mentor","SoftWare",2534554,false,"11:00"),
		new Person("�����","junior","TvChannelDeveloper",237653,true,"7:00"),
		new Person("�������","senior","WebDeveloper",235464,false,"12:00"),
		new Person("������","mentor","WebDeveloper",234234,true,"23:00")
	};
myStaff = new Staff(everybody);
System.out.println("������ ����������:");
myStaff.printList();
System.out.println("������ ������� ����������:");
myStaff.printList(false);
System.out.println("������ �������� ����������:");
myStaff.printList(true);
Scanner input = new Scanner(System.in);
System.out.println("����� ����������. ������ �������");
String secondname = input.next();
input.close();
String person = myStaff.findPersonBySecondName(secondname);
System.out.println(person);
myStaff.saveToFile("D:Staff.txt");
// ���� �������������� ����� �������� ���� � ������������� ���� ��������,
// �������� ������ ��� ��� ���������� � ���������� ��������� � �������,
// ��� ��������� ������ ������� ����� ��� �������� ����� �����!!!
//Person [] everybody2 = new Person[15];
//Staff myStaff2 = new Staff(everybody2);
//myStaff2.loadFromFile("D:Staff.txt");
//System.out.println("������ ����� ����������:");
//myStaff2.printList();
	}
}