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
class Shapes{

	public static void main (String args[]){
			
	
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
		printOutput.write("shape_id, shape_pt_lat, shape_pt_lon, shape_pt_sequence" + "\n");
		
		
		//Adding content to trips.txt to retain information for R1 and it services
		int shapeseq = 1;
		makeshape("LoopOshape", shapeseq, "loopo_shape.txt", printOutput);
		makeshape("Loopinshape", shapeseq, "loopin_shape.txt", printOutput);
		makeshape("Inucshape", shapeseq, "inuc_shape.txt", printOutput);
		makeshape("Outucshape", shapeseq, "outuc_shape.txt", printOutput);
		makeshape("Encshape", shapeseq, "enc_shape.txt", printOutput);
		makeshape("Wncshape", shapeseq, "wnc_shape.txt", printOutput);


		//tripnumber = maketrip("R1", "2017SpringWDMonThur", "T1", tripnumber, "spr17_monthur_loopo.txt", printOutput);
		
		


		



		printOutput.close();
		
		
	}
	
	public static void makeshape(String shapeid, int shapeseq, String readfile, PrintWriter printOutput){
		//System.out.println("Got in here");
		
		String[] latlong;
		String latitude;
		String longitude;

		Scanner scan = null;
		try{
			scan = new Scanner (new File(readfile));
			while (scan.hasNextLine()) {
				latlong = scan.nextLine().split(", ");
				latitude = latlong[0];
				longitude = latlong[1];
				
				
				printOutput.write(shapeid + ", " + latitude + ", " + longitude + ", " + shapeseq + "\n");	
				shapeseq++;
						
			}
			System.out.println("Got in here");
			scan.close();
			
		}catch(Exception e){
			System.out.println("Can not open: " + readfile);
		}
		
	}
	
}



