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
		printOutput.write("trip_id, arrival_time, departure_time, stop_id, stop_sequence"+ "\n");
		
		
		//Adding content to trips.txt to retain information for R1 and it services
		int tripnumber = 0;
		
		tripnumber = routeone_stoptimes("T1", tripnumber, "spr17_monthur_loopo.txt", printOutput);
		tripnumber = routeone_stoptimes("T1", tripnumber, "spr17_friday_loopo.txt", printOutput); 
		tripnumber = routeone_stoptimes("T1", tripnumber, "spr17_saturday_loopo.txt", printOutput);
		tripnumber = routeone_stoptimes("T1", tripnumber, "spr17_sunday_loopo.txt", printOutput);
		tripnumber = routeone_stoptimes("T1", tripnumber, "spr17_finals_loopo.txt", printOutput);
		tripnumber = routeone_stoptimes("T1", tripnumber, "spr17_intermission_loopo.txt", printOutput);

		tripnumber = 0;
		tripnumber = routetwo_stoptimes("T2", tripnumber, "spr17_monthur_loopin.txt", printOutput);
		tripnumber = routetwo_stoptimes("T2", tripnumber, "spr17_friday_loopin.txt", printOutput); 
		tripnumber = routetwo_stoptimes("T2", tripnumber, "spr17_saturday_loopin.txt", printOutput);
		tripnumber = routetwo_stoptimes("T2", tripnumber, "spr17_sunday_loopin.txt", printOutput);
		tripnumber = routetwo_stoptimes("T2", tripnumber, "spr17_finals_loopin.txt", printOutput);
		tripnumber = routetwo_stoptimes("T2", tripnumber, "spr17_intermission_loopin.txt", printOutput);

		tripnumber = 0;
		tripnumber = routethree_stoptimes("T3", tripnumber, "spr17_monthur_inuc.txt", printOutput);
		tripnumber = routethree_stoptimes("T3", tripnumber, "spr17_friday_inuc.txt", printOutput); 
		tripnumber = routethree_stoptimes("T3", tripnumber, "spr17_finals_inuc.txt", printOutput);

	
		tripnumber = 0;
		tripnumber = routefour_stoptimes("T4", tripnumber, "spr17_monthur_outuc.txt", printOutput);
		tripnumber = routefour_stoptimes("T4", tripnumber, "spr17_friday_outuc.txt", printOutput);
		tripnumber = routefour_stoptimes("T4", tripnumber, "spr17_finals_outuc.txt", printOutput);

		
		tripnumber = 0;
		tripnumber = routefive_stoptimes("T5", tripnumber, "spr17_monthur_enc.txt", printOutput);
		tripnumber = routefive_stoptimes("T5", tripnumber, "spr17_friday_enc.txt", printOutput);
		tripnumber = routefive_stoptimes("T5", tripnumber, "spr17_saturday_enc.txt", printOutput);
		tripnumber = routefive_stoptimes("T5", tripnumber, "spr17_sunday_enc.txt", printOutput);
		tripnumber = routefive_stoptimes("T5", tripnumber, "spr17_finals_enc.txt", printOutput);
		
		
		tripnumber = 0;
		tripnumber = routesix_stoptimes("T6", tripnumber, "spr17_monthur_wnc.txt", printOutput);
		tripnumber = routesix_stoptimes("T6", tripnumber, "spr17_friday_wnc.txt", printOutput);
		tripnumber = routesix_stoptimes("T6", tripnumber, "spr17_saturday_wnc.txt", printOutput);
		tripnumber = routesix_stoptimes("T6", tripnumber, "spr17_sunday_wnc.txt", printOutput);
		tripnumber = routesix_stoptimes("T6", tripnumber, "spr17_finals_wnc.txt", printOutput);
		
		printOutput.close();
		
		
	}
	
	public static int routeone_stoptimes(String trip, int tripnumber, String readfile, PrintWriter printOutput){
	
		
		ArrayList<String> routeone = new ArrayList<String>();
		DateFormat format_time  = new SimpleDateFormat("HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		Date parse_starting_time;
		String starting_time;
		String starting_time_twenty;
		int stopsequence =1;
		

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
			try{
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + routeone.get(b) + ", " + routeone.get(b) + ", " +"19" + ", " + (stopsequence++)   +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"16" + ", " + (stopsequence++)  +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"14" + ", " + (stopsequence++)  +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"12" + ", " + (stopsequence++)    +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"11" + ", " + (stopsequence++)  +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"9" + ", " + (stopsequence++)     +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"8" + ", " + (stopsequence++)  +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"7" + ", " + (stopsequence++)  +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"4" + ", " + (stopsequence++)   +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"1" + ", " + (stopsequence++)   +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"28" + ", " + (stopsequence++)   +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"27" + ", " + (stopsequence++)  +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"25" + ", " + (stopsequence++)   +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"24" + ", " + (stopsequence++)    +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"21" + ", " + (stopsequence++)    +"\n");
		
				parse_starting_time = format_time.parse(routeone.get(b));
				cal.setTime(parse_starting_time);
				cal.add(Calendar.MINUTE, 20);
				starting_time_twenty = format_time.format(cal.getTime());
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + starting_time_twenty + ", " + starting_time_twenty + ", " +"19" + ", " + (stopsequence++)    +"\n");
				stopsequence = 1;
			}catch(ParseException a){
					System.out.println("can't parse" + readfile);
			}
			tripnumber++;
			//
			
			
			
			//tripindex++;
		}

		return tripnumber;	

	}	

	public static int routetwo_stoptimes(String trip, int tripnumber, String readfile, PrintWriter printOutput){
	
		
		ArrayList<String> routetwo = new ArrayList<String>();
		DateFormat format_time  = new SimpleDateFormat("HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		Date parse_starting_time;
		String starting_time;
		String starting_time_twenty;
		int stopsequence =1;
		
		

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
			try{
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + routetwo.get(b) + ", " + routetwo.get(b) + ", " +"20" + ", " + (stopsequence++)   +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"18" + ", " + (stopsequence++)   +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"23" + ", " + (stopsequence++)  +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"26" + ", " + (stopsequence++)   +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"29" + ", " + (stopsequence++)   +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"2" + ", " + (stopsequence++)  +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"3" + ", " + (stopsequence++)  +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"5" + ", " + (stopsequence++)  +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"6" + ", " + (stopsequence++)  +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"10" + ", " + (stopsequence++)   +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"15" + ", " + (stopsequence++)   +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"17" + ", " + (stopsequence++)  +"\n");
			
				parse_starting_time = format_time.parse(routetwo.get(b));
				cal.setTime(parse_starting_time);
				cal.add(Calendar.MINUTE, 20);
				starting_time_twenty = format_time.format(cal.getTime());
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + starting_time_twenty + ", " + starting_time_twenty + ", " +"20" + ", " + (stopsequence++)  +"\n");
				stopsequence = 1;
			
			}catch(ParseException a){
					System.out.println("can't parse" + readfile);
			}
			tripnumber++;
		
		}

		return tripnumber;	

	}	


	public static int routethree_stoptimes(String trip, int tripnumber, String readfile, PrintWriter printOutput){
	
		
		ArrayList<String> routethree = new ArrayList<String>();
		DateFormat format_time  = new SimpleDateFormat("HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		Date parse_starting_time;
		String starting_time;
		String starting_time_thirty;
		int stopsequence = 1;
		
		

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
			try{
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + routethree.get(b) + ", " + routethree.get(b) + ", " +"31" + ", " + (stopsequence++) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"25" + ", " + (stopsequence++)   +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"29" + ", " + (stopsequence++)  +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"2" + ", " + (stopsequence++)   +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"3" + ", " + (stopsequence++)   +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"5" + ", " + (stopsequence++)  +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"6" + ", " + (stopsequence++) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"10" + ", " + (stopsequence++)  +"\n");
			
				parse_starting_time = format_time.parse(routethree.get(b));
				cal.setTime(parse_starting_time);
				cal.add(Calendar.MINUTE, 30);
				starting_time_thirty = format_time.format(cal.getTime());
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + starting_time_thirty + ", " + starting_time_thirty + ", " +"30" + ", " + (stopsequence++)  +"\n");
				stopsequence = 1;
			
			}catch(ParseException a){
					System.out.println("can't parse" + readfile);
			}
			tripnumber++;

		}

		return tripnumber;	

	}	

	public static int routefour_stoptimes(String trip, int tripnumber, String readfile, PrintWriter printOutput){
	
		
		ArrayList<String> routefour = new ArrayList<String>();
		DateFormat format_time  = new SimpleDateFormat("HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		Date parse_starting_time;
		String starting_time;
		String starting_time_thirty;
		int stopsequence = 1;
		
		

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
			try{
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + routefour.get(b) + ", " + routefour.get(b) + ", " +"30" + ", " + (stopsequence++)  +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"10" + ", " + (stopsequence++)   +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"6" + ", " + (stopsequence++)   +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"5" + ", " + (stopsequence++)  +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"3" + ", " + (stopsequence++)   +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"2" + ", " + (stopsequence++)  +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"29" + ", " + (stopsequence++)   +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"25" + ", " + (stopsequence++)  +"\n");
			
				parse_starting_time = format_time.parse(routefour.get(b));
				cal.setTime(parse_starting_time);
				cal.add(Calendar.MINUTE, 30);
				starting_time_thirty = format_time.format(cal.getTime());
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + starting_time_thirty + ", " + starting_time_thirty+ ", " +"31" + ", " + (stopsequence++)  +"\n");
				stopsequence =1;
			
			}catch(ParseException a){
					System.out.println("can't parse" + readfile);
			}
			tripnumber++;

		}

		return tripnumber;	

	}	

	public static int routefive_stoptimes(String trip, int tripnumber, String readfile, PrintWriter printOutput){
	
		
		ArrayList<String> routefive = new ArrayList<String>();
		DateFormat format_time  = new SimpleDateFormat("HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		Date parse_starting_time;
		String starting_time;
		String starting_time_thirty="";
		String eastremote_tme ="";
		String crowncollege_time = "";
		String sciencehill_time ="";
		String westremote_time ="";
		String mediatheater_time ="";
		String mchenrylibrary_time="";
		Scanner scan = null;
		int stopsequence = 1;
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
					starting_time_thirty= "24:30:00";
					
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
					starting_time_thirty= format_time.format(cal.getTime());
					if(starting_time_thirty.equals("00:00:00")){
						starting_time_thirty = "24:00:00";
					}
				}

				printOutput.write(trip + "_" + (tripnumber+1) + ", " + routefive.get(b) + ", " + routefive.get(b) + ", " +"42" + ", " + (stopsequence++)  +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"10" + ", " + (stopsequence++) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + eastremote_tme + ", " + eastremote_tme + ", " +"30" + ", " + (stopsequence++)  +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"11" + ", " + (stopsequence++) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"9" + ", " + (stopsequence++)  +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"8" + ", " + (stopsequence++)  +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + crowncollege_time + ", " + crowncollege_time + ", " +"39" + ", " + (stopsequence++)  +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"38" + ", " + (stopsequence++) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"7" + ", " + (stopsequence++) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + sciencehill_time + ", " + sciencehill_time + ", " +"4" + ", " + (stopsequence++) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"1" + ", " + (stopsequence++) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"28" + ", " + (stopsequence++) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"27" + ", " + (stopsequence++)  +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"26" + ", " + (stopsequence++)  +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + westremote_time + ", " + westremote_time + ", " +"31" + ", " + (stopsequence++) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"29" + ", " + (stopsequence++) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + mediatheater_time + ", " + mediatheater_time + ", " +"33" + ", " + (stopsequence++) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"34" + ", " + (stopsequence++) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"35" + ", " + (stopsequence++) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + mchenrylibrary_time + ", " + mchenrylibrary_time + ", " +"36" + ", " + (stopsequence++) +"\n");
				
				
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + starting_time_thirty + ", " + starting_time_thirty + ", " +"42" + ", " + (stopsequence++)  +"\n");
				stopsequence =1;
			
			}catch(ParseException a){
					System.out.println("can't parse");
			}
			tripnumber++;
			
		}

		return tripnumber;	

	}	


	public static int routesix_stoptimes(String trip, int tripnumber, String readfile, PrintWriter printOutput){
	
		
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

				printOutput.write(trip + "_" + (tripnumber+1) + ", " + routesix.get(b) + ", " + routesix.get(b) + ", " +"42" + ", " + (stopsequence++)  +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"36" + ", " + (stopsequence++) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"35" + ", " + (stopsequence++) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + musiccenter_time + ", " + musiccenter_time + ", " +"32" + ", " + (stopsequence++)  +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"28" + ", " + (stopsequence++)  +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"27" + ", " + (stopsequence++) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"26" + ", " + (stopsequence++)  +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + westremote_time + ", " + westremote_time + ", " +"31" + ", " + (stopsequence++)  +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"25" + ", " + (stopsequence++) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"29" + ", " + (stopsequence++) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + kresgebridge_time + ", " + kresgebridge_time + ", " +"2" + ", " + (stopsequence++) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + sciencehill_time + ", " + sciencehill_time + ", " +"3" + ", " + (stopsequence++)  +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"5" + ", " + (stopsequence++) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"6" + ", " + (stopsequence++) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + crowncircle_time + ", " + crowncircle_time + ", " +"38" + ", " + (stopsequence++) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + ""+ ", " +"37" + ", " + (stopsequence++)  +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + stevensoncircle_time + ", " + stevensoncircle_time + ", " +"44" + ", " + (stopsequence++)  +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"39" + ", " + (stopsequence++)  +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"10" + ", " + (stopsequence++)  +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"30" + ", " + (stopsequence++) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"11" + ", " + (stopsequence++)  +"\n");
				
				
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + 	starting_time_thirty + ", " + 	starting_time_thirty + ", " +"42" + ", " + (stopsequence++) +"\n");
			
				stopsequence = 1;
			}catch(ParseException a){
					System.out.println("can't parse" + readfile + routesix.get(b));
			}
			tripnumber++;
			
	
	
		}

		return tripnumber;	

	}	



	
}



