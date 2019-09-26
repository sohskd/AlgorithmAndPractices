package DesignPattern;

public class SingletonClass {
	
	public static SingletonClass singletonClass = null;
	
	//Private constructor to prevent class from being initialised from outside 
	private SingletonClass(){
		System.out.println("created singleton");
	}
	
	//Lazy Initialization
	public static SingletonClass getInstance(){
		if(singletonClass == null){
			singletonClass = new SingletonClass(); 
		}
		return singletonClass;
	}
	
	public void hello(){
		System.out.println("hello world");
	}

}
