
public abstract class PublicTransport {
	private boolean start;
    private int number;
	private int seats;
    private String route;
    private double length;
    
        public boolean setStart(boolean start){
    	this.start=start;
    	return start;}
        public abstract void Move();
        public abstract void PowerOut();
        
        public int setNumber(int number){
        	this.number=number;
        	return number;}
        public int setSeats(int seats){
        	this.seats=seats;
        	return seats;}
        public String setRoute(String route){
        	this.route=route;
        	return route;}
        public double setLength(double length){
        	this.length=length;
        	return length;}
        
        public int getNumber(){
        	return number;}
        public int getSeats(){
        	return seats;}
        public String getRoute(){
        	return route;}
        public double getLength(){
        	return length;}
public PublicTransport(int number,int seats,String route,double length){
	setNumber(number);
	setSeats(seats);
	setRoute(route);
	setLength(length);

}
}
