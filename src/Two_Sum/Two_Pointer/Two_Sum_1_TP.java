package Two_Sum.Two_Pointer;

public class Two_Sum_1_TP {
	public static void main(String[] a) {
		int n = (int) (Math.random() * 10) + 1;
		int target = (int) (Math.random() * 10) + 1;
		System.out.println("The Length of the Array is = " + n);
		System.out.println("The Target element is " + target);
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = (int) (Math.random() * 10) + 1;
		}
		System.out.print("The elements of the Array were = ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println("\nThe Indexes of the Array that Leads to this Sum is " + twoSum(arr, target));
	}

	private static String twoSum(int[] arr, int target) {
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {
					return str.append(i).append(" ").append(j).toString();
				}
			}
		}
		return "not found";
	}
}
