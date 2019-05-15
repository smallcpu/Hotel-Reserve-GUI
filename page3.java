import java.util.*;
import java.text.*;
import java.awt.*;
import java.awt.GridLayout;
import java.awt.event.*;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.text.*;
public class page3 {
	private ArrayList <Receipt> list;
	private JFrame f = new JFrame("three");
	private JTable ftft;
	
	page3(ArrayList <Receipt> list){	
		this.list = list;
		//System.out.println(list.size());
		// Data to be displayed in the JTable  
        // Column Names 
        String[] columnNames = { "Name", "Reserve Date", "Days Staying", "Hotel", "Location","Payment Type","Price" }; 
  
        //used this to be able to manipulate the arraylist of arraylist of strings
		DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
		         
        // Initializing the JTable 
        ftft = new JTable(tableModel); 
        //Puts data into the arraylist
        for (int i = 0; i < list.size(); i++) {
        	Receipt currentReceipt = list.get(i);    	
        	Object[] objs = {
        			currentReceipt.getName(),
        			currentReceipt.getDate(),
        			Double.toString(currentReceipt.getNumDays()),
        			currentReceipt.getHotelName(),
        			currentReceipt.getHotelLocation(),
        			currentReceipt.getPaymentType(),
        			"$" + Double.toString(currentReceipt.getTotalPrice())
        	};      	
        	tableModel.addRow(objs);
        }               
        ftft.setBounds(100, 140, 200, 300);  
        // adding it to JScrollPane 
        JScrollPane sp = new JScrollPane(ftft); 
        f.add(sp); 
        
        
		f.setTitle("Receipt");
		f.setSize(500,300);
		f.setLocation(500,200);
		f.setVisible(true);
	}
	public static void main(String [] args) {
		  	  
	  }
}
