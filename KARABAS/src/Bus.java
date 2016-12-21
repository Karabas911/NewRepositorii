
public class Bus extends PublicTransport {
	private String type; 
	@Override
	public void Move() {//перезагружений метод Їхати
		setStart(true); 
		System.out.println("автобус №"+getNumber()+" виїхав з автостанції");
	}
	@Override
	public void PowerOut() {// перезагружений метод Вийти з ладу
	}
	
	public Bus(int number,int seats,String route,double length,String type){
		super(number,seats,route,length);
		this.type=type;
		System.out.println("Створено автобус номер №"+getNumber()+" з кількістю місць "+getSeats()+" з маршрутом "+ getRoute()+" довжина якого "+getLength()+ "км, "+ this.type);
	}
}
