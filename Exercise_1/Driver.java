/* Reza Aryadi 1301144179 - IF 38 09 */
import java.util.Scanner;
public class Driver {
 	
 	public static void main(String[] args) {
 		
		AppStore aps = new AppStore();
 		SmartPhone sm = new SmartPhone();
 		sm.setMemory(300);
		System.out.println(sm.toString());
		aps.createNewApp("app1", 100);
 		aps.createNewApp("app2", 200);
 		aps.createNewApp("app3", 300);
 		aps.createNewApp("app4", 400);
 		System.out.println(aps.toString());
 		System.out.println(aps.getApp(1).toString());
		
 		
 		sm.addApplication(aps, 1);
 		System.out.println(sm.toString());
 			
 	}
 }
