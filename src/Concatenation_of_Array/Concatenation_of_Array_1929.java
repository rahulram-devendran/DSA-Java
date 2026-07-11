package Concatenation_of_Array;

public class Concatenation_of_Array_1929 {
	public static void main(String[] a) {
		int n = (int) (Math.random() * 10) + 1;
		System.out.println("The Length of the Array is = " + n);
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = (int) (Math.random() * 10) + 1;
		}
		System.out.print("The elements of the Array were = ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println("\nThe Concatenation of this Array will be => " + concatArray(arr));
	}

	private static String concatArray(int[] arr) {
		int res[] = new int[arr.length * 2];
		for (int i = 0; i < arr.length; i++) {
			res[i] = arr[i];
			res[i + arr.length] = arr[i];
		}
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < res.length; i++) {
			sb.append(res[i]);
			if (i != res.length - 1) {
				sb.append(",");
			}
		}
		sb.append("]");
		return sb.toString();
	}
}
