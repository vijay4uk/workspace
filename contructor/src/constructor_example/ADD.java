package constructor_example;

public class ADD {
	int a;
	int b;
	int c;
	public int getMul()
	{
		return(a*b*c);
	}
	
	ADD()
	{
		System.out.println("this is contructor");
	}
	ADD( int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	}

