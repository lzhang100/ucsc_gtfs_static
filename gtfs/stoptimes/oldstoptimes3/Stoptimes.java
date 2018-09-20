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
import java.lang.String;

class Stoptimes{

	public static int tripnumber = 0;
	public static int tripindex = 0;
 
	public static void main (String args[]){
	
		//Reading a file that list all filenames and store them in an arraylist named listoffiles
	
		ArrayList<String> listoffiles = new ArrayList<String>();
		
		//Create pointer to trips.txt to be written later
		
		File toOutput= new File(args[0]);
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
		tripnumber = routeone_stoptimes("T1", tripnumber, tripindex, "spr17_monthur_loopo.txt", printOutput);
		tripnumber = routeone_stoptimes("T1", tripnumber, tripindex, "spr17_friday_loopo.txt", printOutput); 
		tripnumber = routeone_stoptimes("T1", tripnumber, tripindex, "spr17_saturday_loopo.txt", printOutput);
		tripnumber = routeone_stoptimes("T1", tripnumber, tripindex, "spr17_sunday_loopo.txt", printOutput);
		tripnumber = routeone_stoptimes("T1", tripnumber, tripindex, "spr17_finals_loopo.txt", printOutput);

		tripnumber = 0;
		tripnumber = routetwo_stoptimes("T2", tripnumber, tripindex, "spr17_monthur_loopin.txt", printOutput);
		tripnumber = routetwo_stoptimes("T2", tripnumber, tripindex, "spr17_friday_loopin.txt", printOutput); 
		tripnumber = routetwo_stoptimes("T2", tripnumber, tripindex, "spr17_saturday_loopin.txt", printOutput);
		tripnumber = routetwo_stoptimes("T2", tripnumber, tripindex, "spr17_sunday_loopin.txt", printOutput);
		tripnumber = routetwo_stoptimes("T2", tripnumber, tripindex, "spr17_finals_loopin.txt", printOutput);

		tripnumber = 0;
		tripnumber = routethree_stoptimes("T3", tripnumber, tripindex, "spr17_monthur_inuc.txt", printOutput);
		tripnumber = routethree_stoptimes("T3", tripnumber, tripindex, "spr17_friday_inuc.txt", printOutput); 
		tripnumber = routethree_stoptimes("T3", tripnumber, tripindex, "spr17_finals_inuc.txt", printOutput);

	
		tripnumber = 0;
		tripnumber = routefour_stoptimes("T4", tripnumber, tripindex, "spr17_monthur_outuc.txt", printOutput);
		tripnumber = routefour_stoptimes("T4", tripnumber, tripindex, "spr17_friday_outuc.txt", printOutput);
		tripnumber = routefour_stoptimes("T4", tripnumber, tripindex, "spr17_finals_outuc.txt", printOutput);

		
		tripnumber = 0;
		tripnumber = routefive_stoptimes("T5", tripnumber, tripindex, "spr17_monthur_enc.txt", printOutput);
		tripnumber = routefive_stoptimes("T5", tripnumber, tripindex, "spr17_friday_enc.txt", printOutput);
		tripnumber = routefive_stoptimes("T5", tripnumber, tripindex, "spr17_saturday_enc.txt", printOutput);
		tripnumber = routefive_stoptimes("T5", tripnumber, tripindex, "spr17_sunday_enc.txt", printOutput);
		tripnumber = routefive_stoptimes("T5", tripnumber, tripindex, "spr17_finals_enc.txt", printOutput);
		
		
		tripnumber = 0;
		tripnumber = routesix_stoptimes("T6", tripnumber, tripindex, "spr17_monthur_wnc.txt", printOutput);
		tripnumber = routesix_stoptimes("T6", tripnumber, tripindex, "spr17_friday_wnc.txt", printOutput);
		tripnumber = routesix_stoptimes("T6", tripnumber, tripindex, "spr17_saturday_wnc.txt", printOutput);
		tripnumber = routesix_stoptimes("T6", tripnumber, tripindex, "spr17_sunday_wnc.txt", printOutput);
		tripnumber = routesix_stoptimes("T6", tripnumber, tripindex, "spr17_finals_wnc.txt", printOutput);
		
		printOutput.close();
		
		
	}
	
