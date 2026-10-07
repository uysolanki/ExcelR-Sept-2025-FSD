package day7;

public class UpcastingUsecases {
public static void main(String[] args) {
	
	int n=5;
	double m=10.5;
	test(n);
	display(m);
	
	

	show(new Aradhya());   //passed object of Aradhya class
}

public static void test(int x)
{
	
}

public static void display(double x)
{
	
}

public static void show(Aradhya x)
{
	x.home();
	x.car();
	x.office();
}

public static Amitabh calculate()
{
	//return new Amitabh();
	//return new Abhishek();
	return new Aradhya();
}
}
