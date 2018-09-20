import java.io.*;
import java.lang.Object;
import java.util.Scanner;
import static java.lang.System.*;
import java.util.Calendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
import java.io.PrintWriter;
import java.util.ArrayList;
class Trips{
	public static void main (String args[]){
	
		//Reading a file that list all filenames and store them in an arraylist named listoffiles
	
		ArrayList<String> listoffiles = new ArrayList<String>();
		try{
			
			Scanner scan = new Scanner (new File(args[0]));
			while (scan.hasNextLine()) {
				listoffiles.add(scan.nextLine());
			}
			
			for(String listoffiles_elem: listoffiles){
				System.out.println(listoffiles_elem);
			}

		}catch(Exception e){
			System.out.println("Can not open: " + args[0]);
		}
		
		//Create pointer to trips.txt to be written later
		
		File toOutput= new File(args[1]);
		PrintWriter printOutput = null;
		
		try{
			printOutput = new PrintWriter(toOutput);
		}catch(Exception e){
			System.out.println("Can not open: " + args[1]);
		}
		
		//Write to trips.txt the fields of the file
		printOutput.write("route_id,service_id,trip_id" + "\n");
		
		
		//Adding content to trips.txt to retain information for R1 and it services
		int tripnumber = 0;
		routeone(printOutput, tripnumber, listoffiles);
		
		/*		
		//Reset tripnumber to 0 as we begin writing now for R2 and its services
		tripnumber = 0;
		routetwo(printOutput, tripnumber, listoffiles);
		
		//Reset tripnumber to 0 as we begin writing now for R3 and its services
		tripnumber = 0;
		routethree(printOutput, tripnumber, listoffiles);
		
		//Reset tripnumber to 0 as we begin writing now for R4 and its services
		tripnumber = 0;
		routefour(printOutput, tripnumber, listoffiles);
		
		//Reset tripnumber to 0 as we begin writing now for R5 and its services
		tripnumber = 0;
		routefive(printOutput, tripnumber, listoffiles); 
		
		//Reset tripnumber to 0 as we begin writing now for R6 and its services
		tripnumber = 0;
		routesix(printOutput, tripnumber, listoffiles);
		
		//System.out.println(tripnumber);

		*/
		
		printOutput.close();
		
		
	}
	
