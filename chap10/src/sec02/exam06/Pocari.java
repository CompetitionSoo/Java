package sec02.exam06;

import java.io.IOException;

public class Pocari {
	static void drink() {
		try {
		System.in.read();
	
		} catch(Exception e){
		System.out.println(e);}
	
	static void drink() throws IOException{
		System.in.read();
	}
		
}
	public static void main(String[] args) {
		drink();
    }
}




/*		try {
String name = null;
name.isEmpty();
} catch (NullPointerException e) {
System.out.println(e);
} 
*/