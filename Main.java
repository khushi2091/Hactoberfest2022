import java.util.Scanner;
class Binary
{
	void sort(int a[])
	{
		int i,j,t;
		for(i=0;i<(a.length-1);i++)
			
			for(j=i+1;j<a.length;j++)

				if(a[i]>a[j])
				{
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			System.out.print("Sorted array is : ");
			for(i=0;i<a.length;i++)
				System.out.print(a[i]+" ");
	}
	void bSearch(int a[], int sear)
	{
		sort(a);
		int l,r,m;
		for(l=0,r=a.length-1;l<=r;)
		{
			m=(l+r)/2;
			if(sear == a[m])
			{
				System.out.println("Search completed" + "\nFound "+sear);
				break;
			}
			else
				if(sear>a[m])
				l=m+1;
			else
				r=m-1;
		}
		if(l>r)
			System.out.print("\nValue not found");
	}
}
class Main
{
	public static void main(String ar[])
	{
		int s,i,sear;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		s=sc.nextInt();
		int n[] = new int[s];
		for(i=0;i<s;i++)
		{
			System.out.print("Enter"+" no "+(i+1)+" : ");
			n[i]=sc.nextInt();
		}
		System.out.print("Enter number to search : ");
		sear = sc.nextInt();

		Binary bo = new Binary();
		bo.bSearch(n,sear);
	}
}