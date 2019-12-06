
public class Animal {
private String name;
private int legsAmount;
private String Color;
public Animal(String name, int legsAmount, String color) {
	this.name = name;
	this.legsAmount = legsAmount;
	Color = color;
}

public Animal(String name, int legsAmount) {
	this.name = name;
	this.legsAmount = legsAmount;
	this.Color = "Brown";
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getLegsAmount() {
	return legsAmount;
}
public void setLegsAmount(int legsAmount) {
	this.legsAmount = legsAmount;
}
public String getColor() {
	return Color;
}
public void setColor(String color) {
	Color = color;
}

public void makeSound() {
	System.out.println("?");
}
@Override
public String toString() {
	return "Animal [name=" + name + ", legsAmount=" + legsAmount + ", Color=" + Color + "]";
}

}