	public static void routeone(PrintWriter printOutput, int tripnumber, ArrayList<String> listoffiles){

		Scanner scan = null;
		try{
			scan = new Scanner (new File(listoffiles.get(0)));
			while (scan.hasNextLine()) {
				printOutput.write("R1" + ", " + "2017SpringWDMonThur" + ", " + "T1_" + (tripnumber+1)+ "\n");	
				tripnumber++;
				scan.nextLine();		
			}
			scan.close();
		}catch(Exception e){
			System.out.println("Can not open: " + listoffiles.get(0));
		}

		//Do the same thing to retain infromation for R1, 2017SpringWDFriday service
		try{
			scan = new Scanner (new File(listoffiles.get(1)));
			while (scan.hasNextLine()) {
				printOutput.write("R1" + ", " + "2017SpringWDFriday" + ", " + "T1_" + (tripnumber+1)+ "\n");	
				tripnumber++;
				scan.nextLine();		
			}
			scan.close();
		}catch(Exception e){
			System.out.println("Can not open: " + listoffiles.get(1));
		}


		//Do the same thing to retain infromation for R1, 2017SpringWESaturday service
		try{
			scan = new Scanner (new File(listoffiles.get(2)));
			while (scan.hasNextLine()) {
				printOutput.write("R1" + ", " + "2017SpringWESat" + ", " + "T1_" + (tripnumber+1)+ "\n");	
				tripnumber++;
				scan.nextLine();		
			}
			scan.close();
		}catch(Exception e){
			System.out.println("Can not open: " + listoffiles.get(2));
		}


		//Do the same thing to retain infromation for R1, 2017SpringWESunday service
		try{
			scan = new Scanner (new File(listoffiles.get(3)));
			while (scan.hasNextLine()) {
				printOutput.write("R1" + ", " + "2017SpringWESun" + ", " + "T1_" + (tripnumber+1)+ "\n");	
				tripnumber++;
				scan.nextLine();		
			}
			scan.close();
		}catch(Exception e){
			System.out.println("Can not open: " + listoffiles.get(3));
		}
		
		//Do the same thing to retain infromation for R1, 2017SpringFinals service
		try{
			scan = new Scanner (new File(listoffiles.get(4)));
			while (scan.hasNextLine()) {
				printOutput.write("R1" + ", " + "2017SpringWESun" + ", " + "T1_" + (tripnumber+1)+ "\n");	
				tripnumber++;
				scan.nextLine();		
			}
			scan.close();
		}catch(Exception e){
			System.out.println("Can not open: " + listoffiles.get(4));
		}
		
		//Do the same thing to retain infromation for R1, 2017SpringIntermission service
		try{
			scan = new Scanner (new File(listoffiles.get(5)));
			while (scan.hasNextLine()) {
				printOutput.write("R1" + ", " + "2017SpringWESun" + ", " + "T1_" + (tripnumber+1)+ "\n");	
				tripnumber++;
				scan.nextLine();		
			}
			scan.close();
		}catch(Exception e){
			System.out.println("Can not open: " + listoffiles.get(5));
		}
		

	}
	
	
	public static void routetwo(PrintWriter printOutput, int tripnumber, ArrayList<String> listoffiles){
		Scanner scan = null;
		
		//Now we are adding content to trips.txt to retain information for R2, 2017SpringWDMonThur service
		
		try{
			scan = new Scanner (new File(listoffiles.get(6)));
			while (scan.hasNextLine()) {
				printOutput.write("R2" + ", " + "2017SpringWDMonThur" + ", " + "T2_" + (tripnumber+1)+ "\n");	
				tripnumber++;
				scan.nextLine();		
			}
			scan.close();
		}catch(Exception e){
			System.out.println("Can not open: " + listoffiles.get(6));
		}
		
		//Do the to retain information for R2, 2017SpringWDFriday service
		try{
			scan = new Scanner (new File(listoffiles.get(7)));
			while (scan.hasNextLine()) {
				printOutput.write("R2" + ", " + "2017SpringWDFriday" + ", " + "T2_" + (tripnumber+1)+ "\n");	
				tripnumber++;
				scan.nextLine();		
			}
			scan.close();
		}catch(Exception e){
			System.out.println("Can not open: " + listoffiles.get(7));
		}
		
		//Do the to retain information for R2, 2017SpringWESaturday service
		try{
			scan = new Scanner (new File(listoffiles.get(8)));
			while (scan.hasNextLine()) {
				printOutput.write("R2" + ", " + "2017SpringWESat" + ", " + "T2_" + (tripnumber+1)+ "\n");	
				tripnumber++;
				scan.nextLine();		
			}
			scan.close();
		}catch(Exception e){
			System.out.println("Can not open: " + listoffiles.get(8));
		}
		
		//Do the to retain information for R2, 2017SpringWESunday service
		try{
			scan = new Scanner (new File(listoffiles.get(9)));
			while (scan.hasNextLine()) {
				printOutput.write("R2" + ", " + "2017SpringWESun" + ", " + "T2_" + (tripnumber+1)+ "\n");	
				tripnumber++;
				scan.nextLine();		
			}
			scan.close();
		}catch(Exception e){
			System.out.println("Can not open: " + listoffiles.get(9));
		}
		
		//Do the to retain information for R2, 2017SpringFinals service
		try{
			scan = new Scanner (new File(listoffiles.get(10)));
			while (scan.hasNextLine()) {
				printOutput.write("R2" + ", " + "2017SpringWESun" + ", " + "T2_" + (tripnumber+1)+ "\n");	
				tripnumber++;
				scan.nextLine();		
			}
			scan.close();
		}catch(Exception e){
			System.out.println("Can not open: " + listoffiles.get(10));
		}
		
		//Do the to retain information for R2, 2017SpringFinals service
		try{
			scan = new Scanner (new File(listoffiles.get(11)));
			while (scan.hasNextLine()) {
				printOutput.write("R2" + ", " + "2017SpringWESun" + ", " + "T2_" + (tripnumber+1)+ "\n");	
				tripnumber++;
				scan.nextLine();		
			}
			scan.close();
		}catch(Exception e){
			System.out.println("Can not open: " + listoffiles.get(11));
		}
		
	}	
	
	
	public static void routethree(PrintWriter printOutput, int tripnumber, ArrayList<String> listoffiles){
		Scanner scan = null;
		
		//Now we are adding content to trips.txt to retain information for R3, 2017SpringWDMonThur service
		
		try{
			scan = new Scanner (new File(listoffiles.get(8)));
			while (scan.hasNextLine()) {
				printOutput.write("R3" + ", " + "2017SpringWDMonThur" + ", " + "T3_" + (tripnumber+1)+ "\n");	
				tripnumber++;
				scan.nextLine();		
			}
			scan.close();
		}catch(Exception e){
			System.out.println("Can not open: " + listoffiles.get(8));
		}
		
		//Do the to retain information for R3, 2017SpringWDFriday service
		try{
			scan = new Scanner (new File(listoffiles.get(9)));
			while (scan.hasNextLine()) {
				printOutput.write("R3" + ", " + "2017SpringWDFriday" + ", " + "T3_" + (tripnumber+1)+ "\n");	
				tripnumber++;
				scan.nextLine();		
			}
			scan.close();
		}catch(Exception e){
			System.out.println("Can not open: " + listoffiles.get(9));
		}
		
	}	
	
	
	public static void routefour(PrintWriter printOutput, int tripnumber, ArrayList<String> listoffiles){
		Scanner scan = null;
		
		//Now we are adding content to trips.txt to retain information for R4, 2017SpringWDMonThur service
		
		try{
			scan = new Scanner (new File(listoffiles.get(10)));
			while (scan.hasNextLine()) {
				printOutput.write("R4" + ", " + "2017SpringWDMonThur" + ", " + "T4_" + (tripnumber+1)+ "\n");	
				tripnumber++;
				scan.nextLine();		
			}
			scan.close();
		}catch(Exception e){
			System.out.println("Can not open: " + listoffiles.get(10));
		}
		
		//Do the to retain information for R4, 2017SpringWDFriday service
		try{
			scan = new Scanner (new File(listoffiles.get(11)));
			while (scan.hasNextLine()) {
				printOutput.write("R4" + ", " + "2017SpringWDFriday" + ", " + "T4_" + (tripnumber+1)+ "\n");	
				tripnumber++;
				scan.nextLine();		
			}
			scan.close();
		}catch(Exception e){
			System.out.println("Can not open: " + listoffiles.get(11));
		}
		
	}
	
	
	public static void routefive(PrintWriter printOutput, int tripnumber, ArrayList<String> listoffiles){

		Scanner scan = null;
		
		//Now we are adding content to trips.txt to retain information for R5, 2017SpringWDMonThur service
		try{
			scan = new Scanner (new File(listoffiles.get(12)));
			while (scan.hasNextLine()) {
				printOutput.write("R5" + ", " + "2017SpringWDMonThur" + ", " + "T5_" + (tripnumber+1)+ "\n");	
				tripnumber++;
				scan.nextLine();		
			}
			scan.close();
		}catch(Exception e){
			System.out.println("Can not open: " + listoffiles.get(12));
		}

		//Do the same thing to retain infromation for R5, 2017SpringWDFriday service
		try{
			scan = new Scanner (new File(listoffiles.get(13)));
			while (scan.hasNextLine()) {
				printOutput.write("R5" + ", " + "2017SpringWDFriday" + ", " + "T5_" + (tripnumber+1)+ "\n");	
				tripnumber++;
				scan.nextLine();		
			}
			scan.close();
		}catch(Exception e){
			System.out.println("Can not open: " + listoffiles.get(13));
		}


		//Do the same thing to retain infromation for R5, 2017SpringWESaturday service
		try{
			scan = new Scanner (new File(listoffiles.get(14)));
			while (scan.hasNextLine()) {
				printOutput.write("R5" + ", " + "2017SpringWESaturday" + ", " + "T5_" + (tripnumber+1)+ "\n");	
				tripnumber++;
				scan.nextLine();		
			}
			scan.close();
		}catch(Exception e){
			System.out.println("Can not open: " + listoffiles.get(14));
		}


		//Do the same thing to retain infromation for R5, 2017SpringWESunday service
		try{
			scan = new Scanner (new File(listoffiles.get(15)));
			while (scan.hasNextLine()) {
				printOutput.write("R5" + ", " + "2017SpringWESunday" + ", " + "T5_" + (tripnumber+1)+ "\n");	
				tripnumber++;
				scan.nextLine();		
			}
			scan.close();
		}catch(Exception e){
			System.out.println("Can not open: " + listoffiles.get(15));
		}
		

	}
	
