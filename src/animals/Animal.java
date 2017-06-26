package animals;

public class Animal implements iAnimal {

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("animals sleep" );
	}
	
	
	public void eat(String food){
		System.out.println("animal eats " + food);
	}
	
	public void eat(String food,int quantity){

		System.out.println("animal eats " + food + " of "+ quantity +" amount");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("animal eats");
		
	}

	@Override
	public String sound() {
		// TODO Auto-generated method stub
		return "animal make sounds";
	}
	

}
