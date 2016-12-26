import java.io.IOException;

public class RunPC {
//�������� �� ��������� ��� ����� ������� ������ � ������ � �������� ��� �� ��.
//����� Calculator � Text � ��������� ����� PCprogramms,
//��� ��������� � ����� ������ ��������.
	public static void main(String[] args) throws IOException {
		double result;
PCprogramms A = new Text("��������� ��������"," ������ �����", 2.0);
PCprogramms B = new Calculator("�����������"," ������ ���������", 3.2);

A.setStart(true);//��������� ��������
B.setStart(true);

A.write();//�������� ����� ������ � ���

result=B.add(65, 13);//�������� ���� ��������� ������
System.out.println(result);
result=B.div(34, 76);
System.out.println(result);
result=B.mult(12, 34);
System.out.println(result);
result=B.pow(23, 2);

A.write();//�������� ��������� ��������� ��������� � ���
A.show();//������� �� ��������� �����
A.save("D:\\SAVE.txt");//��������� ����� � ������������
A.clear();//�������� �������� ����
A.setStart(false);//��������� ��������
B.setStart(false);

	}
}
