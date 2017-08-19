package com.miraclessoftwareprivatelaboratorieschapter3;
//Insertion Sorting
public class InsertionSort {
	public static void InsertionSorting() {
		int []arr = {15,75,3,9,1,60};
		int n = arr.length;
		for(int i=1;i<n;i++) {
			int temp,key,temp2;
			key = arr[i];
			temp = i-1;
			while((temp>=0)&&(key<arr[temp])) {
				arr[temp+1]=arr[temp];
				temp--;
			}
			arr[temp+1]=key;
		}
		for(int i=0;i<n;i++) {
		System.out.print(arr[i] + " ");
		}
	}
	public static void main(String[] args) {
		InsertionSorting();
		
	}

}
