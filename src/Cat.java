
public class Cat extends Animal{

	public Cat(String name, int legsAmount, String color) {
		super(name, legsAmount, color);
	}

	 @Override
		public void makeSound() {
			System.out.println("Meow");
		}
	
	@Override
	public String toString() {
		return "Cat [getName()=" + getName() + ", getLegsAmount()=" + getLegsAmount() + ", getColor()=" + getColor()
				+ "]";
	}
	
	

}
