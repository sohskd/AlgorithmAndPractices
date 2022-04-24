package Practice;

public class validPalindrome2 {

    private String myProp;

    public String getMyProp() {
        return myProp;
    }

    public void setMyProp(String myProp) {
        this.myProp = myProp;
    }

    @Override
    public String toString() {
        return "validPalindrome2{" +
                "myProp='" + myProp + '\'' +
                '}';
    }

    public static void main(String[] args) {

        MyClass myClass = new MyClass();

        validPalindrome2 validPalindrome2 = new validPalindrome2();

//        validPalindrome2.setMyProp(myClass.getMyProperty());

        System.out.println(validPalindrome2.toString());
    }
}
