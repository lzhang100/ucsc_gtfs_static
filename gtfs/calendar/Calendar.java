import java.lang.Object.*;
import java.io.PrintWriter;

//Open the file calendar.txt, write the GTFS data, and close the file.

class Calendar{
	public static void main (String args[]){
		try{
			PrintWriter calendar = new PrintWriter("calendar.txt");
			calendar.write("service_id, monday, tuesday, wednesday, thursday, friday, saturday, sunday, start_date, end_date\n");
			calendar.write("2017SpringWDMonThur, 1, 1, 1, 1, 0, 0, 0, 20170403, 20170611\n");
			calendar.write("2017SpringWDFriday, 0, 0, 0, 0, 1, 0, 0, 20170403, 20170611\n");
			calendar.write("2017SpringWESat, 0, 0, 0, 0, 0, 1, 0, 20170403, 20170611\n");
			calendar.write("2017SpringWESun, 0, 0, 0, 0, 0, 0, 1, 20170403, 20170611\n");
			calendar.write("2017SpringFinalsWD, 1, 1, 1, 1, 1, 0, 0, 20170612, 20170615\n");
			calendar.write("2017SpringISWD, 1, 1, 1, 1, 1, 0, 0, 20170616, 20170623");
	
			
			calendar.close();
		}catch(Exception e){
			System.out.println("can not find file");
		}
	}
}
