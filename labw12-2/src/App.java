public class App {
	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		
		// Create objects for testing
		MamaReport momDisplay = new MamaReport();
		BabaReport dadDisplay = new BabaReport();
		DoctorReport docDisplay = new DoctorReport();
		SiblingReport sibDisplay = new SiblingReport();
		
		// Pass the displays
		BabyMonitor babyData = new BabyMonitor(dadDisplay, momDisplay, docDisplay, sibDisplay); 
		
		// call this function when data changes
		babyData.dataChanged();
	}
}