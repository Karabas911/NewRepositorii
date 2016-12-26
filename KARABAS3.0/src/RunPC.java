import java.io.IOException;

public class RunPC {
//Програма за допомогою якої можна вирішити задачу з фізики і оформити звіт до неї.
//Класи Calculator і Text є нащадками класу PCprogramms,
//для обрахунків і вводу тексту відповідно.
	public static void main(String[] args) throws IOException {
		double result;
PCprogramms A = new Text("Текстовий процесор"," записує текст", 2.0);
PCprogramms B = new Calculator("Калькулятор"," виконує підрахунки", 3.2);

A.setStart(true);//Запускаємо програми
B.setStart(true);

A.write();//Напишемо назву задачі в звіт

result=B.add(65, 13);//Виконаємо деякі обрахунки Задачі
System.out.println(result);
result=B.div(34, 76);
System.out.println(result);
result=B.mult(12, 34);
System.out.println(result);
result=B.pow(23, 2);

A.write();//Допишемо результат виконаних обрахунків в звіт
A.show();//Глянемо на отриманий текст
A.save("D:\\SAVE.txt");//Збережемо текст з результатами
A.clear();//Очистимо текстове поле
A.setStart(false);//Закриваємо програми
B.setStart(false);

	}
}
