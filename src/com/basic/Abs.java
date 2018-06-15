package com.basic;

public abstract class Abs {
       public Abs(){
    	   
       }
  public abstract void getItem();
  public static void main(String[] args) {
	// Abs ab = new Abs(); 	                 //cannot create obj in abstract calss
     SubAbs sb = new SubAbs();
  }
}
class SubAbs extends Abs{
    @Override
    public void getItem() {
}
}
