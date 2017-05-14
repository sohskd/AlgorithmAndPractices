package DerekBanas;

import java.io.BufferedReader; 
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class JavaLesson32FileWriteRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create an Array of type customers
		Customers[] customers = getCustomers();
		
		// PrintWriter is used to write characters to a file in this situation
		
		PrintWriter custOutput = createFile("/Users/desmond/workspace/Algorithm/src/DerekBanas/Customer.txt");
		
		for(Customers customer : customers){
			String output = customer.firstName + " " + customer.lastName;
			output += " " + Integer.toString(customer.custAge);
			
			custOutput.println(output);
		}
		
		// Close the connection to the PrintWriter
		custOutput.close();
		
		getFileInfo();

	}
	
	private static class Customers{
		
		public String firstName, lastName;
		public int custAge;
		
		//Constructor that's called when a customer is made
		
		public Customers(String firstName, String lastName, int custAge){
			
			this.firstName = firstName;
			this.lastName = lastName;
			this.custAge = custAge;
			
		}
		
	}
	
	private static Customers[] getCustomers(){
		
		Customers[] customers = new Customers[5];
		
		customers[0] = new Customers("desmond", "soh", 24);
		customers[1] = new Customers("shup", "wong", 24);
		customers[2] = new Customers("snarppi", "doggy", 10);
		customers[3] = new Customers("tiggy", "snr", 4);
		customers[4] = new Customers("tiggu", "jnr", 2);
		
		return customers;
	}
	
	// Create the file and the PrintWriter that will write to the file 
	
	private static PrintWriter createFile(String fileName){
		
		try {
			// Create a File Object that allows you to work with files on the hard drive
			File listOfNames = new File(fileName);
			
			// FileWriter is used to write streams of characters to a file
			// BufferedWriter gathers a bunch of characters and then writes
			// them all at one time (Speeds up the program)
			// PrintWriter is used to write characters to the console, file
			
			// Append Mode
			//PrintWriter infoToWrite = new PrintWriter(new BufferedWriter(new FileWriter(listOfNames, true)));
			
			PrintWriter infoToWrite = new PrintWriter(new BufferedWriter(new FileWriter(listOfNames)));
			return infoToWrite;
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Some I/O error occured");
			e.printStackTrace();
		}
		
		return null;		
	}
	
	// Create a string with the customer info and write it to the file
	
	private static void createCustomers(Customers customer, PrintWriter custOutput){
		
		// Create the string that contains the customer info
		
		String custInfo = customer.firstName + " " + customer.lastName + " ";
		custInfo += Integer.toString(customer.custAge);
		
		// Writes the string to the file
		
		custOutput.println(custInfo);
				
	}
	
	private static void getFileInfo(){
		
		String result = null;
		
		System.out.println("Info Written to File\n");
		
		//Open a new connection to the file
		
		File listOfNames = new File("/Users/desmond/workspace/Algorithm/src/DerekBanas/Customer.txt");
		
		try {
			// FileReader reads character files
			// BufferedReader reads as many characters as possible
			
			BufferedReader br = new BufferedReader(new FileReader(listOfNames));
			
			// Reads a whole line from the file and saves it in a String
			
			while((result = br.readLine())!=null){
				
				String[] customerArr = result.split(" ");
				
				System.out.println(customerArr[0] + " " + customerArr[1] + " is " + 
				customerArr[2] + " years old");
				
				
			}
			
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
	
	
	
	
}
