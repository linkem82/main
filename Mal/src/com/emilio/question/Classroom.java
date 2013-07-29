package com.emilio.question;

import java.util.List;
import java.util.ArrayList;

public class Classroom {
  private int rows;
  private int columns ;
  private List<Seat> occupiableSeats = new  ArrayList<Seat>(); //
  private List<Seat> brokenSeats;
  
  public Classroom(int rows, int columns, List<Seat> brokenSeats) {
    this.rows = rows;
    this. columns = columns;
    this.brokenSeats = brokenSeats;
  }
  
  public List<Seat> getOccupaibleSeats() {
	  return this.occupiableSeats;
  }
  
  public int countOccupiableSeats() {
    boolean boolA;
    boolean boolB;    
    boolean boolC;
    boolean boolD;
    boolean boolE;
    boolean boolU;
    for(int j = 0; j < columns; j++) {
      for(int i = 0; i < rows; i++) { 
        Seat seat = new Seat(i, j);         
        Seat lSeat = new Seat(i, j-1);        
        Seat dlSeat = new Seat(i-1, j-1);        
        Seat ulSeat = new Seat(i+1, j-1);
        
        boolA = false;
        boolB = false;
        boolC = false;
        boolD = false;
        boolE = false; // comment
        boolU = false;
        
        for(int k=0; k < brokenSeats.size(); k++) {
	    	Seat current = brokenSeats.get(k);
	    	if(seat.equals(current)) {
	    		boolA = true;	    	    		
	    	}	
	    }
        for(int l=0; l < occupiableSeats.size(); l++) {
	    	Seat current = occupiableSeats.get(l);	    	
	    	if(lSeat.equals(current)) {
	    		boolB = true;
	    		
	    	}
	    	if(ulSeat.equals(current)) {
	    		boolC = true;
	    		
	    	}	
	    	if(dlSeat.equals(current)) {
	    		boolD = true;
	    		
	    	}
	    	
    	}
        if(boolA ==false && boolB == false && boolC == false && boolD == false) {
        	occupiableSeats.add(seat);
        }
          
       }
      }
      return occupiableSeats.size();        
  }
}