	public static void routesix(PrintWriter printOutput, int tripnumber, ArrayList<String> listoffiles){

		Scanner scan = null;
		//Now we are adding content to trips.txt to retain information for R6, 2017SpringWDMonThur service
		try{
			scan = new Scanner (new File(listoffiles.get(16)));
			while (scan.hasNextLine()) {
				printOutput.write("R6" + ", " + "2017SpringWDMonThur" + ", " + "T6_" + (tripnumber+1)+ "\n");	
				tripnumber++;
				scan.nextLine();		
			}
			scan.close();
		}catch(Exception e){
			System.out.println("Can not open: " + listoffiles.get(16));
		}

		//Do the same thing to retain infromation for R6, 2017SpringWDFriday service
		try{
			scan = new Scanner (new File(listoffiles.get(17)));
			while (scan.hasNextLine()) {
				printOutput.write("R6" + ", " + "2017SpringWDFriday" + ", " + "T6_" + (tripnumber+1)+ "\n");	
				tripnumber++;
				scan.nextLine();		
			}
			scan.close();
		}catch(Exception e){
			System.out.println("Can not open: " + listoffiles.get(17));
		}


		//Do the same thing to retain infromation for R6, 2017SpringWESaturday service
		try{
			scan = new Scanner (new File(listoffiles.get(18)));
			while (scan.hasNextLine()) {
				printOutput.write("R6" + ", " + "2017SpringWESaturday" + ", " + "T6_" + (tripnumber+1)+ "\n");	
				tripnumber++;
				scan.nextLine();		
			}
			scan.close();
		}catch(Exception e){
			System.out.println("Can not open: " + listoffiles.get(18));
		}


		//Do the same thing to retain infromation for R6, 2017SpringWESunday service
		try{
			scan = new Scanner (new File(listoffiles.get(19)));
			while (scan.hasNextLine()) {
				printOutput.write("R6" + ", " + "2017SpringWESunday" + ", " + "T6_" + (tripnumber+1)+ "\n");	
				tripnumber++;
				scan.nextLine();		
			}
			scan.close();
		}catch(Exception e){
			System.out.println("Can not open: " + listoffiles.get(19));
		}
		

	}
	
	
}



