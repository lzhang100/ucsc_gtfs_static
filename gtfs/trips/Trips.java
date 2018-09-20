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
		
		
		//Create pointer to trips.txt to be written later
		
		File toOutput= new File(args[0]);
		PrintWriter printOutput = null;
		
		try{
			printOutput = new PrintWriter(toOutput);
		}catch(Exception e){
			System.out.println("Can not open: " + args[1]);
		}
		
		//Write to trips.txt the fields of the file
		printOutput.write("route_id, service_id, trip_id, shape_id" + "\n");

		
		
		//Adding trips to trips.txt for LoopO route and its services
		int tripnumber = 0;
		tripnumber = maketrip("R1", "2017SpringWDMonThur", "T1", tripnumber, "LoopOshape", "spr17_monthur_loopo.txt", printOutput);
		tripnumber = maketrip("R1", "2017SpringWDFriday", "T1", tripnumber, "LoopOshape", "spr17_friday_loopo.txt", printOutput);
		tripnumber = maketrip("R1", "2017SpringWESat", "T1", tripnumber, "LoopOshape", "spr17_saturday_loopo.txt", printOutput);
		tripnumber = maketrip("R1", "2017SpringWESun", "T1", tripnumber, "LoopOshape", "spr17_sunday_loopo.txt", printOutput);
		tripnumber = maketrip("R1", "2017SpringFinalsWD", "T1", tripnumber, "LoopOshape", "spr17_finals_loopo.txt", printOutput);
		tripnumber = maketrip("R1", "2017SpringISWD", "T1", tripnumber, "LoopOshape","spr17_intermission_loopo.txt", printOutput);

		//Adding trips to trips.txt for LoopIn route and its services
		tripnumber = 0;
		tripnumber = maketrip("R2", "2017SpringWDMonThur", "T2", tripnumber, "Loopinshape", "spr17_monthur_loopin.txt", printOutput);
		tripnumber = maketrip("R2", "2017SpringWDFriday", "T2", tripnumber, "Loopinshape", "spr17_friday_loopin.txt", printOutput);
		tripnumber = maketrip("R2", "2017SpringWESat", "T2", tripnumber, "Loopinshape", "spr17_saturday_loopin.txt", printOutput);
		tripnumber = maketrip("R2", "2017SpringWESun", "T2", tripnumber, "Loopinshape", "spr17_sunday_loopin.txt", printOutput);
		tripnumber = maketrip("R2", "2017SpringFinalsWD", "T2", tripnumber, "Loopinshape", "spr17_finals_loopin.txt", printOutput);
		tripnumber = maketrip("R2", "2017SpringISWD", "T2", tripnumber, "Loopinshape", "spr17_intermission_loopin.txt", printOutput);
		
		//Adding trips to trips.txt for InUC route and its services
		tripnumber = 0;
		tripnumber = maketrip("R3", "2017SpringWDMonThur", "T3", tripnumber, "Inucshape", "spr17_monthur_inuc.txt", printOutput);
		tripnumber = maketrip("R3", "2017SpringWDFriday", "T3", tripnumber, "Inucshape", "spr17_friday_inuc.txt", printOutput);
		tripnumber = maketrip("R3", "2017SpringFinalsWD", "T3", tripnumber, "Inucshape", "spr17_finals_inuc.txt", printOutput);
		
		//Adding trips to trips.txt for OutUC route and its services
		tripnumber = 0;
		tripnumber = maketrip("R4", "2017SpringWDMonThur", "T4", tripnumber, "Outucshape", "spr17_monthur_outuc.txt", printOutput);
		tripnumber = maketrip("R4", "2017SpringWDFriday", "T4", tripnumber, "Outucshape", "spr17_friday_outuc.txt", printOutput);
		tripnumber = maketrip("R4", "2017SpringFinalsWD", "T4", tripnumber, "Outucshape", "spr17_finals_outuc.txt", printOutput);

		//Adding trips to trips.txt for ENC route and its services
		tripnumber = 0;
		tripnumber = maketrip("R5", "2017SpringWDMonThur", "T5", tripnumber, "Encshape","spr17_monthur_enc.txt", printOutput);
		tripnumber = maketrip("R5", "2017SpringWDFriday", "T5", tripnumber, "Encshape","spr17_friday_enc.txt", printOutput);
		tripnumber = maketrip("R5", "2017SpringWESat", "T5", tripnumber, "Encshape", "spr17_saturday_enc.txt", printOutput);
		tripnumber = maketrip("R5", "2017SpringWESun", "T5", tripnumber, "Encshape", "spr17_sunday_enc.txt", printOutput);
		tripnumber = maketrip("R5", "2017SpringFinalsWD", "T5", tripnumber, "Encshape", "spr17_finals_enc.txt", printOutput);
		
		
		//Adding trips to trips.txt for WNC route and its services		
		tripnumber = 0;
		tripnumber = maketrip("R6", "2017SpringWDMonThur", "T6", tripnumber, "Wncshape", "spr17_monthur_wnc.txt", printOutput);
		tripnumber = maketrip("R6", "2017SpringWDFriday", "T6", tripnumber, "Wncshape", "spr17_friday_wnc.txt", printOutput);
		tripnumber = maketrip("R6", "2017SpringWESat", "T6", tripnumber, "Wncshape", "spr17_saturday_wnc.txt", printOutput);
		tripnumber = maketrip("R6", "2017SpringWESun", "T6", tripnumber, "Wncshape", "spr17_sunday_wnc.txt", printOutput);
		tripnumber = maketrip("R6", "2017SpringFinalsWD", "T6", tripnumber, "Wncshape", "spr17_finals_wnc.txt", printOutput);

		printOutput.close();
		
		
	}
	

	/*
	For each starting times for a trip I should write to trips.txt
	*/
	public static int maketrip(String routeid, String service, String trip, int tripnumber, String shapeid, String readfile, PrintWriter printOutput){

		Scanner scan = null;
		try{
			scan = new Scanner (new File(readfile));
			while (scan.hasNextLine()) {
				printOutput.write(routeid + ", " + service + ", " + trip + "_" + (tripnumber+1)+ ", " + shapeid + "\n");	
				tripnumber++;
				scan.nextLine();		
			}
			scan.close();
			
		}catch(Exception e){
			System.out.println("Can not open: " + readfile);
		}
	
		return tripnumber;
	}
	
}



