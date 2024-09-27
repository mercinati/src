package july10;

public class string_test1 {
    public static void main(String[] args) {
        
    String s = "hello";
	String ass = "Agree";
	String K = "hello";
	String G = "HELLO";
	System.out.println(s.substring(1,3));
	System.out.println(s.replace('e', 'a'));
	System.out.println(s.equals(ass));
	System.out.println(s.equals(K));
	System.out.println(s.equalsIgnoreCase(G));
	
	StringBuilder A = new StringBuilder("World");
	System.out.println(A.reverse());
    }
}
