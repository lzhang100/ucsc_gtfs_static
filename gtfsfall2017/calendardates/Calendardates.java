import java.lang.Object.*;
import java.io.PrintWriter;

class Calendardates{
	public static void main (String args[]){
		//System.out.println("Hello World");
		try{
			PrintWriter calendardates = new PrintWriter("calendar_dates.txt");
			calendardates.write("service_id,date,exception_type\n");
			calendardates.write("2017FallWDFriday, 20171110, 2\n");
			calendardates.write("2017FallWDMonThur, 20171123, 2\n");
			calendardates.write("2017FallWDFriday, 20171124, 2\n");
			calendardates.write("2017FallISWD, 20171215, 2\n");
			calendardates.write("2017FallISWD, 20171216, 2\n");
			calendardates.write("2017FallISWD, 20171217, 2\n");
			calendardates.write("2017FallISWD, 20171218, 2\n");
			calendardates.write("2017FallISWD, 20171219, 2\n");
			calendardates.write("2017FallISWD, 20171220, 2\n");
			calendardates.write("2017FallISWD, 20171221, 2\n");
			calendardates.write("2017FallISWD, 20171222, 2\n");
			calendardates.write("2017FallISWD, 20171223, 2\n");
			calendardates.write("2017FallISWD, 20171224, 2\n");
			calendardates.write("2017FallISWD, 20171225, 2\n");
			calendardates.write("2017FallISWD, 20171226, 2\n");
			calendardates.write("2017FallISWD, 20171227, 2\n");
			calendardates.write("2017FallISWD, 20171228, 2\n");
			calendardates.write("2017FallISWD, 20171229, 2\n");
			calendardates.write("2017FallISWD, 20171230, 2\n");
			calendardates.write("2017FallISWD, 20171231, 2\n");
			calendardates.write("2017FallISWD, 20180101, 2\n");
			calendardates.write("2017FallISWD, 20180102, 2\n");
			calendardates.close();
		}catch(Exception e){
			System.out.println("can not find file");
		}
	}
}
