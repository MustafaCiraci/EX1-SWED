package Exercise1;

	public class Ex1 {
		
	    public static void main(String[] args) {
	    	
	        int n = 13;
	        System.out.println("Ulam sequence for n = " + n + ":");
	        while (n != 1) {
	            System.out.print(n + " ");
	            if (n % 2 == 0) {
	                n /= 2;
	            } else {
	                n = 3 * n + 1;
	            }
	        }
	        System.out.println(n); 
	    }
	}


