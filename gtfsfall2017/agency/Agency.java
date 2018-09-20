import java.lang.Object.*;
import java.io.PrintWriter;

class Agency{
	public static void main (String args[]){
		//System.out.println("Hello World");
		try{
			PrintWriter agency = new PrintWriter("agency.txt");
			agency.write("agency_name, agency_url, agency_timezone,agency_lang, agency_phone\n");
			agency.write("UC Santa Cruz Campus Transit, http://taps.ucsc.edu, America/Los_Angeles, en, (831)459-3228");
			agency.close();
		}catch(Exception e){
			System.out.println("can not find file");
		}
	}
}
