
public class Calculator extends PCprogramms {
private double version;
@Override
	public double add(double a,double b){
		return a+b;
	}
@Override
	public double sub(double a,double b){
		return a-b;
	}
@Override
	public double mult(double a,double b){
		return a*b;
	}
@Override
	public double div(double a,double b){
		return a/b;
	}
@Override
	public double pow(double a,double b){
		return Math.pow(a, b);
	}
//����������� �����
	public Calculator(String name,String appointment,double version){
		super(name,appointment);
		this.version=version;
		System.out.println(", ����� "+this.version+" ��������");
	}
	
	//������ �� ���������������� � Text, ��������� �������� � � Calculator, ��� ��� �������� �����
	//��������� �� PCprogramms
	@Override
	public void write() {
	}
	@Override
	public void show() {
	}
	@Override
	public void save(String fileName) {	
	}
	@Override
	public void clear(){
	}
	
}
