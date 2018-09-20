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

class Stoptimes{
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
		printOutput.write("trip_id, arrival_time, departure_time, stop_id, stop_sequence, trip_index" + "\n");
		
		
		//Adding content to trips.txt to retain information for R1 and it services
		int tripnumber = 0;
		int tripindex = 0; 
		routeone(printOutput, tripnumber, listoffiles, tripindex);
		
		
		//Reset tripnumber to 0 as we begin writing now for R2 and its services
		//tripnumber = 0;
		routetwo(printOutput, tripnumber, listoffiles, tripindex);

		/*
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
		
		//System.out.println(tripnumber);*/
		
		printOutput.close();
		
		
	}
	
	public static void routeone(PrintWriter printOutput, int tripnumber, ArrayList<String> listoffiles, int tripindex){
	
		
		ArrayList<String> spr17_monthur_loopo  = new ArrayList<String>();
		DateFormat format_time  = new SimpleDateFormat("HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		Date parse_starting_time;
		String starting_time;
		String starting_time_twenty;
		
		

		Scanner scan = null;
		try{
			scan = new Scanner (new File(listoffiles.get(0)));
			while (scan.hasNextLine()) {
				spr17_monthur_loopo.add(scan.nextLine());
				/*starting_time = scan.nextLine();
				parse_starting_time = format_time.parse(starting_time);
				cal.setTime(parse_starting_time);
				cal.add(Calendar.MINUTE, 20);
				starting_time_twenty = format_time.format(cal.getTime());
				System.out.println(starting_time_twenty);
					
				tripnumber++;
				tripindex++;
				//scan.nextLine();*/		
			}
			scan.close();
		}catch(Exception e){
			System.out.println("Can not open: " + listoffiles.get(0));
		}
		
		for(int b=0; b<spr17_monthur_loopo.size(); b++){
			printOutput.write("T1_" + (tripnumber+1) + ", " + spr17_monthur_loopo.get(b) + ", " + spr17_monthur_loopo.get(b) + ", " +"19" + ", " + "1" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T1_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"16" + ", " + "2" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T1_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"14" + ", " + "3" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T1_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"12" + ", " + "4" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T1_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"11" + ", " + "5" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T1_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"9" + ", " + "6" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T1_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"8" + ", " + "7" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T1_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"7" + ", " + "8" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T1_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"4" + ", " + "9" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T1_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"1" + ", " + "10" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T1_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"28" + ", " + "11" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T1_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"27" + ", " + "12" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T1_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"25" + ", " + "13" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T1_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"24" + ", " + "14" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T1_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"21" + ", " + "15" + ", " +  (tripindex+1) +"\n");
			try{
				parse_starting_time = format_time.parse(spr17_monthur_loopo.get(b));
				cal.setTime(parse_starting_time);
				cal.add(Calendar.MINUTE, 20);
				starting_time_twenty = format_time.format(cal.getTime());
				printOutput.write("T1_" + (tripnumber+1) + ", " + starting_time_twenty + ", " + starting_time_twenty + ", " +"19" + ", " + "16" + ", " +  (tripindex+1) +"\n");
			//System.out.println(starting_time_twenty);
			}catch(ParseException a){
					System.out.println("can't parse");
			}
							tripnumber++;
			tripindex++;
		}

		tripindex = 0;


		ArrayList<String> spr17_friday_loopo  = new ArrayList<String>();

		try{
			scan = new Scanner (new File(listoffiles.get(1)));
			while (scan.hasNextLine()) {
				spr17_friday_loopo.add(scan.nextLine());	
			}
			scan.close();
		}catch(Exception e){
			System.out.println("Can not open: " + listoffiles.get(1));
		}
		
		for(int b=0; b<spr17_friday_loopo.size(); b++){
			printOutput.write("T1_" + (tripnumber+1) + ", " + spr17_friday_loopo.get(b) + ", " + spr17_friday_loopo.get(b) + ", " +"19" + ", " + "1" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T1_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"16" + ", " + "2" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T1_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"14" + ", " + "3" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T1_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"12" + ", " + "4" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T1_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"11" + ", " + "5" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T1_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"9" + ", " + "6" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T1_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"8" + ", " + "7" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T1_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"7" + ", " + "8" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T1_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"4" + ", " + "9" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T1_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"1" + ", " + "10" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T1_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"28" + ", " + "11" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T1_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"27" + ", " + "12" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T1_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"25" + ", " + "13" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T1_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"24" + ", " + "14" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T1_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"21" + ", " + "15" + ", " +  (tripindex+1) +"\n");
			try{
				parse_starting_time = format_time.parse(spr17_friday_loopo.get(b));
				cal.setTime(parse_starting_time);
				cal.add(Calendar.MINUTE, 20);
				starting_time_twenty = format_time.format(cal.getTime());
				printOutput.write("T1_" + (tripnumber+1) + ", " + starting_time_twenty + ", " + starting_time_twenty + ", " +"19" + ", " + "16" + ", " +  (tripindex+1) +"\n");
			//System.out.println(starting_time_twenty);
			}catch(ParseException a){
					System.out.println("can't parse");
			}
				tripnumber++;
				tripindex++;
		}

		tripindex = 0;


		ArrayList<String> spr17_saturday_loopo  = new ArrayList<String>();

		try{
			scan = new Scanner (new File(listoffiles.get(2)));
			while (scan.hasNextLine()) {
				spr17_saturday_loopo.add(scan.nextLine());	
			}
			scan.close();
		}catch(Exception e){
			System.out.println("Can not open: " + listoffiles.get(2));
		}
		
		for(int b=0; b<spr17_saturday_loopo.size(); b++){
			printOutput.write("T1_" + (tripnumber+1) + ", " + spr17_saturday_loopo.get(b) + ", " + spr17_saturday_loopo.get(b) + ", " +"19" + ", " + "1" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T1_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"16" + ", " + "2" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T1_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"14" + ", " + "3" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T1_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"12" + ", " + "4" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T1_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"11" + ", " + "5" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T1_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"9" + ", " + "6" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T1_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"8" + ", " + "7" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T1_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"7" + ", " + "8" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T1_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"4" + ", " + "9" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T1_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"1" + ", " + "10" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T1_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"28" + ", " + "11" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T1_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"27" + ", " + "12" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T1_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"25" + ", " + "13" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T1_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"24" + ", " + "14" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T1_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"21" + ", " + "15" + ", " +  (tripindex+1) +"\n");
			try{
				parse_starting_time = format_time.parse(spr17_saturday_loopo.get(b));
				cal.setTime(parse_starting_time);
				cal.add(Calendar.MINUTE, 20);
				starting_time_twenty = format_time.format(cal.getTime());
				printOutput.write("T1_" + (tripnumber+1) + ", " + starting_time_twenty + ", " + starting_time_twenty + ", " +"19" + ", " + "16" + ", " +  (tripindex+1) +"\n");
				System.out.println(starting_time_twenty);
			}catch(ParseException a){
					System.out.println("can't parse");
			}
				tripnumber++;
				tripindex++;
		}

		tripindex = 0;


		ArrayList<String> spr17_sunday_loopo  = new ArrayList<String>();

		try{
			scan = new Scanner (new File(listoffiles.get(3)));
			while (scan.hasNextLine()) {
				spr17_sunday_loopo.add(scan.nextLine());	
			}
			scan.close();
		}catch(Exception e){
			System.out.println("Can not open: " + listoffiles.get(3));
		}
		
		for(int b=0; b<spr17_sunday_loopo.size(); b++){
			printOutput.write("T1_" + (tripnumber+1) + ", " + spr17_sunday_loopo.get(b) + ", " + spr17_sunday_loopo.get(b) + ", " +"19" + ", " + "1" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T1_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"16" + ", " + "2" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T1_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"14" + ", " + "3" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T1_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"12" + ", " + "4" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T1_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"11" + ", " + "5" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T1_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"9" + ", " + "6" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T1_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"8" + ", " + "7" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T1_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"7" + ", " + "8" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T1_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"4" + ", " + "9" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T1_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"1" + ", " + "10" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T1_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"28" + ", " + "11" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T1_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"27" + ", " + "12" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T1_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"25" + ", " + "13" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T1_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"24" + ", " + "14" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T1_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"21" + ", " + "15" + ", " +  (tripindex+1) +"\n");
			try{
				parse_starting_time = format_time.parse(spr17_sunday_loopo.get(b));
				cal.setTime(parse_starting_time);
				cal.add(Calendar.MINUTE, 20);
				starting_time_twenty = format_time.format(cal.getTime());
				printOutput.write("T1_" + (tripnumber+1) + ", " + starting_time_twenty + ", " + starting_time_twenty + ", " +"19" + ", " + "16" + ", " +  (tripindex+1) +"\n");
			//System.out.println(starting_time_twenty);
			}catch(ParseException a){
					System.out.println("can't parse");
			}
				tripnumber++;
				tripindex++;
		}

		tripnumber = 0;
		tripindex = 0;


		

	}
	
	
	public static void routetwo(PrintWriter printOutput, int tripnumber, ArrayList<String> listoffiles, int tripindex){
		Scanner scan = null;
		
		ArrayList<String> spr17_monthur_loopin  = new ArrayList<String>();
		DateFormat format_time  = new SimpleDateFormat("HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		Date parse_starting_time;
		String starting_time;
		String starting_time_twenty;
		
		try{
			scan = new Scanner (new File(listoffiles.get(4)));
			while (scan.hasNextLine()) {
				spr17_monthur_loopin.add(scan.nextLine());	
			}
			scan.close();
		}catch(Exception e){
			System.out.println("Can not open: " + listoffiles.get(4));
		}
		
		for(int b=0; b<spr17_monthur_loopin.size(); b++){
			printOutput.write("T2_" + (tripnumber+1) + ", " + spr17_monthur_loopin.get(b) + ", " + spr17_monthur_loopin.get(b) + ", " +"20" + ", " + "1" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T2_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"18" + ", " + "2" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T2_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"23" + ", " + "3" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T2_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"26" + ", " + "4" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T2_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"29" + ", " + "5" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T2_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"2" + ", " + "6" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T2_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"3" + ", " + "7" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T2_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"5" + ", " + "8" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T2_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"6" + ", " + "9" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T2_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"10" + ", " + "10" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T2_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"15" + ", " + "11" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T2_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"17" + ", " + "12" + ", " +  (tripindex+1) +"\n");
			try{
				parse_starting_time = format_time.parse(spr17_monthur_loopin.get(b));
				cal.setTime(parse_starting_time);
				cal.add(Calendar.MINUTE, 20);
				starting_time_twenty = format_time.format(cal.getTime());
				printOutput.write("T2_" + (tripnumber+1) + ", " + starting_time_twenty + ", " + starting_time_twenty + ", " +"20" + ", " + "13" + ", " +  (tripindex+1) +"\n");
			//System.out.println(starting_time_twenty);
			}catch(ParseException a){
					System.out.println("can't parse");
			}

			tripnumber++;
			tripindex++;
		}

		tripindex = 0;


		
		ArrayList<String> spr17_friday_loopin  = new ArrayList<String>();

		try{
			scan = new Scanner (new File(listoffiles.get(5)));
			while (scan.hasNextLine()) {
				spr17_friday_loopin.add(scan.nextLine());	
			}
			scan.close();
		}catch(Exception e){
			System.out.println("Can not open: " + listoffiles.get(5));
		}
		
		for(int b=0; b<spr17_friday_loopin.size(); b++){
			printOutput.write("T2_" + (tripnumber+1) + ", " + spr17_friday_loopin.get(b) + ", " + spr17_friday_loopin.get(b) + ", " +"20" + ", " + "1" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T2_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"18" + ", " + "2" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T2_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"23" + ", " + "3" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T2_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"26" + ", " + "4" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T2_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"29" + ", " + "5" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T2_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"2" + ", " + "6" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T2_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"3" + ", " + "7" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T2_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"5" + ", " + "8" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T2_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"6" + ", " + "9" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T2_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"10" + ", " + "10" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T2_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"15" + ", " + "11" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T2_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"17" + ", " + "12" + ", " +  (tripindex+1) +"\n");
			try{
				parse_starting_time = format_time.parse(spr17_friday_loopin.get(b));
				cal.setTime(parse_starting_time);
				cal.add(Calendar.MINUTE, 20);
				starting_time_twenty = format_time.format(cal.getTime());
				printOutput.write("T2_" + (tripnumber+1) + ", " + starting_time_twenty + ", " + starting_time_twenty + ", " +"20" + ", " + "13" + ", " +  (tripindex+1) +"\n");
			//System.out.println(starting_time_twenty);
			}catch(ParseException a){
					System.out.println("can't parse");
			}
				tripnumber++;
				tripindex++;
		}

		tripindex = 0;


		ArrayList<String> spr17_saturday_loopin  = new ArrayList<String>();

		try{
			scan = new Scanner (new File(listoffiles.get(6)));
			while (scan.hasNextLine()) {
				spr17_saturday_loopin.add(scan.nextLine());	
			}
			scan.close();
		}catch(Exception e){
			System.out.println("Can not open: " + listoffiles.get(6));
		}
		
		for(int b=0; b<spr17_saturday_loopin.size(); b++){
			printOutput.write("T2_" + (tripnumber+1) + ", " + spr17_saturday_loopin.get(b) + ", " + spr17_saturday_loopin.get(b) + ", " +"20" + ", " + "1" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T2_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"18" + ", " + "2" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T2_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"23" + ", " + "3" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T2_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"26" + ", " + "4" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T2_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"29" + ", " + "5" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T2_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"2" + ", " + "6" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T2_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"3" + ", " + "7" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T2_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"5" + ", " + "8" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T2_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"6" + ", " + "9" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T2_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"10" + ", " + "10" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T2_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"15" + ", " + "11" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T2_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"17" + ", " + "12" + ", " +  (tripindex+1) +"\n");
			try{
				parse_starting_time = format_time.parse(spr17_saturday_loopin.get(b));
				cal.setTime(parse_starting_time);
				cal.add(Calendar.MINUTE, 20);
				starting_time_twenty = format_time.format(cal.getTime());
				printOutput.write("T2_" + (tripnumber+1) + ", " + starting_time_twenty + ", " + starting_time_twenty + ", " +"20" + ", " + "13" + ", " +  (tripindex+1) +"\n");
				System.out.println(starting_time_twenty);
			}catch(ParseException a){
					System.out.println("can't parse");
			}
				tripnumber++;
				tripindex++;
		}

		tripindex = 0;


		ArrayList<String> spr17_sunday_loopin  = new ArrayList<String>();

		try{
			scan = new Scanner (new File(listoffiles.get(7)));
			while (scan.hasNextLine()) {
				spr17_sunday_loopin.add(scan.nextLine());	
			}
			scan.close();
		}catch(Exception e){
			System.out.println("Can not open: " + listoffiles.get(7));
		}
		
		for(int b=0; b<spr17_sunday_loopin.size(); b++){
			printOutput.write("T2_" + (tripnumber+1) + ", " + spr17_sunday_loopin.get(b) + ", " + spr17_sunday_loopin.get(b) + ", " +"20" + ", " + "1" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T2_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"18" + ", " + "2" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T2_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"23" + ", " + "3" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T2_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"26" + ", " + "4" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T2_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"29" + ", " + "5" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T2_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"2" + ", " + "6" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T2_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"3" + ", " + "7" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T2_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"5" + ", " + "8" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T2_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"6" + ", " + "9" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T2_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"10" + ", " + "10" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T2_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"15" + ", " + "11" + ", " +  (tripindex+1) +"\n");
			printOutput.write("T2_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"17" + ", " + "12" + ", " +  (tripindex+1) +"\n");			try{
				parse_starting_time = format_time.parse(spr17_sunday_loopin.get(b));
				cal.setTime(parse_starting_time);
				cal.add(Calendar.MINUTE, 20);
				starting_time_twenty = format_time.format(cal.getTime());
				printOutput.write("T2_" + (tripnumber+1) + ", " + starting_time_twenty + ", " + starting_time_twenty + ", " +"20" + ", " + "13" + ", " +  (tripindex+1) +"\n");
			//System.out.println(starting_time_twenty);
			}catch(ParseException a){
					System.out.println("can't parse");
			}
				tripnumber++;
				tripindex++;
		}

		tripnumber = 0;
		tripindex = 0;
		
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



