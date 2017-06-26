package book_database;

public class Book_database {
	
	private String sku;
	private String title;
	private String author;
	private String desc;
	private double price;
	
	public Book_database()
	{
		
	}
	
	public Book_database(String s,String t, String a, String d, double p)
	{
		sku=s;
		title=t;
		author=a;
		desc=d;
		price=p;
	}
	
	public void setsku(String s)
	{
		sku=s;
	}
	
	public String getsku()
	{
		return sku;
	}
	
	public void setitle(String t)
	{
		title = t;
	}
	
	public String gettitle()
	{
		return title;
	}
	
	public void setauthor(String a)
	{
		author=a;
	}
	
	public String getauthor()
	{
		return author;
	}
	
	public void setdesc(String d)
	{
		desc=d;
	}
	
	public String getdesc()
	{
		return desc;
	}
	
	public void setprice(double p)
	{
		price=p;
	}
	
	public double getprice()
	{
		return price;
	}
	
	public String toString()
	{
		return sku+" "+ title+" "+author +" "+desc+" " + price;
	}
	
	public Book_database find_book(String sk)
	{
		Book_database bd;
		
		if(sk.equals("Java1001"))
		{
			bd = new Book_database("Java1001","Head First Java","Kathy Sierra and Bert Bates","Easy to read Java workbook",47.50);
		}
		else if(sk.equals("Java1002"))
		{
			bd = new Book_database("Java1002","Thinking in Java","Bruce Eckel","Details about Java under the hood",20.00);
		}
		else if(sk.equals("Orcl1003"))
		{
			bd = new Book_database("Orcl1003","OCP: Oracle Certified Professional Java SE","Bruce Eckel","Details about Java under the hood",20.00);
		}
		else if(sk.equals("Python1004"))
		{
			bd = new Book_database("Python1004","Automate the Boring Stuff with Python","Bruce Eckel","Details about Java under the hood",20.00);
		}
		else if(sk.equals("Zombie1005"))
		{
			bd = new Book_database("Zombie1005","The Maker's Guide to the Zombie Apocalypse","Bruce Eckel","Details about Java under the hood",20.00);
		}
		else if(sk.equals("Rasp1006"))
		{
			bd = new Book_database("Rasp1006","Raspberry Pi Projects for the Evil Genius","Bruce Eckel","Details about Java under the hood",20.00);
		}
		else
		{
			bd = new Book_database();
		}
		
		return bd;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book_database bd = new Book_database();
		System.out.println(bd.find_book("Rasp1006"));
	}

}
