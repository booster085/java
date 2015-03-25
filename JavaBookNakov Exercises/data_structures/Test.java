package data_structures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.swing.plaf.multi.MultiButtonUI;

public class Test {

	public static void main(String[] args) {

		Integer[] arr = new Integer[] { 1, 2, 2, 3, 1 };
		Set<Integer> mySet = new HashSet<Integer>(Arrays.asList(arr));

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		ArrayList<Integer> arrList = new ArrayList<Integer>(Arrays.asList(arr));
		Integer[] arrNums = (Integer[]) list.toArray(new Integer[list.size()]);
		for (Integer item : arrNums) {
		//	System.out.print(item);
		}
		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
	
		DoubleLinkedDynamicList myCustomList = new DoubleLinkedDynamicList();
		myCustomList.add(21);
		myCustomList.add(19);
		myCustomList.add(14);
		myCustomList.add(6);
		myCustomList.add(34);
		myCustomList.add(3);
		myCustomList.add(16);
		myCustomList.add(5);
		myCustomList.add(4);
		myCustomList.sort();
		Object[] arr2 = myCustomList.toArray();
		for (Object item : arr2) {
			System.out.print(item + " ");
		}
	}
	
}
