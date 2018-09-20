import java.lang.Object.*;
import java.io.PrintWriter;

class Stops{
	public static void main (String args[]){
		//System.out.println("Hello World");
		try{
			PrintWriter stops = new PrintWriter("stops.txt");
			stops.write("stop_id, stop_name, stop_lat,stop_lon\n");
			stops.write("1, UCSC Kresge College Outer, 36.999287, -122.064552\n");
			stops.write("2, UCSC Kerr Hall, 36.996708, -122.063583\n");
			stops.write("3, UCSC Kresge College Inner, 36.999207, -122.064339\n");
			stops.write("4, UCSC Science Hill Outer, 36.999973, -122.062332\n");
			stops.write("5, UCSC Science Hill Inner, 36.999855, -122.062172\n");
			stops.write("6, UCSC College 9 & 10 / Health Ctr Inner, 36.999756, -122.058311\n");

			stops.write("7, UCSC College 9 & 10 / Health Ctr Outer, 36.999924, -122.058319\n");
			stops.write("8, UCSC Crown and Merrill, 36.999008, -122.055176\n");
			stops.write("9, UCSC Bookstore and Cowell College Outer, 36.997498, -122.055061\n");
			stops.write("10, UCSC Bookstore and Cowell College Inner, 36.996662, -122.055412\n");
			stops.write("11, UCSC East Field House, 36.99424743652344, -122.05551147460938\n");
			stops.write("12, UCSC East Remote Lot Outer, 36.991314, -122.054665\n");
			stops.write("14, UCSC Farm Outer, 36.985916, -122.053543\n");

			stops.write("15, UCSC Farm Inner, 36.985538, -122.053551\n");
			stops.write("16, UCSC Lower Campus Outer, 36.981413, -122.051794\n");
			stops.write("17, UCSC Lower Campus Inner, 36.981560, -122.052109\n");
			stops.write("18, High and Western Drives Outer, 36.978645, -122.057823\n");
			stops.write("19, UCSC Main Entrance, 36.977638, -122.053680\n");
			stops.write("20, UCSC Barn Theater, 36.977322, -122.054306\n");
			stops.write("21, High and Western Drives Inner, 36.978813, -122.057732\n");
			
			

			stops.write("23, UCSC Arboretum Inner, 36.982777, -122.062706\n");
			stops.write("24, UCSC Arboretum Outer, 36.983685, -122.064934\n");
			stops.write("25, UCSC Oakes College Inner, 36.990601, -122.066093\n");
			stops.write("26, UCSC Oakes College Outer, 36.989944, -122.067200\n");
			stops.write("27, UCSC Family Student Housing, 36.991791, -122.066803\n");
			stops.write("28, UCSC Rachel Carson and Porter Outer, 36.992996, -122.065201\n");
			stops.write("29, UCSC Rachel Carson and Porter Inner, 36.992802, -122.064850\n");

			stops.write("30, UCSC East Remote Lot Outer, 36.991380, -122.054673\n");
			stops.write("31, UCSC West Remote Lot, 36.988529, -122.064788\n");
			stops.write("32, UCSC Recital Hall, 36.99322, -122.06107\n");
			stops.write("33, UCSC Media Theater, 36.994937, -122.061458\n");
			stops.write("34, UCSC Kerr Hall, 36.996307, -122.061633\n");
			stops.write("35, UCSC Thimann Labs, 36.99754, -122.061876\n");
			stops.write("36, UCSC McHenry Library, 36.996443, -122.058767\n");

			stops.write("37, UCSC Cowell College, 36.997498, -122.053173\n");
			stops.write("38, UCSC Crown Merill Apartments, 37.002194, -122.055104\n");
			stops.write("39, Crown College, 37.000447, -122.054693\n");
			stops.write("42, UCSC Quarry Plaza, 36.997409, -122.055591\n");
			stops.write("44, UCSC Stevenson College, 36.996717, -122.052084\n");
			stops.write("45, UCSC East Remote Lot Inner, 36.991264, -122.054947\n");
			stops.write("46, UCSC East Remote Lot Interior, 36.990720, -122.052099");
			
			stops.close();
		}catch(Exception e){
			System.out.println("can not find file");
		}
	}
}
