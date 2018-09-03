package constructor;

public class TestCar 
{
	

public static void main(String[] args) 
{

	double value=0;
	//invoking constructor1
	Car obj1=new Car(); 
	
	// invoking method2
	 obj1.askName(); 

	//invoking constructor2
    Car obj2=new Car("Smith");

    // invoking method2
   obj2.displayName("Mary");

    //invoking constructor3
    Car obj3=new Car ("Liam", 20);

   //invoking method3
   obj3.displayNameAge("Jacob",50);

   //invoking constructor4
   Car obj4=new Car (30.5,10.5);
 
   //invoking method3
   value=obj4.product(5.0,3.0);
 System.out.println(value);

}

}