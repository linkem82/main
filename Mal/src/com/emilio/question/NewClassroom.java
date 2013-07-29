package com.emilio.question;

public class NewClassroom {
	
	private boolean[][] seats;
	private boolean[][] brokenSeats;
	
	public NewClassroom(int rows, int columns, boolean[][] brokenSeats) {
		seats = new boolean[rows][columns];
	    this.brokenSeats = brokenSeats; // 
	}
	
	public int countOccupiableSeats() {
	    boolean boolA;
	    boolean boolB;    
	    boolean boolC;
	    boolean boolD;
	    int n = 0;
	    for(int j = 0; j < seats[0].length; j++) {
	      for(int i = 0; i < seats.length; i++) { 
	    	boolA = false;
	  	    boolB = false;    
	  	    boolC = false;
	    	if(brokenSeats[i][j] == false) {
			  	if(j > 0) {
			  		boolA = seats[i][j-1];
			  	} 
			  	if(i > 0 && j > 0) {
			  		boolB = seats[i-1][j-1];				  		
			  	}
			  	if(j > 0 && i < seats.length-1) {
			  		boolC = seats[i+1][j-1];    // comment
			  	} 
			  	if((boolA || boolB || boolC) == false) {
			  		seats[i][j] = true; //modified comment
		    		n++;
		    	}
	    	}    	  		
	      }
	    }
	    return n;        
	}
	
	public boolean[][] getSeats() {
		return this.seats;
	}

}
