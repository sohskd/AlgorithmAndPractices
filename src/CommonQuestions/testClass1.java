package CommonQuestions;

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
//import for Scanner and other utility classes
import java.util.*;

class TestClass {
	
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        */
        
        //Scanner
//        Scanner s = new Scanner(System.in);
//        int N = s.nextInt();
//
//        for (int i = 0; i < N; i++) {
//            System.out.println("hello world");
//        }
    	
    	int n = 30100;
    	String temp = Integer.toString(n);
    	int[] myArr = new int[temp.length()];
    	for (int i = 0; i < temp.length(); i++)
    	{
    	    myArr[i] = temp.charAt(i) - '0';
    	}
    	
    	if(myArr.length == 1){
    		System.out.println(ones(n));
    	}
    	else if(myArr.length == 2){
    		System.out.println(twoDigits(n));
    	}
    	else if(myArr.length == 3){
    		System.out.println(threeDigits(n));
    	}
    	else if(myArr.length == 4){
    		System.out.println(fourDigits(n));
    	}
    	else if(myArr.length == 5){
//    		System.out.println(fiveDigits(n));
    	}
    }
    
    public static String ones(int var){
        Map<Integer, String> h = new HashMap<Integer, String>();
        h.put(0 , "Zero");
        h.put(1 , "One");
        h.put(2 , "Two");
        h.put(3 , "Three");
        h.put(4 , "Four");
        h.put(5 , "Five");
        h.put(6 , "Six");
        h.put(7 , "Seven");
        h.put(8 , "Eight");
        h.put(9 , "Nine");
    
        return h.get(var);
    }
    
    public static String tens(int var){
        Map<Integer, String> h = new HashMap<Integer, String>();
        h.put(1 , "one");
        h.put(2 , "Twenty");
        h.put(3 , "Thirty");
        h.put(4 , "Fourty");
        h.put(5 , "Fifty");
        h.put(6 , "Sixty");
        h.put(7 , "Seventy");
        h.put(8 , "Eighty");
        h.put(9 , "Ninety");
    
        return h.get(var);
    }
    
    public static String hundreds(int var){
        Map<Integer, String> h = new HashMap<Integer, String>();
        h.put(1 , "One Hundred");
        h.put(2 , "Two Hundred");
        h.put(3 , "Three Hundred");
        h.put(4 , "Four Hundred");
        h.put(5 , "Five Hundred");
        h.put(6 , "Six Hundred");
        h.put(7 , "Seven Hundred");
        h.put(8 , "Eight Hundred");
        h.put(9 , "Nine Hundred");
    
        return h.get(var);
    }
    
    public static String thousands(int var){
        Map<Integer, String> h = new HashMap<Integer, String>();
        h.put(1 , "One Thousand");
        h.put(2 , "Two Thousand");
        h.put(3 , "Three Thousand");
        h.put(4 , "Four Thousand");
        h.put(5 , "Five Thousand");
        h.put(6 , "Six Thousand");
        h.put(7 , "Seven Thousand");
        h.put(8 , "Eight Thousand");
        h.put(9 , "Nine Thousand");
    
        return h.get(var);
    }
    
    public static String tenThousands(int var){
        Map<Integer, String> h = new HashMap<Integer, String>();
        h.put(10 , "Ten Thousand");
        h.put(20 , "Twenty Thousand");
        h.put(30 , "Thirty Thousand");
        h.put(40 , "Fourty Thousand");
        h.put(50 , "Fifty Thousand");
        h.put(60 , "Sixty Thousand");
        h.put(70 , "Seventy Thousand");
        h.put(80 , "Eighty Thousand");
        h.put(90 , "Ninety Thousand");
    
        return h.get(var);
    }
    
    public static String twoDigits(int n){
        Map<Integer, String> h = new HashMap<Integer, String>();
        h.put(10, "Ten");
        h.put(11 , "Eleven");
        h.put(12 , "Twelve");
        h.put(13 , "Thirteen");
        h.put(14 , "Fourteen");
        h.put(15 , "Fifteen");
        h.put(16 , "Sixteen");
        h.put(17 , "Seventeen");
        h.put(18 , "Eighteen");
        h.put(19 , "Nineteen");
        
        String temp = Integer.toString(n);
    	int[] myArr = new int[temp.length()];
    	for (int i = 0; i < temp.length(); i++)
    	{
    	    myArr[i] = temp.charAt(i) - '0';
    	}
    	
    	//Case if 1st Digit is 1
    	if(myArr[0] == 1)
    		return h.get(n);
    	else
    		if(myArr[1] == 0)
    			return tens(n/10);
    		else{
    		return tens(n/10) + " " + ones(n%10); 			
    		}
    }
    
    public static String threeDigits(int n){
    	String temp = Integer.toString(n);
    	
    	//Check if 3 digits
    	if(temp.length() == 1){
    		temp = "0" + temp;
    	}
    	if(temp.length() == 2){
    		temp = "00" + temp;
    	}
    	
    	int[] myArr = new int[temp.length()];
    	for (int i = 0; i < temp.length(); i++)
    	{
    	    myArr[i] = temp.charAt(i) - '0';
    	}
    	
    	//Case if 2nd digit is 0
    	if(myArr[1] == 0)
    		//Case if 3rd digit is also 0
    		if(myArr[2] == 0)
    			return ones(myArr[0]) + " Hundred";
    		else{
    		return ones(myArr[0]) + " Hundred And " + ones(myArr[2]); 
    		}
    	//Case if 2nd digit is 1
    	if(myArr[1] == 1)
    		return ones(myArr[0]) + " Hundred And " + twoDigits(n%100); 
    	return hundreds(myArr[0]) + " And " +  tens(myArr[1]) + " " + ones(myArr[2]);
    }
    
    public static String fourDigits(int n){
    	String temp = Integer.toString(n);
    	
    	int[] myArr = new int[temp.length()];
    	for (int i = 0; i < temp.length(); i++)
    	{
    	    myArr[i] = temp.charAt(i) - '0';
    	}
    	
    	if(myArr[1] == 0){
    		if(myArr[2] == 0){
    			if(myArr[3] == 0){
    				return ones(myArr[0]) + " Thousand ";
    			}
    			else{
    				return ones(myArr[0]) + " Thousand And " + ones(n%10);
    			}
    		}
    		else{
    			return ones(myArr[0]) + " Thousand And " + twoDigits(n%100);
    		}
    	}
    	return ones(myArr[0]) + " Thousand " + threeDigits(n%1000);
    }
    
//    public static String fiveDigits(int n){
//    	String temp = Integer.toString(n);
//    	int[] myArr = new int[temp.length()];
//    	for (int i = 0; i < temp.length(); i++)
//    	{
//    	    myArr[i] = temp.charAt(i) - '0';
//    	}
//
//    }
//
}

