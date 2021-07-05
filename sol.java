import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int tt = in.nextInt();
		for (int qq = 1; qq <= tt; qq++) {
		    int n = in.nextInt();
		    int m = in.nextInt();
		    long sum = 0;
		    for (int i = 0; i < n; i++) {
		        int a = in.nextInt();
            		// calculate the sum of all the elements
		        sum += a;
		    }
        	    // check if the sum of 'sum' and 'm' is divisible by 'n'
		    System.out.println((sum + m) % n == 0 ? "Yes" : "No");
		}
	}
}
