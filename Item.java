import java.util.*;



class Item{
	int itemid;
	String itemname;
	int quantity;
	 double price;
	
	Item(int itemid,String itemname,int quantity,double price){
		 this.itemid=itemid;
		 this.itemname=itemname;
		 this.quantity=quantity;
		 this.price=price;
	}
	
	 void setitemname(String itemname){
		this.itemname=itemname;
	}
     void setquantity(int quantity){
		this.quantity=quantity;
	}
	void setPrice(int price){
		this.price=price;
	}
	
	
	int getitemid(){
		return itemid;
	}
	String getitemname(){
		return itemname;
	}
	int getquantity(){
		return quantity;
	}
	double getprice(){
		return price;
	}
	
	 void tostring(){
		System.out.println("Item ID is = "+itemid);
		System.out.println("Item Name = "+itemname);
		System.out.println("Item Quantity = "+quantity);
		System.out.println("Item Price = "+price);
	}

}


class Inventory{
	
	static ArrayList<Item> itemlist=new ArrayList<>();
	static void addtoarraylist(int id,String name,int much,double cent){
	        itemlist.add(new Item(id,name,much,cent));
	}
	
	static void removefromarraylist(int x){
			
	        itemlist.remove(x);
	}
	static void UpdateAddQuantitiy(int z,int u){
			Item i1=itemlist.get(z);
			i1.setquantity(i1.quantity+u);
		
		
	}

	static void UpdateremoveQuantitiy(int z,int u){
			Item i1=itemlist.get(z);
			i1.setquantity(i1.quantity-u);
		
	}
	
	static void viwe(int v){
		itemlist.get(v).tostring();
	}
}
		
class Warehouse{
	public static void main(String arg[]){
	int index=0;
	while(0==0){
		int x;
	
	System.out.println("0 Add a new item to inventory");
	System.out.println("1 Remove an existing item");
	System.out.println("2 Update item quantity");
	System.out.println("3 Search for an item (by ID or name)");
	System.out.println("4 Display all items in inventory");
	
	Scanner sc=new Scanner(System.in);
	x=sc.nextInt();
	
	switch(x){
	
	case 0:
		int c;
		Scanner s1=new Scanner(System.in);
		System.out.print("Enter item name :");
		String n=s1.nextLine();
		System.out.print("Enter item Quantity :");
		int q=s1.nextInt();
		System.out.print("Enter item price :");
		double p=s1.nextDouble();
		Inventory.addtoarraylist(index,n,q,p);
		break;
	case 1:
		int y;
		Scanner s3=new Scanner(System.in);
		System.out.print("Enter index of item to remove :");
		y=s3.nextInt();
		Inventory.removefromarraylist(y);
		break;
	case 2:
		Scanner s4=new Scanner(System.in);
		Scanner s5=new Scanner(System.in);
		Scanner s6=new Scanner(System.in);
		System.out.print("Enter index of item to update :");
		int m=s4.nextInt();
		
		String de;
		do{
		System.out.println("for Add quantity enter 1\nfor remove quantity enter 2");
		de=s5.nextLine();
		if(de.equals("1")){
			System.out.print("Enter quantitiy to Add :");
			Inventory.UpdateAddQuantitiy(m,s6.nextInt());
			break;
		}
		else if(de.equals("2")){
			System.out.print("Enter quantitiy to remove :");
			Inventory.UpdateremoveQuantitiy(m,s6.nextInt());
			break;
		}
		else{
			System.out.println("Invalid Input Try Again\n");
		}
		}
		while((!(de.equals("1")))||(!(de.equals("2"))));
		
		
		break;
	case 3:
			System.out.println("Enter ID of item for viwe details");
			Scanner s7=new Scanner(System.in);
			
			Inventory.viwe(s7.nextInt());
		break;
	case 4:
			for(int r=0;r<Inventory.itemlist.size();++r){
				Inventory.viwe(r);
				System.out.println();
			}
		break;
	default:
			System.out.println("Invalid selection TRY AGAIN !");
			System.out.println();
		break;
	
			
				 
			
	}
		index=index+1;
	}
}
}
		