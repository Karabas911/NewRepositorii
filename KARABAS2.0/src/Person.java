import java.io.Serializable;

public class Person implements Serializable  {
	private String secondname; // Властивост працівника
	private String position; 
	private String department;
	private int idnumber;
	private boolean presence;
	private String time;
	public String getSecondname(){
	return secondname;
	}
	public String getPosition(){
	return position;
	}
	public String getDepartment(){
	return department;
	}
	public int getIdnember(){
	return idnumber;
	}
	public boolean presence(){
	return presence;
	}
	public String getTime(){
		return time;
	}
	public Person (String secondname, String position,String department,int idnumber,boolean presence,String time){
	this.secondname=secondname;
	this.position=position;
	this.department=department;
	this.idnumber=idnumber;
	this.presence=presence;
	this.time=time;}
	
	@Override
	public String toString(){
		return secondname +", "+position+", "+department+", "+idnumber+", "+ (presence()? "присутній, час останнього входу":"відсутній, час останнього виходу")+": "+time;
	}
	}