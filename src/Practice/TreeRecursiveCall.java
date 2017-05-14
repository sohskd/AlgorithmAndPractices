package Practice;

public class TreeRecursiveCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeRecursiveCall t = new TreeRecursiveCall();
		//t.RecPermute("", "abcd");
		t.RecSubsets("", "abcd");
	}
	
	public void RecPermute(String soFar, String rest){
		if(rest.equals("")){
			System.out.println(soFar);
		}else{
			for(int i = 0; i < rest.length(); i++){
				String next = soFar + rest.charAt(i);
				//You are not picking character at index i
				String remaining = rest.substring(0, i) + rest.substring(i + 1);
				RecPermute(next, remaining);
			}
		}
	}
	
	public void RecSubsets(String soFar, String rest){
		if(rest.equals("")){
			System.out.println(soFar);
		}
		else{
			// add to the subset, remove from rest, recur
			RecSubsets(soFar + rest.charAt(0), rest.substring(1));
			// don't add to subset, remove from rest, recur
			RecSubsets(soFar, rest.substring(1));
		}
	}
	
}
