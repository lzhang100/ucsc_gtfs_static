import java.lang.Object.*;
import java.io.PrintWriter;

class Routes{
	public static void main (String args[]){
		//System.out.println("Hello World");
		try{
			PrintWriter routes = new PrintWriter("routes.txt");
			routes.write("route_id, route_short_name, route_long_name, route_type\n");
			routes.write("R1, Loop, Campus Loop Route, 3\n");
			routes.write("R2, UC, UpperCampus, 3\n");
			routes.write("R3, ENC, East Night Core, 3\n");
			routes.write("R4, WNC, West Night Core, 3\n");
			routes.close();
		}catch(Exception e){
			System.out.println("can not find file");
		}
	}
}
