import java.util.*;
class Product
{
	int productID;
	String productName;
	String category;
	public Product(int n,String p,String c)
	{
		productID=n;
		productName=p.toLowerCase();
		category=c;
	}
}

class functions{ //function class all kinds of searching and sorting method
public void sort(Product array[]) //for sorting in ascending order alphabetically
{
	int l=array.length;
	int i,j;
	for(i=0;i<l-1;i++)
	{
		for(j=0;j<l-1-i;j++)
		{
			if(array[j].productName.compareTo(array[j+1].productName)>0)
			{
				Product temp=array[j];
				array[j]=array[j+1];
				array[j+1]=temp;
			}
		}
	}
}
//Linear search
public void linear_search(Product array[],String find)
{
	int i;
	for(i=0;i<array.length;i++)
	{
	 if(array[i].productName.equalsIgnoreCase(find))
	 {
		 System.out.println( "Item is present");
		 System.out.println(array[i].productID+" "+array[i].productName+" "+array[i].category);
		  return;
	 }
	}
	System.out.println(find +" is not present");
}
//Binary Search
public void Binary_search(Product array[],String find)
{  
	find=find.toLowerCase();
	sort(array);
	int lb=0;
	int ub=array.length-1;
	while(lb<=ub)
	{
		int mid=(lb+ub)/2;
		if(array[mid].productName.compareTo(find)>0)
			ub=mid-1;
		if(array[mid].productName.compareTo(find)<0)
			lb=mid+1;
		 if(array[mid].productName.equals(find))
			{
			System.out.println("Item is present");
			 System.out.println(array[mid].productID+" "+array[mid].productName+" "+array[mid].category);
			return;
			}
		
	}
	System.out.println(find+" is not present");
}
}

public class Ecommerce {

	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no elements you want to enter");
		int n=sc.nextInt();
		Product element[]=new Product[n];
		int i;
		for(i=0;i<n;i++)
		{
			System.out.println("Enter ProductID");
			int ID=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter ProductName");
			String Name=sc.nextLine();
			System.out.println("Enter category");
			String category=sc.nextLine();
			element[i]=new Product(ID,Name,category);
		}
		// now to find elements
		System.out.println("Enter element to found");
		String s=sc.nextLine();
		functions ob=new functions();
		System.out.println("Using Linear Search");
		ob.linear_search(element, s);
		System.out.println("Using Binary Search");
		ob.Binary_search(element, s);
		
	}

}
