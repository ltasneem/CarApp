package animals;

public class Bird extends Animal{
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Cat eats ");
		
	}
	
	@Override
	public void eat(String food){
		System.out.println("Bird eats " + food);
	}
	
	
	public void fly()
	{
		System.out.println("Birds fly");
	}
	
	@Override
	public String sound() {
		// TODO Auto-generated method stub
		return "The bird sends a tweet";
	}
	
	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("The birds sleep" );
	}

}
