
public class Tram extends PublicTransport{
	private String type;
	@Override
	public void Move() {//�������������� ����� �����
		setStart(true);
		System.out.println("������� �"+getNumber()+" ����� � ����");
	}
	@Override
	public void PowerOut() {// �������������� ����� ����� � ����
		setStart(false);
		System.out.println("������� �"+getNumber()+" ���������");
			}
	public Tram(int number,int seats,String route,double length,String type){
		super(number,seats,route,length);
		this.type=type;
		System.out.println("�������� ������� ����� �"+getNumber()+" � ������� ���� "+getSeats()+" � ��������� "+ getRoute()+" ������� ����� "+getLength()+ "��, "+this.type);
}
}