
public class Tram extends PublicTransport{
	private String type;
	@Override
	public void Move() {//перезагружений метод Їхати
		setStart(true);
		System.out.println("трамвай №"+getNumber()+" виїхав з депо");
	}
	@Override
	public void PowerOut() {// перезагружений метод Вийти з ладу
		setStart(false);
		System.out.println("Трамвай №"+getNumber()+" зупинився");
			}
	public Tram(int number,int seats,String route,double length,String type){
		super(number,seats,route,length);
		this.type=type;
		System.out.println("Створено трамвай номер №"+getNumber()+" з кількістю місць "+getSeats()+" з маршрутом "+ getRoute()+" довжина якого "+getLength()+ "км, "+this.type);
}
}