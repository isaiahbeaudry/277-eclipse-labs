/**
 * @author Isaiah Beaudry, Chris Maude, Hoanh Nguyen, Rainier Marlone Getuaban
 *
 */
public class LetsEat {

	private DairyQueen DQ;

	public LetsEat(DairyQueen iDQ) {
		this.DQ = iDQ;
	}

	public IceCream orderCone(String type) {
		IceCream cone;

		cone = DQ.getIceCream(type);

		cone.scoop();

		return cone;
	}

	public static void main(String[] args) {
		DairyQueen DQ = new DairyQueen();
		LetsEat eat = new LetsEat(DQ);

		eat.orderCone("Chocolate");
		eat.orderCone("Strawberry");
	}
}
