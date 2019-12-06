package inhderitanceExersize;

public class Driver extends Worker{
private String bloodType;
private int numLisence;
private String typeLicense;

public Driver(String name, int id, int age, String workPlace, int veteran, String bloodType, int numLisence,
		String typeLicense) {
	super(name, id, age, workPlace, veteran);
	this.bloodType = bloodType;
	this.numLisence = numLisence;
	this.typeLicense = typeLicense;
}

public String getBloodType() {
	return bloodType;
}

public void setBloodType(String bloodType) {
	this.bloodType = bloodType;
}

public int getNumLisence() {
	return numLisence;
}

public void setNumLisence(int numLisence) {
	this.numLisence = numLisence;
}

public String getTypeLicense() {
	return typeLicense;
}

public void setTypeLicense(String typeLicense) {
	this.typeLicense = typeLicense;
}

public String printDriver() {
	return String.format("\n Original info: %s \n Driver info: \nBlood Type: %s \n Lisence Num: %d \n Lisence Type: %s", printWorker(), getBloodType(), getNumLisence(), getTypeLicense());
}

}