	public static int routeone_stoptimes(String trip, int tripnumber, int tripindex, String readfile, PrintWriter printOutput){
	
		
		ArrayList<String> routeone = new ArrayList<String>();
		DateFormat format_time  = new SimpleDateFormat("HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		Date parse_starting_time;
		String starting_time;
		String starting_time_twenty;
		
		

		Scanner scan = null;
		try{
			scan = new Scanner (new File(readfile));
			while (scan.hasNextLine()) {
				routeone.add(scan.nextLine());	
			}
			scan.close();
		}catch(Exception e){
			System.out.println("Can not open: " + readfile);
		}
		
		for(int b=0; b<routeone.size(); b++){
			printOutput.write(trip + "_" + (tripnumber+1) + ", " + routeone.get(b) + ", " + routeone.get(b) + ", " +"19" + ", " + "1" + ", " +  (tripindex+1) +"\n");
			printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"16" + ", " + "2" + ", " +  (tripindex+1) +"\n");
			printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"14" + ", " + "3" + ", " +  (tripindex+1) +"\n");
			printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"12" + ", " + "4" + ", " +  (tripindex+1) +"\n");
			printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"11" + ", " + "5" + ", " +  (tripindex+1) +"\n");
			printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"9" + ", " + "6" + ", " +  (tripindex+1) +"\n");
			printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"8" + ", " + "7" + ", " +  (tripindex+1) +"\n");
			printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"7" + ", " + "8" + ", " +  (tripindex+1) +"\n");
			printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"4" + ", " + "9" + ", " +  (tripindex+1) +"\n");
			printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"1" + ", " + "10" + ", " +  (tripindex+1) +"\n");
			printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"28" + ", " + "11" + ", " +  (tripindex+1) +"\n");
			printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"27" + ", " + "12" + ", " +  (tripindex+1) +"\n");
			printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"25" + ", " + "13" + ", " +  (tripindex+1) +"\n");
			printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"24" + ", " + "14" + ", " +  (tripindex+1) +"\n");
			printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"21" + ", " + "15" + ", " +  (tripindex+1) +"\n");
			try{
				parse_starting_time = format_time.parse(routeone.get(b));
				cal.setTime(parse_starting_time);
				cal.add(Calendar.MINUTE, 20);
				starting_time_twenty = format_time.format(cal.getTime());
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + starting_time_twenty + ", " + starting_time_twenty + ", " +"19" + ", " + "16" + ", " +  (tripindex+1) +"\n");
			
			}catch(ParseException a){
					System.out.println("can't parse");
			}
			tripnumber++;
			tripindex++;
		}

		return tripnumber;	

	}	

	public static int routetwo_stoptimes(String trip, int tripnumber, int tripindex, String readfile, PrintWriter printOutput){
	
		
		ArrayList<String> routetwo = new ArrayList<String>();
		DateFormat format_time  = new SimpleDateFormat("HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		Date parse_starting_time;
		String starting_time;
		String starting_time_twenty;
		
		

		Scanner scan = null;
		try{
			scan = new Scanner (new File(readfile));
			while (scan.hasNextLine()) {
				routetwo.add(scan.nextLine());	
			}
			scan.close();
		}catch(Exception e){
			System.out.println("Can not open: " + readfile);
		}
		
		for(int b=0; b<routetwo.size(); b++){
			printOutput.write(trip + "_" + (tripnumber+1) + ", " + routetwo.get(b) + ", " + routetwo.get(b) + ", " +"20" + ", " + "1" + ", " +  (tripindex+1) +"\n");
			printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"18" + ", " + "2" + ", " +  (tripindex+1) +"\n");
			printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"23" + ", " + "3" + ", " +  (tripindex+1) +"\n");
			printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"26" + ", " + "4" + ", " +  (tripindex+1) +"\n");
			printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"29" + ", " + "5" + ", " +  (tripindex+1) +"\n");
			printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"2" + ", " + "6" + ", " +  (tripindex+1) +"\n");
			printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"3" + ", " + "7" + ", " +  (tripindex+1) +"\n");
			printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"5" + ", " + "8" + ", " +  (tripindex+1) +"\n");
			printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"6" + ", " + "9" + ", " +  (tripindex+1) +"\n");
			printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"10" + ", " + "10" + ", " +  (tripindex+1) +"\n");
			printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"15" + ", " + "11" + ", " +  (tripindex+1) +"\n");
			printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"17" + ", " + "12" + ", " +  (tripindex+1) +"\n");
			try{
				parse_starting_time = format_time.parse(routetwo.get(b));
				cal.setTime(parse_starting_time);
				cal.add(Calendar.MINUTE, 20);
				starting_time_twenty = format_time.format(cal.getTime());
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + starting_time_twenty + ", " + starting_time_twenty + ", " +"20" + ", " + "13" + ", " +  (tripindex+1) +"\n");
			
			}catch(ParseException a){
					System.out.println("can't parse");
			}
			tripnumber++;
			tripindex++;
		}

		return tripnumber;	

	}	


	public static int routethree_stoptimes(String trip, int tripnumber, int tripindex, String readfile, PrintWriter printOutput){
	
		
		ArrayList<String> routethree = new ArrayList<String>();
		DateFormat format_time  = new SimpleDateFormat("HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		Date parse_starting_time;
		String starting_time;
		String starting_time_twenty;
		
		

		Scanner scan = null;
		try{
			scan = new Scanner (new File(readfile));
			while (scan.hasNextLine()) {
				routethree.add(scan.nextLine());	
			}
			scan.close();
		}catch(Exception e){
			System.out.println("Can not open: " + readfile);
		}
		
		for(int b=0; b<routethree.size(); b++){
			printOutput.write(trip + "_" + (tripnumber+1) + ", " + routethree.get(b) + ", " + routethree.get(b) + ", " +"31" + ", " + "1" + ", " +  (tripindex+1) +"\n");
			printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"25" + ", " + "2" + ", " +  (tripindex+1) +"\n");
			printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"29" + ", " + "3" + ", " +  (tripindex+1) +"\n");
			printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"2" + ", " + "4" + ", " +  (tripindex+1) +"\n");
			printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"3" + ", " + "5" + ", " +  (tripindex+1) +"\n");
			printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"5" + ", " + "6" + ", " +  (tripindex+1) +"\n");
			printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"6" + ", " + "7" + ", " +  (tripindex+1) +"\n");
			printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"10" + ", " + "8" + ", " +  (tripindex+1) +"\n");
			try{
				parse_starting_time = format_time.parse(routethree.get(b));
				cal.setTime(parse_starting_time);
				cal.add(Calendar.MINUTE, 30);
				starting_time_twenty = format_time.format(cal.getTime());
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + starting_time_twenty + ", " + starting_time_twenty + ", " +"30" + ", " + "9" + ", " +  (tripindex+1) +"\n");
			
			}catch(ParseException a){
					System.out.println("can't parse");
			}
			tripnumber++;
			tripindex++;
		}

		return tripnumber;	

	}	

	public static int routefour_stoptimes(String trip, int tripnumber, int tripindex, String readfile, PrintWriter printOutput){
	
		
		ArrayList<String> routefour = new ArrayList<String>();
		DateFormat format_time  = new SimpleDateFormat("HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		Date parse_starting_time;
		String starting_time;
		String starting_time_twenty;
		
		

		Scanner scan = null;
		try{
			scan = new Scanner (new File(readfile));
			while (scan.hasNextLine()) {
				routefour.add(scan.nextLine());	
			}
			scan.close();
		}catch(Exception e){
			System.out.println("Can not open: " + readfile);
		}
		
		for(int b=0; b<routefour.size(); b++){
			printOutput.write(trip + "_" + (tripnumber+1) + ", " + routefour.get(b) + ", " + routefour.get(b) + ", " +"30" + ", " + "1" + ", " +  (tripindex+1) +"\n");
			printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"10" + ", " + "2" + ", " +  (tripindex+1) +"\n");
			printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"6" + ", " + "3" + ", " +  (tripindex+1) +"\n");
			printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"5" + ", " + "4" + ", " +  (tripindex+1) +"\n");
			printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"3" + ", " + "5" + ", " +  (tripindex+1) +"\n");
			printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"2" + ", " + "6" + ", " +  (tripindex+1) +"\n");
			printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"29" + ", " + "7" + ", " +  (tripindex+1) +"\n");
			printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"25" + ", " + "8" + ", " +  (tripindex+1) +"\n");
			try{
				parse_starting_time = format_time.parse(routefour.get(b));
				cal.setTime(parse_starting_time);
				cal.add(Calendar.MINUTE, 30);
				starting_time_twenty = format_time.format(cal.getTime());
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + starting_time_twenty + ", " + starting_time_twenty + ", " +"31" + ", " + "9" + ", " +  (tripindex+1) +"\n");
			
			}catch(ParseException a){
					System.out.println("can't parse");
			}
			tripnumber++;
			tripindex++;
		}

		return tripnumber;	

	}	

	public static int routefive_stoptimes(String trip, int tripnumber, int tripindex, String readfile, PrintWriter printOutput){
	
		
		ArrayList<String> routefive = new ArrayList<String>();
		DateFormat format_time  = new SimpleDateFormat("HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		Date parse_starting_time;
		String starting_time;
		String starting_time_twenty="";
		String eastremote_tme ="";
		String crowncollege_time = "";
		String sciencehill_time ="";
		String westremote_time ="";
		String mediatheater_time ="";
		String mchenrylibrary_time="";
		Scanner scan = null;
		try{
			scan = new Scanner (new File(readfile));
			while (scan.hasNextLine()) {
				routefive.add(scan.nextLine());	
			}
			scan.close();
		}catch(Exception e){
			System.out.println("Can not open: " + readfile);
		}
		
		for(int b=0; b<routefive.size(); b++){
			try{
				if(routefive.get(b).equals("24:00:00")){
					eastremote_tme = "24:02:00";
					crowncollege_time = "24:06:00";
					sciencehill_time ="24:09:00";
					westremote_time = "24:20:00";
					mediatheater_time ="24:22:00";
					mchenrylibrary_time = "24:24:00";
					starting_time_twenty = "24:30:00";
					
				}else{
					parse_starting_time = format_time.parse(routefive.get(b));
					cal.setTime(parse_starting_time);
					cal.add(Calendar.MINUTE, 2);
					eastremote_tme = format_time.format(cal.getTime());

					cal.add(Calendar.MINUTE, 4);
					crowncollege_time = format_time.format(cal.getTime());

					cal.add(Calendar.MINUTE, 3);
					sciencehill_time = format_time.format(cal.getTime());

					cal.add(Calendar.MINUTE, 11);
					westremote_time = format_time.format(cal.getTime());

					cal.add(Calendar.MINUTE, 2);
					mediatheater_time = format_time.format(cal.getTime());

					cal.add(Calendar.MINUTE, 2);
					mchenrylibrary_time = format_time.format(cal.getTime());
					
					cal.add(Calendar.MINUTE, 6);
					starting_time_twenty = format_time.format(cal.getTime());
					if(starting_time_twenty.equals("00:00:00")){
						starting_time_twenty = "24:00:00";
					}
				}

				printOutput.write(trip + "_" + (tripnumber+1) + ", " + routefive.get(b) + ", " + routefive.get(b) + ", " +"42" + ", " + "1" + ", " +  (tripindex+1) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"10" + ", " + "2" + ", " +  (tripindex+1) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + eastremote_tme + ", " + eastremote_tme + ", " +"30" + ", " + "3" + ", " +  (tripindex+1) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"11" + ", " + "4" + ", " +  (tripindex+1) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"9" + ", " + "5" + ", " +  (tripindex+1) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"8" + ", " + "6" + ", " +  (tripindex+1) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + crowncollege_time + ", " + crowncollege_time + ", " +"39" + ", " + "7" + ", " +  (tripindex+1) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"38" + ", " + "8" + ", " +  (tripindex+1) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"7" + ", " + "9" + ", " +  (tripindex+1) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + sciencehill_time + ", " + sciencehill_time + ", " +"4" + ", " + "10" + ", " +  (tripindex+1) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"1" + ", " + "11" + ", " +  (tripindex+1) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"28" + ", " + "12" + ", " +  (tripindex+1) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"27" + ", " + "13" + ", " +  (tripindex+1) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"26" + ", " + "14" + ", " +  (tripindex+1) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + westremote_time + ", " + westremote_time + ", " +"31" + ", " + "15" + ", " +  (tripindex+1) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"29" + ", " + "16" + ", " +  (tripindex+1) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + mediatheater_time + ", " + mediatheater_time + ", " +"33" + ", " + "17" + ", " +  (tripindex+1) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"34" + ", " + "18" + ", " +  (tripindex+1) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"35" + ", " + "19" + ", " +  (tripindex+1) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + mchenrylibrary_time + ", " + mchenrylibrary_time + ", " +"36" + ", " + "20" + ", " +  (tripindex+1) +"\n");
				
				
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + starting_time_twenty + ", " + starting_time_twenty + ", " +"42" + ", " + "21" + ", " +  (tripindex+1) +"\n");
			
			}catch(ParseException a){
					System.out.println("can't parse");
			}
			tripnumber++;
			tripindex++;
		}

		return tripnumber;	

	}	


	public static int routesix_stoptimes(String trip, int tripnumber, int tripindex, String readfile, PrintWriter printOutput){
	
		
		ArrayList<String> routesix = new ArrayList<String>();
		DateFormat format_time  = new SimpleDateFormat("HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		Date parse_starting_time;
		String starting_time;
		String starting_time_thirty="";
		int stopsequence = 1; 

		String musiccenter_time="";
		String westremote_time ="";
		String kresgebridge_time="";
		String sciencehill_time="";
		String crowncircle_time="";
		String stevensoncircle_time = "";
		
		Scanner scan = null;
		try{
			scan = new Scanner (new File(readfile));
			while (scan.hasNextLine()) {
				routesix.add(scan.nextLine());	
			}
			scan.close();
		}catch(Exception e){
			System.out.println("Can not open: " + readfile);
		}
		
		for(int b=0; b<routesix.size(); b++){
			try{

				if(routesix.get(b).equals("24:00:00")){
						musiccenter_time = "24:03:00";
						westremote_time = "24:10:00";
						kresgebridge_time = "24:12:00";
						sciencehill_time = "24:13:00";
						crowncircle_time = "24:16:00";
						stevensoncircle_time = "24:20:00";
						starting_time_thirty = "24:30:00";
				}else{
					parse_starting_time = format_time.parse(routesix.get(b));
					cal.setTime(parse_starting_time);
					cal.add(Calendar.MINUTE, 3);
					musiccenter_time = format_time.format(cal.getTime());

					cal.add(Calendar.MINUTE, 7);
					westremote_time = format_time.format(cal.getTime());

					cal.add(Calendar.MINUTE, 2);
					kresgebridge_time = format_time.format(cal.getTime());

					cal.add(Calendar.MINUTE, 1);
					sciencehill_time = format_time.format(cal.getTime());

					cal.add(Calendar.MINUTE, 3);
					crowncircle_time = format_time.format(cal.getTime());

					cal.add(Calendar.MINUTE, 4);
					stevensoncircle_time = format_time.format(cal.getTime());
					
					cal.add(Calendar.MINUTE, 10);
					starting_time_thirty = format_time.format(cal.getTime());
					if(starting_time_thirty.equals("00:00:00")){
						starting_time_thirty = "24:00:00";
					}
				}

				printOutput.write(trip + "_" + (tripnumber+1) + ", " + routesix.get(b) + ", " + routesix.get(b) + ", " +"42" + ", " + (stopsequence++) + ", " +  (tripindex+1) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"36" + ", " + (stopsequence++) + ", " +  (tripindex+1) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"35" + ", " + (stopsequence++) + ", " +  (tripindex+1) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + musiccenter_time + ", " + musiccenter_time + ", " +"32" + ", " + (stopsequence++) + ", " +  (tripindex+1) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"28" + ", " + (stopsequence++) + ", " +  (tripindex+1) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"27" + ", " + (stopsequence++) + ", " +  (tripindex+1) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"26" + ", " + (stopsequence++) + ", " +  (tripindex+1) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + westremote_time + ", " + westremote_time + ", " +"31" + ", " + (stopsequence++) + ", " +  (tripindex+1) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"25" + ", " + (stopsequence++) + ", " +  (tripindex+1) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"29" + ", " + (stopsequence++) + ", " +  (tripindex+1) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + kresgebridge_time + ", " + kresgebridge_time + ", " +"2" + ", " + (stopsequence++) + ", " +  (tripindex+1) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + sciencehill_time + ", " + sciencehill_time + ", " +"3" + ", " + (stopsequence++) + ", " +  (tripindex+1) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"5" + ", " + (stopsequence++) + ", " +  (tripindex+1) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"6" + ", " + (stopsequence++) + ", " + (tripindex+1) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + crowncircle_time + ", " + crowncircle_time + ", " +"38" + ", " + (stopsequence++) + ", " +  (tripindex+1) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + stevensoncircle_time + ", " + stevensoncircle_time + ", " +"37" + ", " + (stopsequence++) + ", " +  (tripindex+1) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"39" + ", " + (stopsequence++) + ", " +  (tripindex+1) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"10" + ", " + (stopsequence++) + ", " +  (tripindex+1) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"30" + ", " + (stopsequence++) + ", " +  (tripindex+1) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"11" + ", " + (stopsequence++) + ", " +  (tripindex+1) +"\n");
				
				
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + 	starting_time_thirty + ", " + 	starting_time_thirty + ", " +"42" + ", " + (stopsequence++) + ", " +  (tripindex+1) +"\n");
			
				stopsequence = 1;
			}catch(ParseException a){
					System.out.println("can't parse" + readfile + routesix.get(b));
			}
			tripnumber++;
			tripindex++;
		}

		return tripnumber;	

	}	



	
}



