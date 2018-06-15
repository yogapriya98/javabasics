package com.java.lang;

public enum Level {
      HIGH(1),
      MEDIUM(2),
      LOW(3);
	// creation of fields in enum
          final int levelCode ;   // instant variable
         private Level(int levelCode) {   //constructor definition
    	  this.levelCode = levelCode;
      }
    //creation of methods in enum     
         public int getLevelCode() {
        	 return this.levelCode;
         }
      }
