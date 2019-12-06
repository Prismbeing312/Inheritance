package inhderitanceExersize;

public class Worker extends Person{
private String workPlace;
private int veteran;
public Worker(String name, int id, int age, String workPlace, int veteran) {
	super(name, id, age);
	this.workPlace = workPlace;
	this.veteran = veteran;
}


public String getWorkPlace() {
	return workPlace;
}


public void setWorkPlace(String workPlace) {
	this.workPlace = workPlace;
}


public int getVeteran() {
	return veteran;
}


public void setVeteran(int veteran) {
	this.veteran = veteran;
}


public String printWorker() {
	String a = this.printBaic();
	return String.format("\n Basic info: %s, \n New info: \n workplace: %s \n verterency: %d", a, getWorkPlace(), getVeteran());
}
}
