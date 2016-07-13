package array1;
/*
 Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.

plusTwo([1, 2], [3, 4])  [1, 2, 3, 4]
plusTwo([4, 4], [2, 2])  [4, 4, 2, 2]
plusTwo([9, 2], [3, 4])  [9, 2, 3, 4]
 */
public class Plustwo {

	public int[] plusTwo(int[] a, int[] b) {
		
		
		int[] newarray= new int [4];
		for(int i=0;i<a.length;i++)
			newarray[i]= a[i];
		
		for(int i=0;i<b.length;i++)
			newarray[i+a.length]= b[i];
		return newarray;
		
	}

}
