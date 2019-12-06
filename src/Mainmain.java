
public class Mainmain {

	public static void main(String[] args) {
		Cat one = new Cat("kuchi", 3, "yellow");
        System.out.println(one);
        one.makeSound();
        Dog two = new Dog("Melow", 4, "brown and yellow", "Mixed");
        System.out.println(two);
        two.makeSound();
	}

}
