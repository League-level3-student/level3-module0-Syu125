package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	
	public static void main(String[] args) {
		Random r = new Random();
		int x = r.nextInt(50);
		
		//1. make an array of 5 Strings
String [] s = new String [5];
		//2. print the third element in the array
System.out.println(s[3]);
		//3. set the third element to a different value
s[3] = "6";
		//4. print the third element again
		System.out.println(s[3]);
		//5. use a for loop to set all the elements in the array to a string of your choice
		for(int i = 0; i<5; i++) {
			s[i] = "hi";
		}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i = 0; i<5; i++) {
		System.out.println(s[i]);	
		}
		//7. make an array of 50 integers
int [] a = new int [50];
int small = 50;
int big = 0;
		//8. use a for loop to make every value of the integer array a random number
for(int j = 0; j<50; j++) {
	a[j] = x;
	x = r.nextInt(50);
	/*if(a[j]<small) {
	small = a[j];
	}*/
	/*if(a[j]>big) {
		big = a[j];
	}*/
	if(j == 49) {
		int last = a[j]; 
		System.out.println(last);
	}
	//System.out.println(a[j]);
	
}
		//9. without printing the entire array, print only the smallest number on the array
//System.out.println(small);
		//10 print the entire array to see if step 8 was correct

		//11. print the largest number in the array.
		//System.out.println(big);
		//12. print only the last element in the array
		
	}
}
