package cars;

public class CarApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car p = new Car("Red Porsche", 50);
		Car b = new Car("Blue Jetta", 70);
		
		p.accelerate();
		b.accelerate();
		
		System.out.println(p.stop());
		System.out.println(b.stop());
		
		p.speed();
		b.speed();
		
		p.passing(b);
		
		p.echeck();
		
		System.out.println(p.fly());
		System.out.println(b.swim());
		
		

	}

}
