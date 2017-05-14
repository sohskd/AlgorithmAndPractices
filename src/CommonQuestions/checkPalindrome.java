package CommonQuestions;

public class checkPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome("1233211"));

	}
	
	public static boolean isPalindrome(String s){
		for(int n = 0; n < s.length(); n++){
			if(s.charAt(n) != s.charAt(s.length() - 1 - n)){
				return false;
			}
		}
		return true;
	}

}
