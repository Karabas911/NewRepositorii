import java.io.IOException;

public abstract class PCprogramms {
	private String name;
	private boolean start;
	private int screenHeight;
	private int screenWidth;
	private String appointment;
     
	public String getName(){
		return name;
		}
	public int getScreenHeight(){
		return screenHeight;
		}
	public int getScreenWidth(){
		return screenWidth;
		}
	public String getAppointment(){
		return appointment;
		}
	public void setStart(boolean start){
		this.start=start;
		System.out.println(this.start?"Програма " + name + " запущена":"Програма " + name + " закрита");
//		else (this.start==false) System.out.println("Програма " + name + " запущена");
	}
	public PCprogramms(String name,String appointment){
	this.name=name;
	this.appointment=appointment;
	System.out.print(this.name+", "+this.appointment);
	}
	public abstract void write() throws IOException;
	public abstract void show();
	public abstract void save(String fileName);
	public abstract void clear();
	
	public abstract double add(double a,double b);
	public abstract double sub(double a,double b);
	public abstract double mult(double a,double b);
	public abstract double div(double a,double b);
	public abstract double pow(double a, double b);

}
