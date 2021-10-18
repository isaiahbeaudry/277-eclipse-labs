
public class Weight {
	void weightCheck(int weight) throws OverWeight {
		if (weight > 150) {
			throw new OverWeight();
		}
	}
}