package com.basic;

public class Invoice {
     String partNumber;
     String partDiscription;
     int quantity;
     double price;
     public Invoice() {
    		 
     }
	public String getPartNumber() {
		return partNumber;
	}



	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}



	public String getPartDiscription() {
		return partDiscription;
	}



	public void setPartDiscription(String partDiscription) {
		this.partDiscription = partDiscription;
	}



	public int getQuantity() {
		return quantity;
	}



	public void setQuantity(int quantity) {
		if(quantity<0) {
		this.quantity = 0;
	}else
	{
		this.quantity = quantity;
	}
	}
	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		if(price<0.0) {
			this.price = 0;
	}else
	{
		this.price = price;
	}
	}
	public double getInvoiceAmount() {
		double InvoiceAmount = quantity*price;
		if(InvoiceAmount<0) {
			return InvoiceAmount;
		}
		return InvoiceAmount;
	}
    	 public static void main(String s[]) {
    		 Invoice invoice1 = new Invoice();
    		 invoice1.setQuantity(5);
    		 invoice1.setPrice(100);
    		 invoice1.setPartDiscription("bolt");
    		 System.out.println(invoice1.getQuantity());
    		 System.out.println(invoice1.getPartDiscription());	 
    	 }
    	 
     }
