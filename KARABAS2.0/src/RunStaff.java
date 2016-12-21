import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class RunStaff {
/* Програма симулює прохідну підприємства, де зберігаються дані про працівників які є на підприємстві, 
 * та яких нема, є можливість пошуку працівника по прізвищу, програма окремо виписує всіх працівників, відсутніх, та присутніх,
 * також реалізований запис даних в текстовий документ, та можливість запису тих даних в консоль.
 * Клас Person описує характеристики працівника;
 * Клас Staff створює масив працівників, також там реалізовані методи пошуку працівника, запису даних, та вилучення данних;
 * Клас RunStaff реалізовано Main */
	public static void main(String[] args) throws ParseException, NumberFormatException, IOException {
Staff myStaff;
Person [] everybody = {new Person("Карабиньош ", "Traine","TraineJavaDeveloper",356456,false,"22:00"),
		new Person("Голомб","junior","WebDeveloper",256974,true,"15:00"),
		new Person("Коваль","mentor","SoftWare",2534554,false,"11:00"),
		new Person("Ярчич","junior","TvChannelDeveloper",237653,true,"7:00"),
		new Person("Клинець","senior","WebDeveloper",235464,false,"12:00"),
		new Person("Вучкан","mentor","WebDeveloper",234234,true,"23:00")
	};
myStaff = new Staff(everybody);
System.out.println("Список працівників:");
myStaff.printList();
System.out.println("Список відсутніх працівників:");
myStaff.printList(false);
System.out.println("Список присутніх працівників:");
myStaff.printList(true);
Scanner input = new Scanner(System.in);
System.out.println("Пошук працівника. Введіть прізвище");
String secondname = input.next();
input.close();
String person = myStaff.findPersonBySecondName(secondname);
System.out.println(person);
myStaff.saveToFile("D:Staff.txt");
// Якщо розкоментувати нижче приведені поля і закоментувати вище приведені,
// програма запише дані про працівника з текстового документу в консоль,
// Для правильної роботи потрібно хочаб раз виконати запис даних!!!
//Person [] everybody2 = new Person[15];
//Staff myStaff2 = new Staff(everybody2);
//myStaff2.loadFromFile("D:Staff.txt");
//System.out.println("Список нових працівників:");
//myStaff2.printList();
	}
}