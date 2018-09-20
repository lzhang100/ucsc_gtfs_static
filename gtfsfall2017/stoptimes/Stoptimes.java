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
		
		tripnumber = loopo_stoptimes("T1", tripnumber, "fall17_monthur_loopo.txt", printOutput);
		tripnumber = loopo_stoptimes("T1", tripnumber, "fall17_friday_loopo.txt", printOutput); 
		tripnumber = loopo_stoptimes("T1", tripnumber, "fall17_saturday_loopo.txt", printOutput);
		tripnumber = loopo_stoptimes("T1", tripnumber, "fall17_sunday_loopo.txt", printOutput);
		tripnumber = loopo_stoptimes("T1", tripnumber, "fall17_finals_loopo.txt", printOutput);
		//System.out.println(tripnumber);
		tripnumber = loopo_stoptimes("T1", tripnumber, "fall17_intermission_loopo.txt", printOutput);
		System.out.println(tripnumber);


		tripnumber = 0;
		tripnumber = loopin_stoptimes("T2", tripnumber, "fall17_monthur_loopin.txt", printOutput);
		tripnumber = loopin_stoptimes("T2", tripnumber, "fall17_friday_loopin.txt", printOutput); 
		tripnumber = loopin_stoptimes("T2", tripnumber, "fall17_saturday_loopin.txt", printOutput);
		tripnumber = loopin_stoptimes("T2", tripnumber, "fall17_sunday_loopin.txt", printOutput);
		tripnumber = loopin_stoptimes("T2", tripnumber, "fall17_finals_loopin.txt", printOutput);
		//System.out.println(tripnumber);
		tripnumber = loopin_stoptimes("T2", tripnumber, "fall17_intermission_loopin.txt", printOutput);
		//System.out.println(tripnumber);

		
		tripnumber = 0;
		tripnumber = inuc_stoptimes("T3", tripnumber, "fall17_monthur_inuc.txt", printOutput);
		tripnumber = inuc_stoptimes("T3", tripnumber, "fall17_friday_inuc.txt", printOutput); 
		tripnumber = inuc_stoptimes("T3", tripnumber, "fall17_finals_inuc.txt", printOutput);

		
		tripnumber = 0;
		tripnumber = outuc_stoptimes("T4", tripnumber, "fall17_monthur_outuc.txt", printOutput);
		tripnumber = outuc_stoptimes("T4", tripnumber, "fall17_friday_outuc.txt", printOutput);
		tripnumber = outuc_stoptimes("T4", tripnumber, "fall17_finals_outuc.txt", printOutput);

		
		tripnumber = 0;
		tripnumber = enc_stoptimes("T5", tripnumber, "fall17_monthur_enc.txt", printOutput);
		tripnumber = enc_stoptimes("T5", tripnumber, "fall17_friday_enc.txt", printOutput);
		tripnumber = enc_stoptimes("T5", tripnumber, "fall17_saturday_enc.txt", printOutput);
		tripnumber = enc_stoptimes("T5", tripnumber, "fall17_sunday_enc.txt", printOutput);
		tripnumber = enc_stoptimes("T5", tripnumber, "fall17_finals_enc.txt", printOutput);
		
		
		tripnumber = 0;
		tripnumber = wnc_stoptimes("T6", tripnumber, "fall17_monthur_wnc.txt", printOutput);
		tripnumber = wnc_stoptimes("T6", tripnumber, "fall17_friday_wnc.txt", printOutput);
		tripnumber = wnc_stoptimes("T6", tripnumber, "fall17_saturday_wnc.txt", printOutput);
		tripnumber = wnc_stoptimes("T6", tripnumber, "fall17_sunday_wnc.txt", printOutput);
		tripnumber = wnc_stoptimes("T6", tripnumber, "fall17_finals_wnc.txt", printOutput);
		
		printOutput.close();
		
		
	}
	
	public static int loopo_stoptimes(String trip, int tripnumber, String readfile, PrintWriter printOutput){
	
		
		ArrayList<String> routeone = new ArrayList<String>();
		DateFormat format_time  = new SimpleDateFormat("HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		Date parse_starting_time;
		String main_entrance;
		String lower_campus_outer;
		String farm_outer;
		String east_remote_lot_outer;
		String east_field_house;
		String bookstore_cowell_outer;
		String crown_merill_outer;
		String nine_ten_outer;
		String science_hill_outer;
		String kresge_outer;
		String rachel_carson_outer;
		String family_housing_outer;
		String oakes_outer;
		String arboretum_outer;
		String high_western_drive;
		String main_entrance_end;
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
				main_entrance = routeone.get(b);
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + main_entrance + ", " + main_entrance + ", " +"19" + ", " + (stopsequence++)   +"\n");

				parse_starting_time = format_time.parse(main_entrance);
				cal.setTime(parse_starting_time);
				cal.add(Calendar.MINUTE, 1);
				lower_campus_outer = format_time.format(cal.getTime());
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + lower_campus_outer + ", " + lower_campus_outer + ", " +"16" + ", " + (stopsequence++)  +"\n");

				cal.add(Calendar.MINUTE, 1);
				farm_outer = format_time.format(cal.getTime());
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + farm_outer + ", " + farm_outer + ", " +"14" + ", " + (stopsequence++)  +"\n");
				
				cal.add(Calendar.MINUTE, 2);
				east_remote_lot_outer = format_time.format(cal.getTime());
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + east_remote_lot_outer + ", " + east_remote_lot_outer + ", " +"12" + ", " + (stopsequence++)    +"\n");

				cal.add(Calendar.MINUTE, 1);
				east_field_house = format_time.format(cal.getTime());
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + east_field_house + ", " + east_field_house + ", " +"11" + ", " + (stopsequence++)  +"\n");

				cal.add(Calendar.MINUTE, 1);
				bookstore_cowell_outer = format_time.format(cal.getTime());
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + bookstore_cowell_outer + ", " + bookstore_cowell_outer + ", " +"9" + ", " + (stopsequence++)     +"\n");

				cal.add(Calendar.MINUTE, 2);
				crown_merill_outer = format_time.format(cal.getTime());
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + crown_merill_outer + ", " + crown_merill_outer + ", " +"8" + ", " + (stopsequence++)  +"\n");
				
				cal.add(Calendar.MINUTE, 1);
				nine_ten_outer = format_time.format(cal.getTime());
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + nine_ten_outer + ", " + nine_ten_outer + ", " +"7" + ", " + (stopsequence++)  +"\n");

				cal.add(Calendar.MINUTE, 2);
				science_hill_outer = format_time.format(cal.getTime());
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + science_hill_outer + ", " + science_hill_outer + ", " +"4" + ", " + (stopsequence++)   +"\n");

				cal.add(Calendar.MINUTE, 1);
				kresge_outer = format_time.format(cal.getTime());
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + kresge_outer + ", " + kresge_outer + ", " +"1" + ", " + (stopsequence++)   +"\n");

				cal.add(Calendar.MINUTE, 2);
				rachel_carson_outer = format_time.format(cal.getTime());
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + rachel_carson_outer + ", " + rachel_carson_outer + ", " +"28" + ", " + (stopsequence++)   +"\n");

				cal.add(Calendar.MINUTE, 1);
				family_housing_outer = format_time.format(cal.getTime());
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + family_housing_outer + ", " + family_housing_outer + ", " +"27" + ", " + (stopsequence++)  +"\n");

				cal.add(Calendar.MINUTE, 1);
				oakes_outer = format_time.format(cal.getTime());
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + oakes_outer + ", " + oakes_outer + ", " +"26" + ", " + (stopsequence++)   +"\n");

				cal.add(Calendar.MINUTE, 2);
				arboretum_outer = format_time.format(cal.getTime());
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + arboretum_outer + ", " + arboretum_outer + ", " +"24" + ", " + (stopsequence++)    +"\n");
				
				

				//cal.add(Calendar.MINUTE, 1);
				high_western_drive = format_time.format(cal.getTime());
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + high_western_drive + ", " + high_western_drive + ", " +"18" + ", " + (stopsequence++)    +"\n");
		
				cal.add(Calendar.MINUTE, 2);
				main_entrance_end = format_time.format(cal.getTime());
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + main_entrance_end + ", " + main_entrance_end + ", " +"19" + ", " + (stopsequence++)    +"\n");
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

	public static int loopin_stoptimes(String trip, int tripnumber, String readfile, PrintWriter printOutput){
	
		
		ArrayList<String> routetwo = new ArrayList<String>();
		DateFormat format_time  = new SimpleDateFormat("HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		Date parse_starting_time;
		String barn_theater;
		String high_western_inner;
		String arboretum_inner;
		String oakes_inner;
		String rachel_carson_inner;
		String kerr_hall;
		String kresge_inner;
		String science_hill_inner;
		String nine_ten_inner;
		String bookstore_cowell_inner;
		String east_remote_inner;
		String farm_inner;
		String lower_campus_inner;
		String barn_theater_end;
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
				barn_theater = routetwo.get(b);
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + barn_theater + ", " + barn_theater + ", " +"20" + ", " + (stopsequence++)   +"\n");
				
				parse_starting_time = format_time.parse(barn_theater);
				cal.setTime(parse_starting_time);
				cal.add(Calendar.MINUTE, 1);
				high_western_inner = format_time.format(cal.getTime());
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + high_western_inner + ", " + high_western_inner + ", " +"21" + ", " + (stopsequence++)   +"\n");
				
				cal.add(Calendar.MINUTE, 1);
				arboretum_inner = format_time.format(cal.getTime());
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + arboretum_inner + ", " + arboretum_inner + ", " +"23" + ", " + (stopsequence++)  +"\n");
				
				cal.add(Calendar.MINUTE, 3);
				oakes_inner = format_time.format(cal.getTime());
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + oakes_inner + ", " + oakes_inner + ", " +"25" + ", " + (stopsequence++)   +"\n");

				cal.add(Calendar.MINUTE, 1);
				rachel_carson_inner = format_time.format(cal.getTime());
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + rachel_carson_inner + ", " + rachel_carson_inner + ", " +"29" + ", " + (stopsequence++)   +"\n");
				
				cal.add(Calendar.MINUTE, 1);
				kerr_hall = format_time.format(cal.getTime());
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + kerr_hall + ", " + kerr_hall + ", " +"2" + ", " + (stopsequence++)  +"\n");

				cal.add(Calendar.MINUTE, 1);
				kresge_inner = format_time.format(cal.getTime());
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + kresge_inner + ", " + kresge_inner + ", " +"3" + ", " + (stopsequence++)  +"\n");
				
				cal.add(Calendar.MINUTE, 1);
				science_hill_inner = format_time.format(cal.getTime());
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + science_hill_inner + ", " + science_hill_inner + ", " +"5" + ", " + (stopsequence++)  +"\n");
				
				cal.add(Calendar.MINUTE, 2);
				nine_ten_inner = format_time.format(cal.getTime());
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + nine_ten_inner + ", " + nine_ten_inner + ", " +"6" + ", " + (stopsequence++)  +"\n");

				cal.add(Calendar.MINUTE, 2);
				bookstore_cowell_inner = format_time.format(cal.getTime());
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + bookstore_cowell_inner + ", " + bookstore_cowell_inner + ", " +"10" + ", " + (stopsequence++)   +"\n");

				cal.add(Calendar.MINUTE, 2);
				east_remote_inner = format_time.format(cal.getTime());
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + east_remote_inner + ", " + east_remote_inner + ", " +"45" + ", " + (stopsequence++)   +"\n");

				cal.add(Calendar.MINUTE, 1);
				farm_inner = format_time.format(cal.getTime());
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + farm_inner + ", " + farm_inner + ", " +"15" + ", " + (stopsequence++)   +"\n");

				cal.add(Calendar.MINUTE, 1);
				lower_campus_inner = format_time.format(cal.getTime());
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + lower_campus_inner + ", " + lower_campus_inner + ", " +"17" + ", " + (stopsequence++)  +"\n");
				
				cal.add(Calendar.MINUTE, 3);
				barn_theater_end = format_time.format(cal.getTime());
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + barn_theater_end  + ", " + barn_theater_end  + ", " +"20" + ", " + (stopsequence++)  +"\n");
				stopsequence = 1;
			
			}catch(ParseException a){
					System.out.println("can't parse" + readfile);
			}
			tripnumber++;
		
		}

		return tripnumber;	

	}	


	public static int inuc_stoptimes(String trip, int tripnumber, String readfile, PrintWriter printOutput){
	
		
		ArrayList<String> routethree = new ArrayList<String>();
		DateFormat format_time  = new SimpleDateFormat("HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		Date parse_starting_time;
		String west_remote_lot;
		String oakes_inner;
		String rachel_inner;
		String kerr_hall;
		String kresge_inner;
		String science_hill_inner;
		String nine_ten_inner;
		String bookstore_cowell_inner;
		String east_remote_inner;
		String east_remote_lot_interior;
		String east_remote_lot_interior_end;
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
				west_remote_lot = routethree.get(b);
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + west_remote_lot + ", " + west_remote_lot + ", " +"31" + ", " + (stopsequence++) +"\n");
				
				parse_starting_time = format_time.parse(west_remote_lot);
				cal.setTime(parse_starting_time);
				cal.add(Calendar.MINUTE, 2);
				oakes_inner = format_time.format(cal.getTime());
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + oakes_inner + ", " + oakes_inner + ", " +"25" + ", " + (stopsequence++)   +"\n");
				
				cal.add(Calendar.MINUTE, 1);
				rachel_inner = format_time.format(cal.getTime());
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + rachel_inner + ", " + rachel_inner + ", " +"29" + ", " + (stopsequence++)  +"\n");
				
				cal.add(Calendar.MINUTE, 1);
				kerr_hall = format_time.format(cal.getTime());
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + kerr_hall + ", " + kerr_hall + ", " +"2" + ", " + (stopsequence++)   +"\n");
				
				cal.add(Calendar.MINUTE, 1);
				kresge_inner = format_time.format(cal.getTime());
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + kresge_inner + ", " + kresge_inner + ", " +"3" + ", " + (stopsequence++)   +"\n");
				
				cal.add(Calendar.MINUTE, 1);
				science_hill_inner = format_time.format(cal.getTime());
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + science_hill_inner + ", " + science_hill_inner + ", " +"5" + ", " + (stopsequence++)  +"\n");
				
				cal.add(Calendar.MINUTE, 2);
				nine_ten_inner = format_time.format(cal.getTime());
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + nine_ten_inner + ", " + nine_ten_inner + ", " +"6" + ", " + (stopsequence++) +"\n");
				
				cal.add(Calendar.MINUTE, 3);
				bookstore_cowell_inner = format_time.format(cal.getTime());
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + bookstore_cowell_inner + ", " + bookstore_cowell_inner + ", " +"10" + ", " + (stopsequence++)  +"\n");
				
				cal.add(Calendar.MINUTE, 3);
				east_remote_inner = format_time.format(cal.getTime());
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + east_remote_inner + ", " + east_remote_inner + ", " +"45" + ", " + (stopsequence++)  +"\n");
			
				cal.add(Calendar.MINUTE, 1);
				east_remote_lot_interior = format_time.format(cal.getTime());
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + east_remote_lot_interior + ", " + east_remote_lot_interior + ", " +"46" + ", " + (stopsequence++)  +"\n");
				stopsequence = 1;
			
			}catch(ParseException a){
					System.out.println("can't parse" + readfile);
			}
			tripnumber++;

		}

		return tripnumber;	

	}	

	public static int outuc_stoptimes(String trip, int tripnumber, String readfile, PrintWriter printOutput){
	
		
		ArrayList<String> routefour = new ArrayList<String>();
		DateFormat format_time  = new SimpleDateFormat("HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		Date parse_starting_time;
		String east_remote_interior;
		String east_remote_outer;
		String east_field_house;
		String bookstore_cowell_outer;
		String crown_merill_outer;
		String nine_ten_outer;
		String science_hill_outer;
		String kresge_college_outer;
		String rachel_carson_outer;
		String family_housing;
		String oakes_outer;
		String west_remote_lot;
		String west_remote_lot_end;
		//String starting_time_thirty;
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
				east_remote_interior = routefour.get(b);
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + east_remote_interior + ", " + east_remote_interior + ", " +"46" + ", " + (stopsequence++)  +"\n");
				
				parse_starting_time = format_time.parse(east_remote_interior);
				cal.setTime(parse_starting_time);
				cal.add(Calendar.MINUTE, 1);
				east_remote_outer = format_time.format(cal.getTime());
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + east_remote_outer + ", " + east_remote_outer + ", " +"30" + ", " + (stopsequence++)  +"\n");

				cal.add(Calendar.MINUTE, 1);
				east_field_house = format_time.format(cal.getTime());
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + east_field_house + ", " + east_field_house + ", " +"11" + ", " + (stopsequence++)   +"\n");
				
				cal.add(Calendar.MINUTE, 1);
				bookstore_cowell_outer = format_time.format(cal.getTime());
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + bookstore_cowell_outer + ", " + bookstore_cowell_outer + ", " +"9" + ", " + (stopsequence++)   +"\n");
				
				cal.add(Calendar.MINUTE, 2);
				crown_merill_outer = format_time.format(cal.getTime());
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + crown_merill_outer + ", " + crown_merill_outer + ", " +"8" + ", " + (stopsequence++)   +"\n");
				
				cal.add(Calendar.MINUTE, 1);
				nine_ten_outer = format_time.format(cal.getTime());
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + nine_ten_outer + ", " + nine_ten_outer + ", " +"7" + ", " + (stopsequence++)  +"\n");
				
				cal.add(Calendar.MINUTE, 1);
				science_hill_outer = format_time.format(cal.getTime());
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + science_hill_outer + ", " + science_hill_outer + ", " +"4" + ", " + (stopsequence++)   +"\n");
				
				cal.add(Calendar.MINUTE, 1);
				kresge_college_outer = format_time.format(cal.getTime());
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + kresge_college_outer + ", " + kresge_college_outer + ", " +"1" + ", " + (stopsequence++)  +"\n");
				
				cal.add(Calendar.MINUTE, 2);
				rachel_carson_outer = format_time.format(cal.getTime());
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + rachel_carson_outer + ", " + rachel_carson_outer + ", " +"28" + ", " + (stopsequence++)   +"\n");
				
				cal.add(Calendar.MINUTE, 1);
				family_housing = format_time.format(cal.getTime());
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + family_housing + ", " + family_housing + ", " +"27" + ", " + (stopsequence++)  +"\n");
				
				cal.add(Calendar.MINUTE, 1);
				oakes_outer = format_time.format(cal.getTime());
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + oakes_outer + ", " + oakes_outer + ", " +"26" + ", " + (stopsequence++)  +"\n");
			
				cal.add(Calendar.MINUTE, 3);
				west_remote_lot = format_time.format(cal.getTime());
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + west_remote_lot + ", " + west_remote_lot + ", " +"31" + ", " + (stopsequence++)  +"\n");
				stopsequence =1;
			
			}catch(ParseException a){
					System.out.println("can't parse" + readfile);
			}
			tripnumber++;

		}

		return tripnumber;	

	}	

	public static int enc_stoptimes(String trip, int tripnumber, String readfile, PrintWriter printOutput){
	
		
		ArrayList<String> routefive = new ArrayList<String>();
		DateFormat format_time  = new SimpleDateFormat("HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		Date parse_starting_time;
		String quarry_plaza = "";
		String bookstore_cowell_inner = "";
		String eastremote_tme ="";
		String east_remote_outer = "";
		String east_field_house = "";
		String bookstore_outer = "";
		String crown_merrill = "";
		String crowncollege_time = "";
		String crown_apt = "";
		String nine_ten_outer = "";
		String sciencehill_time ="";
		String kresge_outer = "";
		String rachel_outer = "";
		String familyhousing = "";
		String oakes_outer = "";
		String westremote_time ="";
		String oakes_inner = "";
		String rachel_inner = "";
		String mediatheater_time ="";
		String kerr_hall = "";
		String thimannlab = "";
		String mchenrylibrary_time="";
		String quary_plaza_end = "";
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
					quarry_plaza = routefive.get(b);
					bookstore_cowell_inner = "24:01:00";
					eastremote_tme = "24:03:00";
					east_remote_outer = "24:05:00";
					east_field_house = "24:06:00";
					bookstore_outer = "24:07:00";
					crown_merrill = "24:08:00";
					crowncollege_time = "24:09:00";
					crown_apt = "24:10:00";
					nine_ten_outer = "24:12:00";
					sciencehill_time ="24:13:00";
					kresge_outer = "24:14:00";
					rachel_outer = "24:15:00";
					familyhousing = "24:16:00";
					oakes_outer = "24:17:00";
					westremote_time = "24:18:00";
					oakes_inner = "24:20:00";
					rachel_inner = "24:21:00";
					mediatheater_time ="24:22:00";
					kerr_hall = "24:23:00";
					thimannlab = "24:23:00";
					mchenrylibrary_time = "24:24:00";
					quary_plaza_end = "24:30:00";
					
				}else{
					quarry_plaza = routefive.get(b);
					
					parse_starting_time = format_time.parse(quarry_plaza);
					cal.setTime(parse_starting_time);
					cal.add(Calendar.MINUTE, 1);
					bookstore_cowell_inner = format_time.format(cal.getTime());
				
					cal.add(Calendar.MINUTE, 2);
					eastremote_tme = format_time.format(cal.getTime());
					
					
					cal.add(Calendar.MINUTE, 2);
					east_remote_outer = format_time.format(cal.getTime());
					
					
					cal.add(Calendar.MINUTE, 1);
					east_field_house = format_time.format(cal.getTime());
					
					cal.add(Calendar.MINUTE, 1);
					bookstore_outer = format_time.format(cal.getTime());
					
					cal.add(Calendar.MINUTE, 1);
					crown_merrill = format_time.format(cal.getTime());

					cal.add(Calendar.MINUTE, 1);
					crowncollege_time = format_time.format(cal.getTime());
					
					cal.add(Calendar.MINUTE, 1);
					crown_apt = format_time.format(cal.getTime());
				
					cal.add(Calendar.MINUTE, 2);
					nine_ten_outer = format_time.format(cal.getTime());
					
					cal.add(Calendar.MINUTE, 1);
					sciencehill_time = format_time.format(cal.getTime());
					
					cal.add(Calendar.MINUTE, 1);
					kresge_outer = format_time.format(cal.getTime());
					
					cal.add(Calendar.MINUTE, 1);
					rachel_outer = format_time.format(cal.getTime());
					
					cal.add(Calendar.MINUTE, 1);
					familyhousing = format_time.format(cal.getTime());
					
					cal.add(Calendar.MINUTE, 1);
					oakes_outer = format_time.format(cal.getTime());

					cal.add(Calendar.MINUTE, 1);
					westremote_time = format_time.format(cal.getTime());
					
					cal.add(Calendar.MINUTE, 2);
					oakes_inner = format_time.format(cal.getTime());
					
					cal.add(Calendar.MINUTE, 1);
					rachel_inner = format_time.format(cal.getTime());

					cal.add(Calendar.MINUTE, 1);
					mediatheater_time = format_time.format(cal.getTime());
					
					cal.add(Calendar.MINUTE, 1);
					kerr_hall = format_time.format(cal.getTime());
					
					/*cal.add(Calendar.MINUTE, 2);*/
					thimannlab = format_time.format(cal.getTime());

					cal.add(Calendar.MINUTE, 1);
					mchenrylibrary_time = format_time.format(cal.getTime());
					
					cal.add(Calendar.MINUTE, 6);
					quary_plaza_end = format_time.format(cal.getTime());
					if(quary_plaza_end.equals("00:00:00")){
						quary_plaza_end= "24:00:00";
					}
				}
				
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + quarry_plaza + ", " + quarry_plaza + ", " +"42" + ", " + (stopsequence++)  +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + bookstore_cowell_inner + ", " + bookstore_cowell_inner + ", " +"10" + ", " + (stopsequence++) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + eastremote_tme + ", " + eastremote_tme + ", " +"46" + ", " + (stopsequence++)  +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + east_remote_outer + ", " + east_remote_outer + ", " +"30" + ", " + (stopsequence++) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + east_field_house + ", " + east_field_house + ", " +"11" + ", " + (stopsequence++) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + bookstore_outer + ", " + bookstore_outer + ", " +"9" + ", " + (stopsequence++)  +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + crown_merrill + ", " + crown_merrill + ", " +"8" + ", " + (stopsequence++)  +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + crowncollege_time + ", " + crowncollege_time + ", " +"39" + ", " + (stopsequence++)  +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + crown_apt + ", " + crown_apt + ", " +"38" + ", " + (stopsequence++) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + nine_ten_outer + ", " + nine_ten_outer + ", " +"7" + ", " + (stopsequence++) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + sciencehill_time + ", " + sciencehill_time + ", " +"4" + ", " + (stopsequence++) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + kresge_outer + ", " + kresge_outer + ", " +"1" + ", " + (stopsequence++) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + rachel_outer + ", " + rachel_outer + ", " +"28" + ", " + (stopsequence++) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + familyhousing + ", " + familyhousing + ", " +"27" + ", " + (stopsequence++)  +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + oakes_outer + ", " + oakes_outer + ", " +"26" + ", " + (stopsequence++)  +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + westremote_time + ", " + westremote_time + ", " +"31" + ", " + (stopsequence++) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + oakes_inner + ", " + oakes_inner + ", " +"25" + ", " + (stopsequence++) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + rachel_inner + ", " + rachel_inner + ", " +"29" + ", " + (stopsequence++) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + mediatheater_time + ", " + mediatheater_time + ", " +"33" + ", " + (stopsequence++) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + kerr_hall + ", " + kerr_hall + ", " +"34" + ", " + (stopsequence++) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + thimannlab + ", " + thimannlab + ", " +"35" + ", " + (stopsequence++) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + mchenrylibrary_time + ", " + mchenrylibrary_time + ", " +"36" + ", " + (stopsequence++) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + quary_plaza_end + ", " + quary_plaza_end + ", " +"42" + ", " + (stopsequence++)  +"\n");
				stopsequence =1;
				
				
				/*printOutput.write(trip + "_" + (tripnumber+1) + ", " + quarry_plaza + ", " + quarry_plaza + ", " +"42" + ", " + (stopsequence++)  +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"10" + ", " + (stopsequence++) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"45" + ", " + (stopsequence++) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + eastremote_tme + ", " + eastremote_tme + ", " +"46" + ", " + (stopsequence++)  +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"30" + ", " + (stopsequence++) +"\n");
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
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"25" + ", " + (stopsequence++) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"29" + ", " + (stopsequence++) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + mediatheater_time + ", " + mediatheater_time + ", " +"33" + ", " + (stopsequence++) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"34" + ", " + (stopsequence++) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"35" + ", " + (stopsequence++) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + mchenrylibrary_time + ", " + mchenrylibrary_time + ", " +"36" + ", " + (stopsequence++) +"\n");
				
				
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + quary_plaza_end + ", " + quary_plaza_end + ", " +"42" + ", " + (stopsequence++)  +"\n");
				stopsequence =1;*/
			
			}catch(ParseException a){
					System.out.println("can't parse");
			}
			tripnumber++;
			
		}

		return tripnumber;	

	}	


	public static int wnc_stoptimes(String trip, int tripnumber, String readfile, PrintWriter printOutput){
	
		
		ArrayList<String> routesix = new ArrayList<String>();
		DateFormat format_time  = new SimpleDateFormat("HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		Date parse_starting_time;
		String quarry_plaza ="";
		String mchenry_library = "";
		String thimann_labs = "";
		String kerr_hall = "";
		String media_theater = "";
		String musiccenter_time="";
		String rachel_carson = "";
		String familyhousing = "";
		String oakes_outer ="";
		String westremote_time ="";
		String oakes_inner = "";
		String rachel_inner="";			
		String kresgebridge_time="";
		String kresge_inner = "";
		String sciencehill_time="";
		String nine_ten = "";
		String crown_apt ="";
		String crowncircle_time="";
		String cowell_circle ="";
		String stevensoncircle_time = "";
		String quarry_plaza_end="";
		
		String starting_time_thirty = "";

		int stopsequence = 1; 
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
						quarry_plaza = routesix.get(b);
						mchenry_library = "24:02:00";
						thimann_labs = "24:03:00";
						kerr_hall = "24:03:00";
						media_theater = "24:04:00";
						musiccenter_time = "24:05:00";
						rachel_carson = "24:07:00";
						familyhousing = "24:08:00";
						oakes_outer = "24:09:00";
						westremote_time = "24:10:00";
						oakes_inner = "24:12:00";
						rachel_inner = "24:13:00";
						kresgebridge_time = "24:14:00";
						kresge_inner = "24:15:00";
						sciencehill_time = "24:16:00";
						nine_ten = "24:17:00";
						crown_apt = "24:19:00";
						crowncircle_time = "24:20:00";
						cowell_circle = "24:22:00";
						stevensoncircle_time = "24:23:00";
						quarry_plaza_end = "24:30:00";
						starting_time_thirty = "24:30:00";
				}else{
				
					quarry_plaza = routesix.get(b);
					
					parse_starting_time = format_time.parse(quarry_plaza);
					cal.setTime(parse_starting_time);
					cal.add(Calendar.MINUTE, 2);
					mchenry_library = format_time.format(cal.getTime());
					
					
					
					cal.add(Calendar.MINUTE, 1);
					thimann_labs = format_time.format(cal.getTime());
					
					
					
					kerr_hall = format_time.format(cal.getTime());
					
					
					
					
					cal.add(Calendar.MINUTE, 1);
					media_theater = format_time.format(cal.getTime());
					
					
					cal.add(Calendar.MINUTE, 1);
					musiccenter_time = format_time.format(cal.getTime());
					
					
					cal.add(Calendar.MINUTE, 2);
					rachel_carson = format_time.format(cal.getTime());
					
					
					
					cal.add(Calendar.MINUTE, 1);
					familyhousing = format_time.format(cal.getTime());
					
					
					cal.add(Calendar.MINUTE, 1);
					oakes_outer = format_time.format(cal.getTime());
					

					cal.add(Calendar.MINUTE, 1);
					westremote_time = format_time.format(cal.getTime());
					

					cal.add(Calendar.MINUTE, 2);
					oakes_inner = format_time.format(cal.getTime());
					
					

					cal.add(Calendar.MINUTE, 1);
					rachel_inner = format_time.format(cal.getTime());
					

					cal.add(Calendar.MINUTE, 1);
					kresgebridge_time = format_time.format(cal.getTime());
					

					cal.add(Calendar.MINUTE, 1);
					kresge_inner = format_time.format(cal.getTime());
					

					cal.add(Calendar.MINUTE, 1);
					sciencehill_time = format_time.format(cal.getTime());
					

					cal.add(Calendar.MINUTE, 1);
					nine_ten = format_time.format(cal.getTime());
					
					

					cal.add(Calendar.MINUTE, 2);
					crown_apt = format_time.format(cal.getTime());
					

					cal.add(Calendar.MINUTE, 1);
					crowncircle_time = format_time.format(cal.getTime());
					

					cal.add(Calendar.MINUTE, 2);
					cowell_circle = format_time.format(cal.getTime());
					

					cal.add(Calendar.MINUTE, 1);
					stevensoncircle_time = format_time.format(cal.getTime());
					
					cal.add(Calendar.MINUTE, 7);
					quarry_plaza_end = format_time.format(cal.getTime());
					if(quarry_plaza_end.equals("00:00:00")){
						quarry_plaza_end= "24:00:00";
					}
					
				}
				
				
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + quarry_plaza + ", " + quarry_plaza + ", " +"42" + ", " + (stopsequence++)  +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + mchenry_library  + ", " + mchenry_library  + ", " +"36" + ", " + (stopsequence++) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + thimann_labs + ", " + thimann_labs + ", " +"35" + ", " + (stopsequence++) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + kerr_hall + ", " + kerr_hall + ", " +"34" + ", " + (stopsequence++) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + media_theater + ", " + media_theater + ", " +"33" + ", " + (stopsequence++) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + musiccenter_time + ", " + musiccenter_time + ", " +"32" + ", " + (stopsequence++)  +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + rachel_carson + ", " + rachel_carson + ", " +"28" + ", " + (stopsequence++)  +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + familyhousing + ", " + familyhousing + ", " +"27" + ", " + (stopsequence++) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + oakes_outer + ", " + oakes_outer + ", " +"26" + ", " + (stopsequence++)  +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + westremote_time + ", " + westremote_time + ", " +"31" + ", " + (stopsequence++)  +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + oakes_inner + ", " + oakes_inner + ", " +"25" + ", " + (stopsequence++) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + rachel_inner + ", " + rachel_inner + ", " +"29" + ", " + (stopsequence++) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + kresgebridge_time + ", " + kresgebridge_time + ", " +"2" + ", " + (stopsequence++) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + kresge_inner + ", " + kresge_inner + ", " +"3" + ", " + (stopsequence++)  +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + sciencehill_time + ", " + sciencehill_time + ", " +"5" + ", " + (stopsequence++) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + nine_ten + ", " + nine_ten + ", " +"6" + ", " + (stopsequence++) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + crown_apt + ", " + crown_apt + ", " +"38" + ", " + (stopsequence++) +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + crowncircle_time + ", " + crowncircle_time + ", " +"39" + ", " + (stopsequence++)  +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + cowell_circle + ", " + cowell_circle+ ", " +"37" + ", " + (stopsequence++)  +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + stevensoncircle_time + ", " + stevensoncircle_time + ", " +"44" + ", " + (stopsequence++)  +"\n");
				printOutput.write(trip + "_" + (tripnumber+1) + ", " + 	quarry_plaza_end  + ", " + quarry_plaza_end + ", " +"42" + ", " + (stopsequence++) +"\n");
				stopsequence = 1;
			}catch(ParseException a){
					System.out.println("can't parse" + readfile + routesix.get(b));
			}
			tripnumber++;
			
	
	
		}

		return tripnumber;	

	}	



	
}



