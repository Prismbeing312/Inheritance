
public class Dog extends Animal{
	private final String breed;

	
	public Dog(String name, int legsAmount, String color, String breed) {
		super(name, legsAmount, color);
		this.breed = breed;
	}


	public String getBreed() {
		return breed;
	}
	
    @Override
	public void makeSound() {
		System.out.println("Woof");
	}


	@Override
	public String toString() {
		return "Dog [getName()=" + getName() + ", getLegsAmount()=" + getLegsAmount() + ", getColor()=" + getColor()
				+ "]";
	}
	
	

}
