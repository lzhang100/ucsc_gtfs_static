import java.lang.Object.*;
import java.io.PrintWriter;

//Open the file routes.txt, write to the file, and close it.
class Routes{
	public static void main (String args[]){
		try{
			PrintWriter routes = new PrintWriter("routes.txt");
			routes.write("route_id, route_short_name, route_long_name, route_type\n");
			routes.write("R1, LoopO, Campus Loop Outer Route, 3\n");
			routes.write("R2, LoopIn, Campus Loop Inner Route, 3\n");
			routes.write("R3, InUC, Upper Campus Inner Route, 3\n");
			routes.write("R4, OutUC,Upper Campus Outer Route, 3\n");
			routes.write("R5, ENC, East Night Core Route, 3\n");
			routes.write("R6, WNC, West Night Core Route, 3\n");
			routes.close();
		}catch(Exception e){
			System.out.println("can not find file");
		}
	}
}
