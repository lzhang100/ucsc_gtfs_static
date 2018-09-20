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

import java.util.*;
class Stoptimes{
		public static void main(String[] args){

				//System.out.println("Hello World");
				ArrayList<String> listoffiles  = new ArrayList<String>();
				
				try{
					Scanner scan = new Scanner (new File(args[0]));
					while (scan.hasNextLine()) {
							listoffiles.add(scan.nextLine());
					}

				}catch(Exception e){
						System.out.println("Could not open spr17_monthur file");
				}
				
				for(String listoffiles_elem : listoffiles){
					System.out.println(listoffiles_elem);
				}
				
//Spring2017MonThurLoopOut

				ArrayList<String> spr17_monthur_loopo  = new ArrayList<String>();
				ArrayList<String> spr17_monthur_loopo_addtwentymin = new ArrayList<String>();

				DateFormat spr17_monthur_loopo_format  = new SimpleDateFormat("hh:mm:ss");
				Calendar spr17_monthur_loopo_cal = Calendar.getInstance();
				Date spr17_monthur_loopo_time;
				File toOutput= new File(args[1]);
				PrintWriter printOutput = null;
				
				try{
					printOutput = new PrintWriter(toOutput);
				}catch(Exception e){
					System.out.println("Can't open output file");
				}
				
				printOutput.write("trip_id, arrival_time, departure_time, stop_id, stop_sequence, trip_index" + "\n");
				


				try{
						Scanner scan = new Scanner (new File(listoffiles.get(0)));
						while (scan.hasNextLine()) {
								spr17_monthur_loopo.add(scan.nextLine());
						}

				}catch(Exception e){
						System.out.println("Could not open spr17_monthur file");
				}
				
				for(String spr17_monthur_loopo_elem : spr17_monthur_loopo){
					//System.out.println(spr17_monthur_loopo_elem);
					try{
						spr17_monthur_loopo_time = spr17_monthur_loopo_format.parse(spr17_monthur_loopo_elem);
						spr17_monthur_loopo_cal.setTime(spr17_monthur_loopo_time);
						spr17_monthur_loopo_cal.add(Calendar.MINUTE, 20);
						spr17_monthur_loopo_addtwentymin.add(spr17_monthur_loopo_format.format(spr17_monthur_loopo_cal.getTime()));
					}catch(ParseException a){
						System.out.println("Can't Parse");
					}

				}

				/*for(String spr17_monthur_loopo_addtwentymin_elem : spr17_monthur_loopo_addtwentymin){
					//System.out.println(spr17_monthur_loopo_addtwentymin_elem);
				}*/

				int tripnumber = 0;
				int tripindex = 0;
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
						printOutput.write("T1_" + (tripnumber+1) + ", " + spr17_monthur_loopo_addtwentymin.get(b) + ", " + spr17_monthur_loopo_addtwentymin.get(b) + ", " +"19" + ", " + "16" + ", " +  (tripindex+1) +"\n");
						tripnumber++;
						tripindex++;
				}

				tripindex = 0;
				
//Spring2017FridayLoopOut	

				ArrayList<String> spr17_friday_loopo  = new ArrayList<String>();
				ArrayList<String> spr17_friday_loopo_addtwentymin = new ArrayList<String>();

				DateFormat spr17_friday_loopo_format  = new SimpleDateFormat("hh:mm:ss");
				Calendar spr17_friday_loopo_cal = Calendar.getInstance();
				Date spr17_friday_loopo_time;


				try{
						Scanner scan = new Scanner (new File(listoffiles.get(1)));
						while (scan.hasNextLine()) {
								spr17_friday_loopo.add(scan.nextLine());
						}

				}catch(Exception e){
						//System.out.println(args[1]);
						System.out.println("Could not open spr17_friday file");
				}
				
				for(String spr17_friday_loopo_elem : spr17_friday_loopo){
					//System.out.println(spr17_monthur_loopo_elem);
					try{
						spr17_friday_loopo_time = spr17_friday_loopo_format.parse(spr17_friday_loopo_elem);
						spr17_friday_loopo_cal.setTime(spr17_friday_loopo_time);
						spr17_friday_loopo_cal.add(Calendar.MINUTE, 20);
						spr17_friday_loopo_addtwentymin.add(spr17_friday_loopo_format.format(spr17_friday_loopo_cal.getTime()));
					}catch(ParseException a){
						System.out.println("Can't Parse");
					}

				}

