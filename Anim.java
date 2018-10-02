 class Animal{
 public String name;

 public Animal(String name){
this.name = name;
 }
 public Animal(){
 	name = null;
 }
 public void Speak(){
 	System.out.println("My name is "+ name);
 }
 
 public String Info()
	{
	    return "Animal: " + name;
	}
}
 class Dog extends Animal{
 public String owner;

 public Dog(String name, String owner){
 	super(name);
 	this.owner = owner;
 }
 public Dog()
	{
		super();  
		owner = null; 
	}
 
 public void Speak(){
 	super.Speak();
 	System.out.println("Woof!");
 }
 public String Info(){
 	return super.Info() + '\n' + "Owner: " + owner;
 }
}
public class Anim{
	public static void main(String args[]){
		Animal anim = new Animal("Booz");
		anim.Speak();
 anim = new Dog("Nice", "Zhanna");
 anim.Speak();

	}
}