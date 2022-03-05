import java.util.Arrays;

public class Bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {4,2,1,5,3,10,56,23};
System.out.println("Array before sorting " +Arrays.toString(a));
int n=a.length;
for(int i=0;i<n-1;i++) //no of array-1
{
	for(int j=0;j<n-1;j++) //iteration in each phase of bubble sort 
	{
		if(a[j]>a[j+1]) // a[0] position greater than a[1] position number
		{
			int temp=a[j]; // swap
			a[j]=a[j+1];
			a[j+1]=temp; //iteration continues for 7 times in this case
		}
	}
}
System.out.println("Array after sorting " +Arrays.toString(a));
	}

}
