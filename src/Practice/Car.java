package Practice;

public class Car {
	int price;
	Car(){
		System.out.println("Inside Car Constructor");
	}
	
	Car(int p){
		price = p;
	}
	public void move(){
		System.out.println("Car is moving");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		Ford f = new Ford();
		f.move();		
	}
	

}
class Ford extends Car{

	int maxspeed;
	Ford() {
		//super(5000);
		System.out.println("Inside Ford Constructor");
		maxspeed = 5000;
		// TODO Auto-generated constructor stub
	}
	public void move(){
		super.move();
		//System.out.println("Ford is moving");
	}
	
}