				/*for(String spr17_monthur_loopo_addtwentymin_elem : spr17_monthur_loopo_addtwentymin){
					//System.out.println(spr17_monthur_loopo_addtwentymin_elem);
				}*/

				
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
						printOutput.write("T1_" + (tripnumber+1) + ", " + spr17_friday_loopo_addtwentymin.get(b) + ", " + spr17_friday_loopo_addtwentymin.get(b) + ", " +"19" + ", " + "16" + ", " +  (tripindex+1) +"\n");
						tripnumber++;
						tripindex++;
				}

				tripindex = 0;
				
				tripnumber = 0;

//Spring2017MonThurLoopin				
				ArrayList<String> spr17_monthur_loopin  = new ArrayList<String>();
				ArrayList<String> spr17_monthur_loopin_addtwentymin = new ArrayList<String>();

				DateFormat spr17_monthur_loopin_format  = new SimpleDateFormat("hh:mm:ss");
				Calendar spr17_monthur_loopin_cal = Calendar.getInstance();
				Date spr17_monthur_loopin_time;
				
				try{
						Scanner scan = new Scanner (new File(listoffiles.get(2)));
						while (scan.hasNextLine()) {
								spr17_monthur_loopin.add(scan.nextLine());
						}

				}catch(Exception e){
						System.out.println("Could not open spr17_monthur file");
				}
				
				for(String spr17_monthur_loopin_elem : spr17_monthur_loopin){
					//System.out.println(spr17_monthur_loopo_elem);
					try{
						spr17_monthur_loopin_time = spr17_monthur_loopo_format.parse(spr17_monthur_loopin_elem);
						spr17_monthur_loopin_cal.setTime(spr17_monthur_loopin_time);
						spr17_monthur_loopin_cal.add(Calendar.MINUTE, 20);
						spr17_monthur_loopin_addtwentymin.add(spr17_monthur_loopin_format.format(spr17_monthur_loopin_cal.getTime()));
					}catch(ParseException a){
						System.out.println("Can't Parse");
					}

				}
				
				for(int b=0; b<spr17_monthur_loopin.size(); b++){
						printOutput.write("T2_" + (tripnumber+1) + ", " + spr17_monthur_loopin.get(b) + ", " + spr17_monthur_loopin.get(b) + ", " +"19" + ", " + "1" + ", " +  (tripindex+1) +"\n");
						printOutput.write("T2_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"16" + ", " + "2" + ", " +  (tripindex+1) +"\n");
						printOutput.write("T2_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"14" + ", " + "3" + ", " +  (tripindex+1) +"\n");
						printOutput.write("T2_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"12" + ", " + "4" + ", " +  (tripindex+1) +"\n");
						printOutput.write("T2_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"11" + ", " + "5" + ", " +  (tripindex+1) +"\n");
						printOutput.write("T2_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"9" + ", " + "6" + ", " +  (tripindex+1) +"\n");
						printOutput.write("T2_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"8" + ", " + "7" + ", " +  (tripindex+1) +"\n");
						printOutput.write("T2_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"7" + ", " + "8" + ", " +  (tripindex+1) +"\n");
						printOutput.write("T2_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"4" + ", " + "9" + ", " +  (tripindex+1) +"\n");
						printOutput.write("T2_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"1" + ", " + "10" + ", " +  (tripindex+1) +"\n");
						printOutput.write("T2_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"28" + ", " + "11" + ", " +  (tripindex+1) +"\n");
						printOutput.write("T2_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"27" + ", " + "12" + ", " +  (tripindex+1) +"\n");
						printOutput.write("T2_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"25" + ", " + "13" + ", " +  (tripindex+1) +"\n");
						printOutput.write("T2_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"24" + ", " + "14" + ", " +  (tripindex+1) +"\n");
						printOutput.write("T2_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"21" + ", " + "15" + ", " +  (tripindex+1) +"\n");
						printOutput.write("T2_" + (tripnumber+1) + ", " + spr17_monthur_loopin_addtwentymin.get(b) + ", " + spr17_monthur_loopin_addtwentymin.get(b) + ", " +"19" + ", " + "16" + ", " +  (tripindex+1) +"\n");
						tripnumber++;
						tripindex++;
				}
				
				tripindex = 0;
				
//Spring2017FridayLoopin					
				ArrayList<String> spr17_friday_loopin  = new ArrayList<String>();
				ArrayList<String> spr17_friday_loopin_addtwentymin = new ArrayList<String>();

				DateFormat spr17_friday_loopin_format  = new SimpleDateFormat("hh:mm:ss");
				Calendar spr17_friday_loopin_cal = Calendar.getInstance();
				Date spr17_friday_loopin_time;
				
				try{
						Scanner scan = new Scanner (new File(listoffiles.get(3)));
						while (scan.hasNextLine()) {
								spr17_friday_loopin.add(scan.nextLine());
						}

				}catch(Exception e){
						System.out.println("Could not open spr17_monthur file");
				}
				
				for(String spr17_friday_loopin_elem : spr17_friday_loopin){
					System.out.println(spr17_friday_loopin_elem);
					try{
						spr17_friday_loopin_time = spr17_friday_loopo_format.parse(spr17_friday_loopin_elem);
						spr17_friday_loopin_cal.setTime(spr17_friday_loopin_time);
						spr17_friday_loopin_cal.add(Calendar.MINUTE, 20);
						spr17_friday_loopin_addtwentymin.add(spr17_friday_loopin_format.format(spr17_friday_loopin_cal.getTime()));
					}catch(ParseException a){
						System.out.println("Can't Parse friday_inner");
					}

				}
				
				for(int b=0; b<spr17_friday_loopin.size(); b++){
						printOutput.write("T2_" + (tripnumber+1) + ", " + spr17_friday_loopin.get(b) + ", " + spr17_friday_loopin.get(b) + ", " +"19" + ", " + "1" + ", " +  (tripindex+1) +"\n");
						printOutput.write("T2_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"16" + ", " + "2" + ", " +  (tripindex+1) +"\n");
						printOutput.write("T2_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"14" + ", " + "3" + ", " +  (tripindex+1) +"\n");
						printOutput.write("T2_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"12" + ", " + "4" + ", " +  (tripindex+1) +"\n");
						printOutput.write("T2_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"11" + ", " + "5" + ", " +  (tripindex+1) +"\n");
						printOutput.write("T2_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"9" + ", " + "6" + ", " +  (tripindex+1) +"\n");
						printOutput.write("T2_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"8" + ", " + "7" + ", " +  (tripindex+1) +"\n");
						printOutput.write("T2_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"7" + ", " + "8" + ", " +  (tripindex+1) +"\n");
						printOutput.write("T2_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"4" + ", " + "9" + ", " +  (tripindex+1) +"\n");
						printOutput.write("T2_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"1" + ", " + "10" + ", " +  (tripindex+1) +"\n");
						printOutput.write("T2_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"28" + ", " + "11" + ", " +  (tripindex+1) +"\n");
						printOutput.write("T2_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"27" + ", " + "12" + ", " +  (tripindex+1) +"\n");
						printOutput.write("T2_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"25" + ", " + "13" + ", " +  (tripindex+1) +"\n");
						printOutput.write("T2_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"24" + ", " + "14" + ", " +  (tripindex+1) +"\n");
						printOutput.write("T2_" + (tripnumber+1) + ", " + "" + ", " + "" + ", " +"21" + ", " + "15" + ", " +  (tripindex+1) +"\n");
						printOutput.write("T2_" + (tripnumber+1) + ", " + spr17_friday_loopin_addtwentymin.get(b) + ", " + spr17_friday_loopin_addtwentymin.get(b) + ", " +"19" + ", " + "16" + ", " +  (tripindex+1) +"\n");
						tripnumber++;
						tripindex++;
				}
				
				tripindex = 0;
				
				
				
				
				printOutput.close();

		}
}
