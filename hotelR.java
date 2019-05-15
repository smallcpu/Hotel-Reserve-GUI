import java.util.*;
import java.text.*;
import java.awt.*;
import java.awt.event.*;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.*;
import java.text.*;
import java.awt.event.ActionEvent;
public class hotelR  implements ActionListener {
	  private JFrame f = new JFrame("one");
	  JLabel l1, l2, l3, l4, l5, l6, l7, l8;
	  JButton b1, b2;

	  hotelR(){
		  l1 = new JLabel("Welcome, Login to Start Reserving");
		  l2 = new JLabel(" ");
		  l3 = new JLabel(" ");
		  l4 = new JLabel(" ");
		  l5 = new JLabel(" ");
		  l6 = new JLabel(" ");
		  l7 = new JLabel(" ");
		  l8 = new JLabel(" ");
		  
		  b1 = new JButton("Login");
		  
		  f.setSize(600,300);
		  //row by column
		  f.setLayout(new GridLayout(3,3));
		  f.setTitle("Hotel Reservation");
		  
		  //adding the buttons and titles
		  f.add(l3);
		  f.add(l1);
		  f.add(l4);
		  f.add(l5);
		  f.add(b1);
		  f.add(l6);
		  f.add(l7);
		  f.add(l8);
		  f.add(l2);
		  
		  //actions
		  b1.addActionListener(this);
		  f.setVisible(true);
		  f.setLocation(450,300);
	  }
	public static void main(String [] args) {

		

		//ability to obtain user inputs
		
/*		while(again == true && arrCounter > -1) {
			//resets values so when repeated will not carry over values
			name = null;
			dateS = null;
			hotelLocation = null;
			roomAccom = null;
			inputS = 0;
			inputH = 1;
			tax = 1;
			discount = 1;
			pricePDay = 0;
			dayR = 0;
			hotelB = true;
			roomA = true;
			SRMC = null;
			StaxT = null;
			STotal = null;
			SPPD = null;
			
*/			
			//new----------------------------
			new hotelR();
			
			

	
	}
	
	
	//returns the grand total of the hotel
	//a = tax, b = taxT
	public static double grandTotal(double a, double b) {
		double taxDiscount = a * b;
		if(taxDiscount == b) {
			double grandTotal = b;
			return grandTotal;
		}
		else {
			double grandTotal = b - taxDiscount;
			return grandTotal;
		}	
	}
	//returns the cost of the room per night before tax
	//a = pricePDay b = dayR
	public static double roomCostCalc(double a, double b) {
		double roomCost = a * b;
		return roomCost;
		
	}
	//returns the tax of the total
	//a = tax, b = RMC
	public static double taxTotal(double a, double b) {
		double taxPrice = a * b;
		double totalTax = taxPrice + b;
		return totalTax;
	}
	
	
	
	
	public void actionPerformed(ActionEvent ae)
	  {
		//creates an object that will define the decimal format in STRING
		DecimalFormat df = new DecimalFormat("$#.##");
		
		//All Variables used in the program
		String name, dateS, hotelName=null, hotelLocation, roomAccom = null, input;
		String SRMC, StaxT, STotal, SPPD;
		int  inputS = 0, inputH = 1, index = 0, arrCounter = 6;
		double tax = 1, discount=1, pricePDay=0, dayR;
		boolean hotelB = true, roomA = true, again = true;
						
		//Parallel Arrays
		String [] finalName = new String[7];
		String [] dateArr = new String[7];
		String [] roomC = new String[7];
		String [] roomCWT = new String[7];
		String [] roomTt = new String[7];
		String [] gT = new String[7];
		
		//going to second window
		if(ae.getSource()==b1) {
			new page2();
			f.dispose();
		}
		
	  }
}