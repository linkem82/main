package com.emilio.question.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.emilio.question.Classroom;
import com.emilio.question.NewClassroom;
import com.emilio.question.Seat;

public class ClassroomTest {
  public static void main(String args[]) {
	    List<Seat> occupiedSeats = new ArrayList<Seat>();
	    List<Seat> brockenSeats = new ArrayList<Seat>();
	    boolean var = false;
	    Seat seatC = new Seat(0,0); //
	    Seat seatB = new Seat(0,2);
	    Seat seatA = new Seat(0,4);	
	    Seat seatD = new Seat(1,0);	   // //
	   
//	    brockenSeats.add(seatA);
//	    brockenSeats.add(seatB);
	    brockenSeats.add(seatC);
//	    brockenSeats.add(seatD);	 
	    
	    Classroom c = new Classroom(8, 5, brockenSeats);
	    System.out.println("Number of occupiable seats:");
	    System.out.println(c.countOccupiableSeats());
	    System.out.println("Occupiable seats:");
	    Iterator it = (c.getOccupaibleSeats()).iterator();
	    while(it.hasNext()) {
	    	System.out.println(it.next());
	    }
	  	    
	    boolean[][] brokenSeats = new boolean[8][5];
	    brokenSeats[0][0] = true; 
	    brokenSeats[0][1] = true; 
	    brokenSeats[0][2] = true; 
//	    brokenSeats[1][0] = true; 
//	    brokenSeats[6][2] = true;
//	    brokenSeats[6][3] = true;
	    
	    NewClassroom cl = new NewClassroom(8, 5, brokenSeats);
	    System.out.println("New implementation");
	    System.out.println(cl.countOccupiableSeats());
	    System.out.println("Seats");
	    for(int i = 0; i < cl.getSeats().length; i++) {
	    	for(int k = 0; k < cl.getSeats()[0].length ; k ++) {	    		
	    				if(cl.getSeats()[i][k]) 
	    					System.out.print(1); 
	    				else System.out.print(0);	    		
	    	}
	    	System.out.println(" ");
	    }
	    
	    
  }	  
	   
}
