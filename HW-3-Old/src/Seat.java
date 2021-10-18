/**
 * Remember that we can't have any print or printstreams statements in any of our classes except for the tester
 * The print statements that you see in this class is just me trying to see what's happening inside the function
 * We can remove those statements once we have fixed the method
 * This class needs a lot of help!! It's suppose of take the seatType and class type and assign a seat
 * I started working on how to find the window seat in either class, but that method is not really working, at all, like the 
 * way I excepted it to work
 * You guys can totally just scrap the findWindow() and start over with that, maybe keeping the params that it takes in!
 * We will also need findCenter(), findAisle()
 * Need to work on fixing/finishing up the findWindow() and assignSeat()
 * all methods should return the arraylist that it takes in, i've just named it rowList
 */
import java.util.*;

public class Seat {
	
	private String seatType;
	
	
	public Seat() {
		this.seatType = "";
	}
	
	public Seat(String Type) {
		this.seatType = Type;
	}
	
	public String getType() {
		return seatType;
	}
	
	boolean windowFound = false;
	public void findWindow(ArrayList<ArrayList<String>> rowList) {
		System.out.println(rowList);
		//do {
			for (int counter = 0; counter < rowList.size(); counter++) {
				
				//do {
					if(rowList.get(counter).get(0).equals(".")){
						while(!windowFound) {
							System.out.println("Counter = " + counter);
							System.out.println("List zero = " + rowList.get(counter).get(0));
							windowFound = true;
						}
						rowList.get(counter).set(0, "*");
					}
					else if (rowList.get(counter).get(rowList.get(counter).size() - 1).equals(".")) {
						while(!windowFound) {
							windowFound = true;
							rowList.get(counter).set(rowList.get(counter).size() - 1, "*");
						}
					}
				//} while(!windowFound);
			}
		//} while(!windowFound);	
	}
	
	public ArrayList<ArrayList<String>> assignSeat(ArrayList<ArrayList<String>> rowsList, String type) {
		if (seatType.equals("w")) { //also checked in tester
			findWindow(rowsList);
		}
		return rowsList;
	}

}
