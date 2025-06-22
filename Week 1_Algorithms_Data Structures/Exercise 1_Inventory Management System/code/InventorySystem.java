import java.util.*;
class Product{
 int productId;
 String productname;
 int quantity;
 int price;

 public Product(int id,String name,int q,int p)
 {
	productId=id;
	productname=name;
	quantity=q;
	price=p;
 }
}
 class function{

 public void add(HashMap<Integer,Product> inventory,Product p)
 {
	 if(inventory.containsKey(p.productId)!=true)
	 {
		 inventory.put(p.productId,p);
	 }
	 else
		 System.out.println("product already present");
 }


public void update(HashMap<Integer,Product> inventory,Product p,int q,int pr)
{
	 if(inventory.containsKey(p.productId))
	 {
		 inventory.get(p.productId).price=pr;
		 inventory.get(p.productId).quantity=q;
	 }
	 else
		 System.out.println("Product not found");
}

public void delete(HashMap<Integer,Product> inventory,Product p)
{
	 if(inventory.containsKey(p.productId)!=true)
	 {
		 System.out.println("Product not found");
	 }
	 else
		 inventory.remove(p.productId);
}
public void display(HashMap<Integer,Product> dis)
{
	   for (Integer key : dis.keySet()) {
		   Product o=dis.get(key);
           System.out.println("ProductID "+ o.productId+" Productname:- "+o.productname+" quatntity :- "+o.quantity+" price "+o.price);
       }
}
}
public class InventorySystem
{
	public static void main(String args[])
	{
		Product ob =new Product(101,"WirelessMouse",25,500);
		Product ob1 =new Product(102,"Keyboard",15,500);
		Product ob2 =new Product(103,"Laptop",35,5100);
		Product ob3 =new Product(104,"Monitor",45,1500);
		Product ob4=new Product(105,"USB cable",65,300);
		Product ob5=new Product(106,"Hard Drive",5,900);
		Product ob6=new Product(107,"processor",45,5000);
		Product ob7=new Product(108,"Webcam",20,2500);
		HashMap<Integer,Product> inventory=new HashMap<>();
		function fn=new function();
		//adding all objects in 
		fn.add(inventory, ob);
		fn.add(inventory, ob1);
		fn.add(inventory, ob2);
		fn.add(inventory, ob3);
		fn.add(inventory, ob4);
		fn.add(inventory, ob5);
		fn.add(inventory, ob6);
		fn.add(inventory, ob7);
		//display
		fn.display(inventory);
		//updating the wireless mouse
		fn.update(inventory, ob, 250, 800);
		System.out.println("After updation of wirless mouse with 250 quantity and price 800");
		fn.display(inventory);
		//deleting Keyboard
		fn.delete(inventory, ob2);
		System.out.println("Deleting the Keyboard");
		fn.display(inventory);
		
	}
}