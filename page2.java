import java.util.*;
import java.text.*;
import java.awt.*;
import java.awt.GridLayout;
import java.awt.event.*;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.*;
import java.text.*;

public class page2  implements ActionListener{
		private ArrayList<Receipt> receiptList = new ArrayList<>();
	
	  private JFrame fr = new JFrame("two");
	  private JMenuBar menuBar;
	  //all of the primary labels
	  JLabel l1, l2, l3, l4, l5, l6, l7, l8, 
	  		 l10, l11, l12, 	
	  		 //whitespace
	  		 l9, l20, l21, l22, l23, l24, l25,
	  		 l26, l27, l28, l29, l30, l31, l32,
	  		 l33, l34, l35, l36, l37, l38, l39,
	  		 l40, l41, l42, l43, l44, l45, l46,
	  		 l47, l48, l49, l50;
	  //submit and cancel buttons
	  JButton b1, b2;
	  //textfields
	  JTextField t1, t2, t3;
	  //radiobuttons
	  JRadioButton rh1, rh2, rh3, rh4, rh5, rh6,
	  			   rc1,	rc2, rc3, rc4, rc5, rc6,
	  			   rr1, rr2, rr3, rr4,
	  			   rd1, rd2, rd3, rd4, rd5,
	  			   rp1, rp2, rp3;
	  ButtonGroup hotel, city, room, discount, pay;
	  
