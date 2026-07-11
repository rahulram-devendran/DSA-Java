package Two_Sum.Hash_Map;

import java.util.*;

public class Two_Sum_1 {

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
		StringBuilder sb = new StringBuilder();
		Map<Integer, Integer> hm = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			int exp = target - arr[i];
			if (hm.containsKey(exp)) {
				return sb.append(hm.get(exp)).append(" and ").append(i).toString();
			}
			hm.put(arr[i], i);
		}
		return sb.append("not found").toString();
	}
}
