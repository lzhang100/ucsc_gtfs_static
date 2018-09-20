import java.lang.Object.*;
import java.io.PrintWriter;

//Open the file called calendar_dates.txt, write the GTFS data, and close the file.
class Calendardates{
	public static void main (String args[]){
		//System.out.println("Hello World");
		try{
			PrintWriter calendardates = new PrintWriter("calendar_dates.txt");
			calendardates.write("service_id,date,exception_type\n");
			calendardates.write("2017SpringWDMonThur, 20170529, 2\n");
			calendardates.write("2017SpringWESat,20170527, 2 \n");
			calendardates.write("2017SpringWESun, 20170528, 2\n");
			calendardates.write("2017SummerISWD, 20170902, 2\n");
			calendardates.write("2017SummerISWD, 20170903, 2 \n");
			calendardates.write("2017SummerISWD, 20170904, 2\n");
			calendardates.write("2017FallWD, 20171110, 2\n");
			calendardates.write("2017FallWD, 20171123, 2\n");
			calendardates.write("2017FallWD, 20171124, 2");
			calendardates.close();
		}catch(Exception e){
			System.out.println("can not find file");
		}
	}
}
