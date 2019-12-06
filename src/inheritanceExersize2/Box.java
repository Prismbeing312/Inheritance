package inheritanceExersize2;

public class Box {
private String name;
private double volume;
public Box(String name) {
	this.name = name;
	this.volume = getVolume();
}
public double getVolume() {
	return volume;
}
public void setVolume(double volume) {
	this.volume = volume;
}

@Override
public String toString() {
	return "Box [name=" + name + ", volume=" + volume + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}



}
