import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;

public class Text extends PCprogramms {
	private double version;
	private String text ="";
	//����������� �����
	public Text(String name,String appointment,double version){
		super(name,appointment);
		this.version=version;
		System.out.println(", ����� "+this.version+" ��������");
	}
@Override
	public void write() throws IOException { //����� ������ ������ 
//		Scanner scan = new Scanner(System.in);
		System.out.println("������ �����");
//		this.text = text + scan.nextLine()+" ";
//		scan.close();
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    text = text +br.readLine()+" ";
	}
@Override
	public void show(){ //��������� ������
	System.out.println("�������� �����:");
	System.out.println(text);	
	}
@Override
	public void clear(){ //�������� ������
	text = "";
	System.out.println("����� �������");
	}
@Override	
	public void save(String fileName){ //���������� ������
		File file = new File(fileName);
		try {
		FileOutputStream fileOut = new FileOutputStream(file);
		ObjectOutputStream outStream = new ObjectOutputStream(fileOut);
		outStream.writeObject(text);
		outStream.close();
		} catch (FileNotFoundException e) {
		System.out.println("����� �� ������� - " +
		e.getMessage() );
		} catch (IOException e) {
		System.out.println("������� ������ ����� - " + e.getMessage() );
		}
		}

//������ �� ���������������� � Calculator, ��������� �������� � � Text, ��� ��� �������� �����
//��������� �� PCprogramms
@Override
public double add(double a, double b) {
	return 0;
}
@Override
public double sub(double a, double b) {
	return 0;
}
@Override
public double mult(double a, double b) {
	return 0;
}
@Override
public double div(double a, double b) {
	return 0;
}
@Override
public double pow(double a, double b) {
	return 0;
}
	}
