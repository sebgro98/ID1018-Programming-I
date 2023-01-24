import java.util.Arrays;
import static java.lang.System.out;
public class SortASet {
	
	public static void main(String[] args) {
		double[] arrayToSort = new double[] { 5, 0, 1, -2, 12, 53, 42.4 };
		out.println(Arrays.toString(arrayToSort));
		arrayToSort = sort(arrayToSort);
		out.println(Arrays.toString(arrayToSort));
	}

	public static double[] sort(double[] set) {
		for(int i = 0; i < set.length; i++) {
			for(int j = i + 1; j < set.length; j++) {
				if (set[j] < set[i]) {
		        	double b = set[j]; 	// Spara i en buffer
		        	set[j] = set[i];	// Byt ut xj mot xi
		        	set[i] = b;			// och xi mot xj	
		        }
			}
		}
		return set;
	}
}