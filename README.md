import java.util.*;
import java.util.ArrayList;


class Item{
	String itemId;
	String itemNAme;
	int Quantity;
	double price;
	

	
}
	
class Inventory{	
	ArrayList list=new ArrayList();


Inventory(String n,double p,int q){
	
	list.add(n);
	list.add(p);
	list.add(q);

	}
	
	public void RemoveItem(int a){
		list.remove(a);
		list.remove(a+1);
		list.remove(a+2);
	}
	
	void UpdateItem(){
		
	}
	
	
}


class WareHouse{
	public static void main(String arg[]){
	
	
	int x;
	
	System.out.println("0 Add a new item to inventory");
	System.out.println("1 Remove an existing item");
	System.out.println("2 Update item quantity");
	System.out.println("3 Search for an item (by ID or name)");
	System.out.println("4 Display all items in inventory");
	System.out.println("5 Handle invalid inputs gracefully");
	Scanner sc=new Scanner(System.in);
	x=sc.nextInt();
	
	switch(x){
	
	case 0:
		int c;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter index of item");
		Scanner s2=new Scanner(System.in);
		c=s2.nextInt();
		Inventory i1[]=new Inventory[10];
		i1[c]= new Inventory(s1.nextLine(),s1.nextDouble(),s1.nextInt());
		break;
	case 1:
		int y;
		Scanner s3=new Scanner(System.in);
		System.out.println("Enter index of item to remove");
		y=s3.nextInt();
		il.RemoveItem(y);
		
		
		
		break;
		
		
		
	}
		
	
	
	
	
	}
	
	
	
	
}
	