	  //IMPORTANT DEFAULT CONSTRUCTOR///////////////////////////
	  page2() {    
		//MENU BAR
		menuBar = new JMenuBar();
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		JMenuItem mntmExit = new JMenuItem("Exit");
		mnFile.add(mntmExit);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		JMenuItem mntmAbout = new JMenuItem("About");
		mnHelp.add(mntmAbout);
		fr.setJMenuBar(menuBar);//CREATES THE MENUBAR
		
		mntmExit.addActionListener(e -> System.exit(0));
		  
		mntmAbout.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent arg0)
			 {
			   JOptionPane.showMessageDialog(null, "Made By Jorell Socorro Spring 2019", 
			   "About", JOptionPane.PLAIN_MESSAGE);
			 }
		});	  
		  
		  //labels or white spaces
		  
		  l1 = new JLabel(" Welcome");
		  l2 = new JLabel(" What is your name");
		  l3 = new JLabel(" What is the day of your reservation, (mm-dd-yyy)");
		  l4 = new JLabel(" How many days are you going to reserve");
		  l6 = new JLabel(" Hotel Location:");
		  l8 = new JLabel(" What hotel are you staying in:");
		  l10 = new JLabel( "Please choose the bed type");
		  l11 = new JLabel(" Are you under any special circumstance");
		  l12 = new JLabel(" How will you pay");

		  
		  //whitespaces
		  l5 = new JLabel(" ");
		  l7 = new JLabel(" ");
		  l9 = new JLabel(" ");
		  l20 = new JLabel(" ");
		  l21 = new JLabel(" ");
		  l22 = new JLabel(" ");
		  l23 = new JLabel(" ");
		  l24 = new JLabel(" ");
		  l25 = new JLabel(" ");
		  l26 = new JLabel(" ");
		  l27 = new JLabel(" ");
		  l28 = new JLabel(" ");
		  l29 = new JLabel(" ");
		  l30 = new JLabel(" ");
		  l31 = new JLabel(" ");
		  l32 = new JLabel(" ");
		  l33 = new JLabel(" ");
		  l34 = new JLabel(" ");
		  l35 = new JLabel(" ");
		  l36 = new JLabel(" ");
		  l37 = new JLabel(" ");
		  l38 = new JLabel(" ");
		  l39 = new JLabel(" ");
		  l40 = new JLabel(" ");
		  l41 = new JLabel(" ");
		  l42 = new JLabel(" ");
		  l43 = new JLabel(" ");
		  l44 = new JLabel(" ");
		  l45 = new JLabel(" ");
		  l46 = new JLabel(" ");
		  l47 = new JLabel(" ");
		  l48 = new JLabel(" ");
		  l49 = new JLabel(" ");
		  l50 = new JLabel(" ");
		  
		  //if else buttons
		  b1 = new JButton("Submit");
		  b1.addActionListener(this);
		  b2 = new JButton("Cancel");
		  b2.addActionListener(e -> System.exit(0));
		  //radio buttons
		  //rh hotels
		  rh1 = new JRadioButton("Ritz-Carlton",true);
		  rh2 = new JRadioButton("Comfort Inn");
		  rh3 = new JRadioButton("Hyatt");
		  rh4 = new JRadioButton("The View Hotel");
		  rh5 = new JRadioButton("Grand Hotel");
		  rh6 = new JRadioButton("Plaza Hotel");
		  hotel = new ButtonGroup();
		  hotel.add(rh1);
		  hotel.add(rh2);
		  hotel.add(rh3);
		  hotel.add(rh4);
		  hotel.add(rh5);
		  hotel.add(rh6);
		  //rc cities
		  rc1 = new JRadioButton("Chicago, IL",true);	  
		  rc2 = new JRadioButton("Madison, WI");
		  rc3 = new JRadioButton("Los Angeles, CA");
		  rc4 = new JRadioButton("Sussex, UK");
		  rc5 = new JRadioButton("Mackinac, MI");
		  rc6 = new JRadioButton("New York, NY");
		  city = new ButtonGroup();
		  city.add(rc1);
		  city.add(rc2);
		  city.add(rc3);
		  city.add(rc4);
		  city.add(rc5);
		  city.add(rc6);
		  //rr bed type
		  rr1 = new JRadioButton("Double Bed",true);
		  rr2 = new JRadioButton("Single Bed");
		  rr3 = new JRadioButton("Suit");
		  rr4 = new JRadioButton("10 Suites");
		  room = new ButtonGroup();
		  room.add(rr1);
		  room.add(rr2);
		  room.add(rr3);
		  room.add(rr4);
		  //rd discounts
		  rd1 = new JRadioButton("Student");
		  rd2 = new JRadioButton("Senior (65+ age)");
		  rd3 = new JRadioButton("Birthday Special");
		  rd4 = new JRadioButton("Corporate");
		  rd5 = new JRadioButton("None",true);
		  discount = new ButtonGroup();
		  discount.add(rd1);
		  discount.add(rd2);
		  discount.add(rd3);
		  discount.add(rd4);
		  discount.add(rd5);
		  //payment type
		  rp1 = new JRadioButton("Cash",true);
		  rp2 = new JRadioButton("Card (Visa, American Express, etc.");
		  rp3 = new JRadioButton("EPay (Apple, google, venmo, etc");
		  pay = new ButtonGroup();
		  pay.add(rp1);
		  pay.add(rp2);
		  pay.add(rp3);
		  //TextInput
		  t1 = new JTextField(20);
		  t2 = new JTextField(20);
		  t3 = new JTextField(20);
		  
		  //window settings
		  //horizontal by height
		  fr.setSize(850,500);
		  fr.setLocation(350,200);
		  //row by column
		  
		  
		  //up down, left to right
		  //adding the buttons and titles
		  //row1-name
		  fr.add(l2);
		  fr.add(l9);//whitespace
		  fr.add(t1);		  
		  //row2-arrival
		  fr.add(l3);
		  fr.add(l5);//whitespace
		  fr.add(t2);
		  //row3-days stay
		  fr.add(l4);
		  fr.add(l20);
		  fr.add(t3);
		  //row4-hotels
		  fr.add(l8);
		  fr.add(rh1);
		  fr.add(rh2);
		  fr.add(l21);//
		  fr.add(rh3);
		  fr.add(rh4);
		  fr.add(l22);//
		  fr.add(rh5);
		  fr.add(rh6);		
		  //space between
		  fr.add(l25);
		  fr.add(l26);
		  fr.add(l27);
		 //row5-city 
		  fr.add(l6);
		  fr.add(rc1);
		  fr.add(rc2);
		  fr.add(l23);
		  fr.add(rc3);
		  fr.add(rc4);
		  fr.add(l24);
		  fr.add(rc5);
		  fr.add(rc6);
		  //space between
		  fr.add(l28);
		  fr.add(l29);
		  fr.add(l30);
		  //row6-bed types
		  fr.add(l10);
		  fr.add(rr1);
		  fr.add(rr2);
		  fr.add(l31);
		  fr.add(rr3);
		  fr.add(rr4);
		  //space between
		  fr.add(l32);
		  fr.add(l33);
		  fr.add(l34);
		  //row7-discounts
		  fr.add(l11);
		  fr.add(rd1);
		  fr.add(rd2);
		  fr.add(l35);//
		  fr.add(rd3);
		  fr.add(rd4);
		  fr.add(l36);
		  fr.add(rd5);
		  //space between
		  fr.add(l37);
		  fr.add(l38);
		  fr.add(l39);
		  fr.add(l41);
		  //row8 PaymentType
		  fr.add(l12);	
		  fr.add(rp1);
		  fr.add(rp2);
		  fr.add(l40);
		  fr.add(rp3);
		  //space between
		  fr.add(l44);
		  fr.add(l45);
		  fr.add(l46);
		  //actions
		  fr.add(l42);
		  fr.add(b1);
		  fr.add(l43);
		  fr.add(b2);
		  
		  fr.setLayout(new GridLayout(0,3));
		  fr.setTitle("Hotel Reservation");
		  fr.setVisible(true);
	  }
	  
	  //To prevent from reseting the ArrayList, passing previous arraylist
	  page2(ArrayList<Receipt> pastList) { 
		  
		 this.receiptList = pastList; 
		//MENU BAR
		menuBar = new JMenuBar();		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		JMenuItem mntmExit = new JMenuItem("Exit");
		mnFile.add(mntmExit);	
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		JMenuItem mntmAbout = new JMenuItem("About");
		mnHelp.add(mntmAbout);
		fr.setJMenuBar(menuBar);//CREATES THE MENUBAR	
		mntmExit.addActionListener(e -> System.exit(0));		  
		mntmAbout.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent arg0)
			 {
			   JOptionPane.showMessageDialog(null, "Made By Jorell Socorro Spring 2019", 
			   "About", JOptionPane.PLAIN_MESSAGE);
			 }
		});	  
		  
		  //labels 
		  l1 = new JLabel(" Welcome");
		  l2 = new JLabel(" What is your name");
		  l3 = new JLabel(" What is the day of your reservation, (mm-dd-yyy)");
		  l4 = new JLabel(" How many days are you going to reserve");
		  l6 = new JLabel(" Hotel Location:");
		  l8 = new JLabel(" What hotel are you staying in:");
		  l10 = new JLabel( "Please choose the bed type");
		  l11 = new JLabel(" Are you under any special circumstance");
		  l12 = new JLabel(" How will you pay");

		  
		  //whitespaces
		  l5 = new JLabel(" ");
		  l7 = new JLabel(" ");
		  l9 = new JLabel(" ");
		  l20 = new JLabel(" ");
		  l21 = new JLabel(" ");
		  l22 = new JLabel(" ");
		  l23 = new JLabel(" ");
		  l24 = new JLabel(" ");
		  l25 = new JLabel(" ");
		  l26 = new JLabel(" ");
		  l27 = new JLabel(" ");
		  l28 = new JLabel(" ");
		  l29 = new JLabel(" ");
		  l30 = new JLabel(" ");
		  l31 = new JLabel(" ");
		  l32 = new JLabel(" ");
		  l33 = new JLabel(" ");
		  l34 = new JLabel(" ");
		  l35 = new JLabel(" ");
		  l36 = new JLabel(" ");
		  l37 = new JLabel(" ");
		  l38 = new JLabel(" ");
		  l39 = new JLabel(" ");
		  l40 = new JLabel(" ");
		  l41 = new JLabel(" ");
		  l42 = new JLabel(" ");
		  l43 = new JLabel(" ");
		  l44 = new JLabel(" ");
		  l45 = new JLabel(" ");
		  l46 = new JLabel(" ");
		  l47 = new JLabel(" ");
		  l48 = new JLabel(" ");
		  l49 = new JLabel(" ");
		  l50 = new JLabel(" ");
		  
		  //if else buttons
		  b1 = new JButton("Submit");
		  b1.addActionListener(this);
		  b2 = new JButton("Cancel");
		  b2.addActionListener(e -> System.exit(0));
		  //radio buttons
		  //rh hotels
		  rh1 = new JRadioButton("Ritz-Carlton",true);
		  rh2 = new JRadioButton("Comfort Inn");
		  rh3 = new JRadioButton("Hyatt");
		  rh4 = new JRadioButton("The View Hotel");
		  rh5 = new JRadioButton("Grand Hotel");
		  rh6 = new JRadioButton("Plaza Hotel");
		  hotel = new ButtonGroup();
		  hotel.add(rh1);
		  hotel.add(rh2);
		  hotel.add(rh3);
		  hotel.add(rh4);
		  hotel.add(rh5);
		  hotel.add(rh6);
		  //rc cities
		  rc1 = new JRadioButton("Chicago, IL",true);	  
		  rc2 = new JRadioButton("Madison, WI");
		  rc3 = new JRadioButton("Los Angeles, CA");
		  rc4 = new JRadioButton("Sussex, UK");
		  rc5 = new JRadioButton("Mackinac, MI");
		  rc6 = new JRadioButton("New York, NY");
		  city = new ButtonGroup();
		  city.add(rc1);
		  city.add(rc2);
		  city.add(rc3);
		  city.add(rc4);
		  city.add(rc5);
		  city.add(rc6);
		  //rr bed type
		  rr1 = new JRadioButton("Double Bed",true);
		  rr2 = new JRadioButton("Single Bed");
		  rr3 = new JRadioButton("Suit");
		  rr4 = new JRadioButton("10 Suites");
		  room = new ButtonGroup();
		  room.add(rr1);
		  room.add(rr2);
		  room.add(rr3);
		  room.add(rr4);
		  //rd discounts
		  rd1 = new JRadioButton("Student");
		  rd2 = new JRadioButton("Senior (65+ age)");
		  rd3 = new JRadioButton("Birthday Special");
		  rd4 = new JRadioButton("Corporate");
		  rd5 = new JRadioButton("None",true);
		  discount = new ButtonGroup();
		  discount.add(rd1);
		  discount.add(rd2);
		  discount.add(rd3);
		  discount.add(rd4);
		  discount.add(rd5);
		  //payment type
		  rp1 = new JRadioButton("Cash",true);
		  rp2 = new JRadioButton("Card (Visa, American Express, etc.");
		  rp3 = new JRadioButton("EPay (Apple, google, venmo, etc");
		  pay = new ButtonGroup();
		  pay.add(rp1);
		  pay.add(rp2);
		  pay.add(rp3);
		  //TextInput
		  t1 = new JTextField(20);
		  t2 = new JTextField(20);
		  t3 = new JTextField(20);
		  
		  //window settings
		  //horizontal by height
		  fr.setSize(850,500);
		  fr.setLocation(350,200);
		  //row by column
		  
		  
		  //up down, left to right
		  //adding the buttons and titles
		  //row1-name
		  fr.add(l2);
		  fr.add(l9);//whitespace
		  fr.add(t1);		  
		  //row2-arrival
		  fr.add(l3);
		  fr.add(l5);//whitespace
		  fr.add(t2);
		  //row3-days stay
		  fr.add(l4);
		  fr.add(l20);
		  fr.add(t3);
		  //row4-hotels
		  fr.add(l8);
		  fr.add(rh1);
		  fr.add(rh2);
		  fr.add(l21);//
		  fr.add(rh3);
		  fr.add(rh4);
		  fr.add(l22);//
		  fr.add(rh5);
		  fr.add(rh6);		
		  //space between
		  fr.add(l25);
		  fr.add(l26);
		  fr.add(l27);
		 //row5-city 
		  fr.add(l6);
		  fr.add(rc1);
		  fr.add(rc2);
		  fr.add(l23);
		  fr.add(rc3);
		  fr.add(rc4);
		  fr.add(l24);
		  fr.add(rc5);
		  fr.add(rc6);
		  //space between
		  fr.add(l28);
		  fr.add(l29);
		  fr.add(l30);
		  //row6-bed types
		  fr.add(l10);
		  fr.add(rr1);
		  fr.add(rr2);
		  fr.add(l31);
		  fr.add(rr3);
		  fr.add(rr4);
		  //space between
		  fr.add(l32);
		  fr.add(l33);
		  fr.add(l34);
		  //row7-discounts
		  fr.add(l11);
		  fr.add(rd1);
		  fr.add(rd2);
		  fr.add(l35);//
		  fr.add(rd3);
		  fr.add(rd4);
		  fr.add(l36);
		  fr.add(rd5);
		  //space between
		  fr.add(l37);
		  fr.add(l38);
		  fr.add(l39);
		  fr.add(l41);
		  //row8 PaymentType
		  fr.add(l12);	
		  fr.add(rp1);
		  fr.add(rp2);
		  fr.add(l40);
		  fr.add(rp3);
		  //space between
		  fr.add(l44);
		  fr.add(l45);
		  fr.add(l46);
		  //actions
		  fr.add(l42);
		  fr.add(b1);
		  fr.add(l43);
		  fr.add(b2);
		  
		  fr.setLayout(new GridLayout(0,3));
		  fr.setTitle("Hotel Reservation");
		  fr.setVisible(true);
	  }

	  
	  
	  
	  
	  
	  

	public static void main(String [] args) {
		  new page2();	  
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
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//creates an object that will define the decimal format in STRING
		DecimalFormat df = new DecimalFormat("#.##");
		
		//All Variables used in the program
		String name="", dateS="", numD="", 
		hotelName="", hotelLocation="", roomType="", paymentType="";
		int input;
		
		String SRMC, StaxT, STotal = "", SPPD;
		
		int  inputS = 0, inputH = 1, index = 0, arrCounter = 6;
		double tax = 1, discount=1, dayR=0, priceHotel=0;
		boolean hotelB = true, roomA = true, again = true;
		
		
		
		//Parallel Arrays
		String [] finalName = new String[7];
		String [] dateArr = new String[7];
		String [] roomC = new String[7];
		String [] roomCWT = new String[7];
		String [] roomTt = new String[7];
		String [] gT = new String[7];
		
		//hotels
		if (rh1.isSelected()==true) {
			priceHotel = 350;
			hotelName = "Ritz-Carlton";
			tax = .09;
		}
		if (rh2.isSelected()==true) {
			priceHotel = 141;
			hotelName = "Comfort-Inn";
			tax = .07;
		}
		if (rh3.isSelected()==true) {
			priceHotel =  150;
			hotelName = "Hyatt";
			tax = .1;
		}
		if (rh4.isSelected()==true) {
			priceHotel = 61;
			hotelName = "The View Hotel";
			tax = .01;
		}
		if (rh5.isSelected()==true) {
			priceHotel = 380;
			hotelName = "Grand Hotel";
			tax = .06;
		}
		if (rh6.isSelected()==true) {
			priceHotel = 800;
			hotelName = "Plaza Hotel";
			tax = .08;
		}
		
		//Hotel Location
		if(rc1.isSelected()==true) {
			hotelLocation= "Chicago, IL";
		}
		if(rc2.isSelected()==true) {
			hotelLocation= "Madison WI";
		}
		if(rc3.isSelected()==true) {
			hotelLocation= "Los Angeles, CA";
		}
		if(rc4.isSelected()==true) {
			hotelLocation= "Sussex, UK";
		}
		if(rc5.isSelected()==true) {
			hotelLocation= "Mackinac, MI";
		}
		if(rc6.isSelected()==true) {
			hotelLocation= "New York, NY";
		}
		
		//Bed Type
		if(rr1.isSelected()==true) {
			roomType="Double Bed";
		}
		if(rr2.isSelected()==true) {
			roomType="Single Bed";
		}
		if(rr3.isSelected()==true) {
			roomType="Suit";
		}
		if(rr4.isSelected()==true) {
			roomType="10 Suits";
			}
		
		//Discount
		if(rd1.isSelected()==true) {
			discount = .10;
		}
		if(rd2.isSelected()==true) {
			discount = .20;
		}
		if(rd3.isSelected()==true) {
			discount = .15;
		}
		if(rd4.isSelected()==true) {		
			discount=1;
		}
		if(rd5.isSelected()==true) {
			discount = 1;
		}
		
		//payment
		if(rp1.isSelected()==true) {
			paymentType="Cash";
		}
		if(rp2.isSelected()==true) {
			paymentType="Card";
		}
		if(rp3.isSelected()==true) {
			paymentType="EPay";
		}
		
		//press submit
		if(e.getSource() == b1) {
			try {
				name = t1.getText();
				dateS = t2.getText();
				numD = t3.getText();
				//runs the calculation methods and returns to a holding variable
				double RMC = roomCostCalc(priceHotel, Double.parseDouble(numD));
				double taxT = taxTotal(tax,RMC);
				double Total = grandTotal(discount, taxT);
				//Convert these values to strings and format to the 2nd decimal place
				 SRMC = df.format(RMC);
				 StaxT = df.format(taxT);
				 STotal = df.format(Total);
				 SPPD = df.format(priceHotel);		
				if(rd4.isSelected()==true) {
					int converter = Integer.parseInt(numD);	
					if(converter > 5) {
						discount = .25;
					}
				}		
				fr.dispose();
				input = JOptionPane.showConfirmDialog(null, "again?", 
		  				  "Continue", JOptionPane.YES_NO_OPTION); 
				if(input!=1) {
					receiptList.add(new Receipt(name, dateS, Double.parseDouble(numD), hotelName, hotelLocation, paymentType, Double.parseDouble(STotal) ));
					System.out.println("Added a new receipt");
					new page2(receiptList);
					//increment array index
				}
				else {
					receiptList.add(new Receipt(name, dateS, Double.parseDouble(numD), hotelName, hotelLocation, paymentType, Double.parseDouble(STotal) ));
					//System.out.println(Double.parseDouble(STotal));
					JFrame jf = new JFrame("Display");
					new page3(receiptList);
				}
			}
			catch(Exception ee) {
				JOptionPane.showMessageDialog(null, "Please Fix The Number of Days", 
			  				  "Order Summary", JOptionPane.PLAIN_MESSAGE);
			}
			
		/*	//testing purposes
			JOptionPane.showMessageDialog(null, "Summary: \n" + "Hello "+ name + "!!\n" + "Your dates:"  + dateS + "\n" + 
			"Your numD:"+numD+"\n"+"hotel:"+STotal+"\n"+"location:"+hotelLocation+"\n"+"type:"+roomType+"\n"+"discount:"+discount+
			"\n"+"payment:"+paymentType, 
  				  "Order Summary", JOptionPane.PLAIN_MESSAGE); 
		*/	//put information into array
		}
		
		
		//displsy receipt. go to pg 3
	}
}
