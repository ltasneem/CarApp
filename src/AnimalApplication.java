import animals.Animal;
import animals.Bird;
import animals.Cat;

public class AnimalApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Animal();
		a.eat();
		a.eat("banana");
		a.sleep();
		System.out.println(a.sound());
		
		Cat c = new Cat();
		c.eat();
		c.eat("tuna fish");
		c.sleep();
		System.out.println(c.sound());
		c.scratch();
		
		Bird b = new Bird();
		b.eat();
		b.eat("sunflower seeds");
		b.sleep();
		System.out.println(b.sound());
		b.fly();

	}

}
