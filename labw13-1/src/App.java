public class App {
	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		
		// Create objects for testing
		MamaReport momDisplay = new MamaReport();
		BabaObserv dadDisplay = new BabaObserv();
		
		// Pass the displays
		BabyData babyData = new BabyData(); 
		
		babyData.registerObserver(dadDisplay);
		babyData.registerObserver(momDisplay);
		
		// call this function when data changes
		babyData.update();
	}
}