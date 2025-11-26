package Assigments;

public class Assignment13_PowerOfN{

	
//	Implement pow(x, n), which calculates x raised to the power n (i.e., xn
//			).
//
//			Example 1:
//			Input: x = 2.00000, n = 10
//			Output: 1024.00000
	
	public static void main(String[] args) {
		
		double x = 10;  // Base number
		int n = 3;     // Exponent (can be positive, negative, or zero)
		double result = 1;  // Variable to store the final result of x^n

		// Case when exponent is 0: x^0 is always 1 (regardless of the base, except when x is 0)
		if (n == 0) {
			result = 1;
		}

		// Case when exponent is negative: 
		// Convert the base to its reciprocal and make the exponent positive
		if (n < 0) {
			x = 1 / x;   // Inverse the base: x^(-n) = (1/x)^n
			n = -n;      // Make exponent positive for the loop calculation
		}

		// Multiply the base 'x' with itself 'n' times
		for(int i = 0; i < n; i++) {
			result = result * x;  // Accumulate the result
		}
		
		// Print the final result of x raised to the power n
		System.out.println(result);
	}

}
