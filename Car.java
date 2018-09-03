package constructor;

public class Car 

{
	
		int age=10;
		String name="John";
		double d1=60.5;
        double d2=50.0;
		double val;
		double res;
   
  //Contructor-1...Empty Constructor      
  public Car()
		{

			System.out.println("I am empty constructor");
		
		}
 
  
 //Contructor-2...Parametarized Constructor    
  public Car (String name)
   
   {

    this.name=name;

	System.out.println(name);
   }
   
  
  
//Contructor-3...Parametarized Constructor   
public Car (String name, int age)
   
   {

    this.name=name;
    this.age=age;
	System.out.println(name);
	System.out.println(age);
	
   }
   
//Contructor-4...Parametarized Constructor  
public Car (double d1,double d2)

{

 this.d1=d1;
 this.d2=d2;
 val=d1+d2;
 System.out.println("The Sum is:" +val);

}
   


public void askName()
{
	  System.out.println("What is your name?");
}


public void displayName(String name)
{
	System.out.println(name);
}

public void displayNameAge(String name, int age)

{
	System.out.println(name);
	System.out.println(age);
}

public double product(double d1,double d2)
{
   res=(d1*d2);
   return res;
}

}