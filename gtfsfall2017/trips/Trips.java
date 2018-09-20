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
		
		
		//Create pointer to trips.txt to be written later
		
		File toOutput= new File(args[0]);
		PrintWriter printOutput = null;
		
		try{
			printOutput = new PrintWriter(toOutput);
		}catch(Exception e){
			System.out.println("Can not open: " + args[1]);
		}
		
		//Write to trips.txt the fields of the file
		printOutput.write("route_id, service_id, trip_id, shape_id, trip_headsign" + "\n");

		
		
		//Adding content to trips.txt to retain information for R1 and it services
		int tripnumber = 0;
		tripnumber = maketrip("R1", "2017FallWDMonThur", "T1", tripnumber, "LoopOshape", "CounterClockwise", "fall17_monthur_loopo.txt", printOutput);
		tripnumber = maketrip("R1", "2017FallWDFriday", "T1", tripnumber, "LoopOshape", "CounterClockwise", "fall17_friday_loopo.txt", printOutput);
		tripnumber = maketrip("R1", "2017FallWESat", "T1", tripnumber, "LoopOshape", "CounterClockwise", "fall17_saturday_loopo.txt", printOutput);
		tripnumber = maketrip("R1", "2017FallWESun", "T1", tripnumber, "LoopOshape", "CounterClockwise", "fall17_sunday_loopo.txt", printOutput);
		tripnumber = maketrip("R1", "2017FallFinalsWD", "T1", tripnumber, "LoopOshape", "CounterClockwise", "fall17_finals_loopo.txt", printOutput);
		tripnumber = maketrip("R1", "2017FallISWD", "T1", tripnumber, "LoopOshape", "CounterClockwise", "fall17_intermission_loopo.txt", printOutput);

		
		tripnumber = 0;
		tripnumber = maketrip("R1", "2017FallWDMonThur", "T2", tripnumber, "Loopinshape", "Clockwise", "fall17_monthur_loopin.txt", printOutput);
		tripnumber = maketrip("R1", "2017FallWDFriday", "T2", tripnumber, "Loopinshape", "Clockwise",  "fall17_friday_loopin.txt", printOutput);
		tripnumber = maketrip("R1", "2017FallWESat", "T2", tripnumber, "Loopinshape", "Clockwise", "fall17_saturday_loopin.txt", printOutput);
		tripnumber = maketrip("R1", "2017FallWESun", "T2", tripnumber, "Loopinshape", "Clockwise", "fall17_sunday_loopin.txt", printOutput);
		tripnumber = maketrip("R1", "2017FallFinalsWD", "T2", tripnumber, "Loopinshape", "Clockwise", "fall17_finals_loopin.txt", printOutput);
		tripnumber = maketrip("R1", "2017FallISWD", "T2", tripnumber, "Loopinshape", "Clockwise", "fall17_intermission_loopin.txt", printOutput);
		
		tripnumber = 0;
		tripnumber = maketrip("R2", "2017FallWDMonThur", "T3", tripnumber, "Inucshape", "Clockwise", "fall17_monthur_inuc.txt", printOutput);
		tripnumber = maketrip("R2", "2017FallWDFriday", "T3", tripnumber, "Inucshape", "Clockwise", "fall17_friday_inuc.txt", printOutput);
		tripnumber = maketrip("R2", "2017FallFinalsWD", "T3", tripnumber, "Inucshape", "Clockwise", "fall17_finals_inuc.txt", printOutput);
		
		tripnumber = 0;
		tripnumber = maketrip("R2", "2017FallWDMonThur", "T4", tripnumber, "Outucshape", "CounterClockwise", "fall17_monthur_outuc.txt", printOutput);
		tripnumber = maketrip("R2", "2017FallWDFriday", "T4", tripnumber, "Outucshape", "CounterClockwise", "fall17_friday_outuc.txt", printOutput);
		tripnumber = maketrip("R2", "2017FallFinalsWD", "T4", tripnumber, "Outucshape", "CounterClockwise", "fall17_finals_outuc.txt", printOutput);

		
		tripnumber = 0;
		tripnumber = maketrip("R3", "2017FallWDMonThur", "T5", tripnumber, "Encshape", " ", "fall17_monthur_enc.txt", printOutput);
		tripnumber = maketrip("R3", "2017FallWDFriday", "T5", tripnumber, "Encshape", " ", "fall17_friday_enc.txt", printOutput);
		tripnumber = maketrip("R3", "2017FallWESat", "T5", tripnumber, "Encshape", " ", "fall17_saturday_enc.txt", printOutput);
		tripnumber = maketrip("R3", "2017FallWESun", "T5", tripnumber, "Encshape", " ", "fall17_sunday_enc.txt", printOutput);
		tripnumber = maketrip("R3", "2017FallFinalsWD", "T5", tripnumber, "Encshape", " ", "fall17_finals_enc.txt", printOutput);
		
		
		
		tripnumber = 0;
		tripnumber = maketrip("R4", "2017FallWDMonThur", "T6", tripnumber, "Wncshape", " ", "fall17_monthur_wnc.txt", printOutput);
		tripnumber = maketrip("R4", "2017FallWDFriday", "T6", tripnumber, "Wncshape", " ", "fall17_friday_wnc.txt", printOutput);
		tripnumber = maketrip("R4", "2017FallWESat", "T6", tripnumber, "Wncshape", " ", "fall17_saturday_wnc.txt", printOutput);
		tripnumber = maketrip("R4", "2017FallWESun", "T6", tripnumber, "Wncshape", " ", "fall17_sunday_wnc.txt", printOutput);
		tripnumber = maketrip("R4", "2017FallFinalsWD", "T6", tripnumber, "Wncshape", " ", "fall17_finals_wnc.txt", printOutput);
		
		

		
		



		printOutput.close();
		
		
	}
	
	public static int maketrip(String routeid, String service, String trip, int tripnumber, String shapeid, String tripheadsign, String readfile, PrintWriter printOutput){

		Scanner scan = null;
		try{
			scan = new Scanner (new File(readfile));
			while (scan.hasNextLine()) {
				printOutput.write(routeid + ", " + service + ", " + trip + "_" + (tripnumber+1)+ ", " + shapeid + ", " + tripheadsign + "\n");	
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



