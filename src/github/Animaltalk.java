package github;

public class Animaltalk {
	public static void main(String[]args) {
		Dog aDog=new Dog();
		Pig aPig=new Pig();
		Snake aSnake=new Snake();
		Animals animal;
		animal=aDog;
		animal.talk();
		animal=aPig;
		animal.talk();
		animal=aSnake;
		animal.talk();
	}

}
class Animals{
	private int legs=4;
	public void talk() {
		System.out.println("Animals can't talk !");
	}
}
class Dog extends Animals{
	public void talk() {
		System.out.println("Dog:bowwow");
	}
}

class Pig extends Animals{
	public void talk() {
		System.out.println("Pig:onikonik");
	}
}

class Snake extends Animals{
	private int legs=0;
}


