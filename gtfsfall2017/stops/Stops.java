import java.lang.Object.*;
import java.io.PrintWriter;

class Stops{
	public static void main (String args[]){
		//System.out.println("Hello World");
		try{
			PrintWriter stops = new PrintWriter("stops.txt");
			stops.write("stop_id, stop_name, stop_lat,stop_lon\n");
			stops.write("1, Kresge College, 36.999287, -122.064552\n");
			stops.write("2, Kerr Hall, 36.996708, -122.063583\n");
			stops.write("3, Kresge College, 36.999207, -122.064339\n");
			stops.write("4, Science Hill, 36.999973, -122.062332\n");
			stops.write("5, Science Hill, 36.999855, -122.062172\n");
			stops.write("6, College 9 & 10 / Health Ctr, 36.999756, -122.058311\n");

			stops.write("7, College 9 & 10 / Health Ctr, 36.999924, -122.058319\n");
			stops.write("8, Crown and Merrill, 36.999008, -122.055176\n");
			stops.write("9, Bookstore and Cowell College, 36.997498, -122.055061\n");
			stops.write("10, Bookstore and Cowell College, 36.996662, -122.055412\n");
			stops.write("11, East Field House, 36.99424743652344, -122.05551147460938\n");
			stops.write("12, East Remote Lot, 36.991314, -122.054665\n");
			stops.write("14, Farm, 36.985916, -122.053543\n");

			stops.write("15, Farm Inner, 36.985538, -122.053551\n");
			stops.write("16, Lower Campus, 36.981413, -122.051794\n");
			stops.write("17, Lower Campus, 36.981560, -122.052109\n");
			stops.write("18, High and Western Drives, 36.978645, -122.057823\n");
			stops.write("19, Main Entrance, 36.977638, -122.053680\n");
			stops.write("20, Barn Theater, 36.977322, -122.054306\n");
			stops.write("21, High and Western Drives, 36.978813, -122.057732\n");
			
			

			stops.write("23, Arboretum, 36.982777, -122.062706\n");
			stops.write("24, Arboretum, 36.983685, -122.064934\n");
			stops.write("25, Oakes College, 36.990601, -122.066093\n");
			stops.write("26, Oakes College, 36.989944, -122.067200\n");
			stops.write("27, Family Student Housing, 36.991791, -122.066803\n");
			stops.write("28, Rachel Carson and Porter, 36.992996, -122.065201\n");
			stops.write("29, Rachel Carson and Porter, 36.992802, -122.064850\n");

			stops.write("30, East Remote Lot, 36.991380, -122.054673\n");
			stops.write("31, West Remote Lot, 36.988529, -122.064788\n");
			stops.write("32, Recital Hall, 36.99322, -122.06107\n");
			stops.write("33, Media Theater, 36.994937, -122.061458\n");
			stops.write("34, Kerr Hall, 36.996307, -122.061633\n");
			stops.write("35, Thimann Labs, 36.99754, -122.061876\n");
			stops.write("36, McHenry Library, 36.996443, -122.058767\n");

			stops.write("37, Cowell College, 36.997498, -122.053173\n");
			stops.write("38, Crown Merill Apartments, 37.002194, -122.055104\n");
			stops.write("39, Crown College, 37.000447, -122.054693\n");
			stops.write("42, Quarry Plaza, 36.997409, -122.055591\n");
			stops.write("44, Stevenson College, 36.997665, -122.051902\n");
			stops.write("45, East Remote Lot Inner, 36.991264, -122.054947\n");
			stops.write("46, East Remote Lot Interior, 36.990720, -122.052099");
			
			stops.close();
		}catch(Exception e){
			System.out.println("can not find file");
		}
	}
}
