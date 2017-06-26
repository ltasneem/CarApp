package cars;

public class Car implements iVehicle{
	
	private String carname;
	private double mileage;
	private double speed;
	
	public Car()
	{
		
	}
	
	public Car(String cname, double s)
	{
		carname = cname;
		speed = s;
		System.out.printf("The %s is starting\n", cname);
	}
	
	public void setcarname(String cname)
	{
		carname = cname;
	}
	
	public String getcarname()
	{
		return carname;
	}
	
	public void setmileage(Double m)
	{
		mileage = m;
	}
	
	public double getmileage()
	{
		return mileage;
	}
	
	public void setspeed(double s)
	{
		speed = s;
	}
	
	public double getspeed()
	{
		return speed;
	}

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		System.out.printf("The %s is accelerating\n", getcarname());
		
	}
	
	public void speed() {
		// TODO Auto-generated method stub
		System.out.printf("The %s is going %f speed\n", getcarname(),getspeed());
		
	}
	
	public void echeck() {
		// TODO Auto-generated method stub
		System.out.printf("The %s  has stopped for emission check\n", getcarname());
		
	}
	
	public String stop()
	{
		return "The " + getcarname()+" is  stopping";
	}
	
	public String fly()
	{
		return "The " + getcarname()+" is  now flying";
	} 
	
	public String swim()
	{
		return "The " + getcarname()+" is  now swimming";
	}
	
	public void passing(Car c)
	{
		System.out.println("The "+ getcarname()+ " is passing "+ c.getcarname());
	}

}
