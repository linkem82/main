package com.emilio.question;

public class Seat {	
  private int row;
  private int column;
  
  public Seat(int row, int column) {
    this.row = row;
    this.column = column; // 
  } 
  
  public int getRow() {
    return this.row;    
  }  
  
  public void setRow(int row) {
    this.row = row;
  }
  
   public int getColumn() {
    return this.column;    
  }  
  
  public void setColumn(int column) {
    this.column = column;
  }
  
  public boolean equals (Seat seat) {
    if (this.row == seat.getRow() && this.column == seat.getColumn()) {
      return true;
    } else {
      return false;
    }
  }
  
  public String toString() {
	  return (new Integer(row)).toString() + (new Integer(column)).toString(); //comment
  }
}
