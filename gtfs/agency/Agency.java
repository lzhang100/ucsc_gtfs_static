import java.lang.Object.*;
import java.io.PrintWriter;


class Agency{
	public static void main (String args[]){
		try{
			//Open the file agency.txt
			PrintWriter agency = new PrintWriter("agency.txt");

			//Write to agency.txt
			agency.write("agency_name, agency_url, agency_timezone,agency_lang, agency_phone\n");
			agency.write("University of California Santa Cruz Campus Shuttle Service, http://taps.ucsc.edu, America/Los_Angeles, en, (831)459-3228");
			
			//Make sure to close the file 
			agency.close();
		}catch(Exception e){
			System.out.println("can not find file");
		}
	}
}
