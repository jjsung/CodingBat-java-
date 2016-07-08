package array1;
/*
 Given 2 int arrays, a and b, of any length, return a new array with the first element of each array. If either array is length 0, ignore that array.

front11([1, 2, 3], [7, 9, 8])  [1, 7]
front11([1], [2])  [1, 2]
front11([1, 7], [])  [1]
 */
public class Front11 {
	public int[] front11(int[] a, int[] b) {
		int[] bob = new int[2]; 
		int[] sad = new int[1]; 
		int[] supersad = new int[0]; 
		
		if(a.length>0 && b.length>0)
		{	bob[0]=a[0];
			bob[1]=b[0];
			return bob;
			}
		
		else if (a.length==0 && b.length==0)	
		{
			return supersad;
		}
		
		else if (a.length==0)
			{
				
				sad[0]=b[0];
				return sad;
			}
		else
			{sad[0]=a[0];
			return sad;}
		
	}
	

}
