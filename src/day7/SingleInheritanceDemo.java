package day7;

public class SingleInheritanceDemo {

	public static void main(String[] args) {
		Abhishek a1=new Abhishek();
		//reference= object
		//Child ref = new Child()
		
		a1.home();
		
		Amitabh a2=new Abhishek();
		
		//Parent ref = new Child()   ==> Upcasting
		//limitation : we can only call those methods which Amitabh has given Abhishek
		//upcasting will be used very much 
		//most of the cases we will observe
		//P p =new C()
		a2.home();
		
		
		Amitabh a5 =new Aradhya(); 
		a5.home();
		
		Abhishek a4 =new Aradhya(); 
		a4.home();
		a4.car();
		
		Aradhya a3 =new Aradhya(); 
		a3.home();
		a3.car();
		a3.office();
		
		
		

	}

}
