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
		
		
		//Create a pointer to write to shapes.txt
		
		File toOutput= new File(args[0]);

		//OPen the shapes.txt 
		PrintWriter printOutput = null;
		
		try{
			printOutput = new PrintWriter(toOutput);
		}catch(Exception e){
			System.out.println("Can not open: " + args[1]);
		}
		
		//Write to shapes.txt the fields of the file
		printOutput.write("shape_id, shape_pt_lat, shape_pt_lon, shape_pt_sequence" + "\n");
		
		
		//Create the shape of the route
		int shapeseq = 1;
		makeshape("LoopOshape", shapeseq, "loopo_shape.txt", printOutput);
		makeshape("Loopinshape", shapeseq, "loopin_shape.txt", printOutput);
		makeshape("Inucshape", shapeseq, "inuc_shape.txt", printOutput);
		makeshape("Outucshape", shapeseq, "outuc_shape.txt", printOutput);
		makeshape("Encshape", shapeseq, "enc_shape.txt", printOutput);
		makeshape("Wncshape", shapeseq, "wnc_shape.txt", printOutput);

		//close the file
		printOutput.close();
		
		
	}

	/*Everytime you read the coordinates from the file that stores these coordinates,
		you will split the coordinates to latitude and longitude into two variables call latitude and longitude
		write to the file and increase shape seq varaible.
	*/
	
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



