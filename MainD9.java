
public class MainD9 {

	public static void main(String[] args) {
		int num = 10;
		int fibo = fibonacci1(num);
		System.out.println("fibonancci of " + num + " = " + fibo);
		System.out.println("Fibonacci is " + fibonancci2(num));

	}

	public static int fibonacci1(int num) {
		if (num <= 1) {//1
			return num; //1
		} else {
			int[] a = new int[num + 1]; // 1
			a[0] = 0; // 1
			a[1] = 1; // 1
			for (int i = 2; i < a.length; i++) { // O(n)

				a[i] = a[i - 1] + a[i - 2]; 
			}
			return a[num];//1
		}
	}// Time complexity O(n)

	public static int fibonancci2(int num) {
		if (num <=1) {
			return num;
		} else {
			return fibonancci2(num - 1) + fibonancci2(num - 2);
		}

	}// Time complexity O(n)

}
