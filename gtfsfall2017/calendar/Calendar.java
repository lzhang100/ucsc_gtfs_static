import java.lang.Object.*;
import java.io.PrintWriter;

class Calendar{
	public static void main (String args[]){
		//System.out.println("Hello World");
		try{
			PrintWriter calendar = new PrintWriter("calendar.txt");
			calendar.write("service_id, monday, tuesday, wednesday, thursday, friday, saturday, sunday, start_date, end_date\n");
			calendar.write("2017FallWDMonThur, 1, 1, 1, 1, 0, 0, 0, 20170925, 20171207\n");
			calendar.write("2017FallWDFriday, 0, 0, 0, 0, 1, 0, 0, 20170929, 20171208\n");
			calendar.write("2017FallWESat, 0, 0, 0, 0, 0, 1, 0, 20170930, 20171210\n");
			calendar.write("2017FallWESun, 0, 0, 0, 0, 0, 0, 1, 20171001, 20171211\n");
			calendar.write("2017FallFinalsWD, 1, 1, 1, 1, 1, 0, 0, 20171211, 20171215\n");
			calendar.write("2017FallISWD, 1, 1, 1, 1, 1, 0, 0, 20171218, 20180104");
			calendar.close();
		}catch(Exception e){
			System.out.println("can not find file");
		}
	}
}
