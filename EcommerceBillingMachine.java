
	import java.util.Scanner;

	// Item class
	class Item {
	    int id;
	    String name;
	    double unitPrice;

	    // Constructor
	    Item(int id, String name, double unitPrice) {
	        this.id = id;
	        this.name = name;
	        this.unitPrice = unitPrice;
	    }
	}

	// Bill class
	class Bill {
	    int[] purchasedItemIds;
	    int[] quantities;
	    Item[] storeItems;

	    // Constructor
	    Bill(int[] purchasedItemIds, int[] quantities, Item[] storeItems) {
	        this.purchasedItemIds = purchasedItemIds;
	        this.quantities = quantities;
	        this.storeItems = storeItems;
	    }

	    // Method to calculate total bill
	    double calculateTotal() {
	        double total = 0;

	        for (int i = 0; i < purchasedItemIds.length; i++) {
	            for (int j = 0; j < storeItems.length; j++) {
	                if (purchasedItemIds[i] == storeItems[j].id) {
	                    total += storeItems[j].unitPrice * quantities[i];
	                }
	            }
	        }

	        return total;
	    }
	}

	// Main class
	public class EcommerceBillingMachine {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Predefined store items
	        Item[] storeItems = {
	            new Item(1, "Laptop", 50000),
	            new Item(2, "Mobile", 20000),
	            new Item(3, "Headphones", 2000),
	            new Item(4, "Keyboard", 1500)
	        };

	        System.out.print("Enter number of items purchased: ");
	        int n = sc.nextInt();

	        int[] ids = new int[n];
	        int[] qty = new int[n];

	        for (int i = 0; i < n; i++) {
	            System.out.print("Enter Item ID: ");
	            ids[i] = sc.nextInt();

	            System.out.print("Enter Quantity: ");
	            qty[i] = sc.nextInt();
	        }

	        Bill bill = new Bill(ids, qty, storeItems);

	        double totalAmount = bill.calculateTotal();

	        System.out.println("Total Bill Amount: Rs" + totalAmount);

	        sc.close();
	    }
	}


