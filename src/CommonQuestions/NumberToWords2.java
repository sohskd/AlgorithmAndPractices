package CommonQuestions;

import java.util.HashMap;
import java.util.Map;

public class NumberToWords2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10000;
		numberToWords(n);
	}
	
	public static String numberToWords(int n){
		
    	String temp = Integer.toString(n);
    	int[] myArr = new int[temp.length()];
    	for (int i = 0; i < temp.length(); i++)
    	{
    	    myArr[i] = temp.charAt(i) - '0';
    	}
    	
    	if(myArr.length == 1){
    		System.out.println(oneDigits(n));
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
    		System.out.println(fiveDigits(n));
    	}
    	
    	return "Invalid Input";
    	
	}
	
	///// Methods to return the equivalent English words. Logic and "And" "Thousands" etc /////
	
	private static String fiveDigits(int n) {
		// TODO Auto-generated method stub

		//Check for 20000, 30000, 40000 etc
		if(n%1000 == 0){
			return twoDigits(n/1000) + " Thousand";
		}
		
//		//Numbers starting with 1
//		if(n/10000 == 1){
//			//Handle numbers like 10001, 10002, 70024, 80099 etc 
//			if(n%1000 < 100){
//				return ones(n/1000) + " Thousand And " + twoDigits(n%1000);
//			}
//			else{
//				return ones(n/1000) + " Thousand " + threeDigits(n%1000);
//			}
//		}
//		//Numbers starting with 2 and above
//		else{
//			if(n%1000 < 100){
//				return twoDigits(n/1000)  + " Thousand And " + twoDigits(n%1000);
//			}else{
//				return twoDigits(n/1000) + " Thousand " + threeDigits(n%1000);
//			}			
//		}
		
		int q = n / 1000;
		int r = n % 1000;
		return (q / 10 == 1 ? ones(q) : twoDigits(q)) + " Thousand "
		        + (r < 100 ? "And " + twoDigits(r) : threeDigits(r));
		
//		if(n/10000 == 1 && n%1000 < 100) {
//		    return ones(n/1000) + " Thousand And " + twoDigits(n%1000);
//		}else if(n%1000 < 100) {
//		    return twoDigits(n/1000)  + " Thousand And " + twoDigits(n%1000);
//		}else{
//		    return twoDigits(n/1000) + " Thousand " + threeDigits(n%1000);           
//		}
		
	}

	private static String fourDigits(int n) {
		// TODO Auto-generated method stub
		
		//Check for 2000, 3000, 4000 etc
		if(n%1000 == 0){
			return ones(n/1000) + " Thousand";
		}
		//Handle numbers like 1001, 1002, 7024, 8099 etc 
		else if(n%1000 < 100){
			return ones(n/1000) + " Thousand And " + twoDigits(n%1000);
		}
		//Normal Case
		else{
			return ones(n/1000) + " Thousand " + threeDigits(n%1000);
		}
		
	}

	private static String threeDigits(int n) {
		// TODO Auto-generated method stub
		
		//Check for 200, 300, 400 etc
		if(n%100 == 0){
			return ones(n/100) + " Hundred";
		}
		//Normal Case
		else{
			return ones(n/100) + " Hundred And " + twoDigits(n%100);
		}
	}

	private static String twoDigits(int n) {
		// TODO Auto-generated method stub

		//Check for 11, 12, 13, 14 etc OR Handle Single digit so can reuse code
		if(n/10 == 1 || n/10 == 0)
    		return ones(n);
		//Check for 20, 30, 40 etc. Cannot print zero at the back
    	else if(n%10 == 0){
    			return tens(n/10);
    	}
    	//Normal Case
    	else{	
    		return tens(n/10) + " " + ones(n%10); 	
    	}
    }

	private static String oneDigits(int n) {
		// TODO Auto-generated method stub
		return ones(n);
	}
	
	///// Return number words only /////
	
	private static String ones(int num){
		
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
    
        return h.get(num);
		
	}
	
	private static String tens(int num){
		
		Map<Integer, String> h = new HashMap<Integer, String>();
		
		h.put(2 , "Twenty");
        h.put(3 , "Thirty");
        h.put(4 , "Fourty");
        h.put(5 , "Fifty");
        h.put(6 , "Sixty");
        h.put(7 , "Seventy");
        h.put(8 , "Eighty");
        h.put(9 , "Ninety");
    
        return h.get(num);
		
	}
}
