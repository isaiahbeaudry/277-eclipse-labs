public class Sales
{
	String name;
	String service;
	double amount;
	String date;

	public Sales()
	{
		name = "";
		service = "";
		amount = 0.0;
		date = " ";
	}

	public Sales(String name, String service, double amount, String date)
	{
		this.name = name;
		this.service = service;
		this.amount = amount;
		this.date = date;
	}
	/**
	 * Returns name of Sales
	 * @return name of Sales
	 */
	public String getName()
	{
		return name;
	}
	/**
	 * Returns service of Sales
	 * @return service of Sales
	 */
	public String getService()
	{
		return service;
	}
	/**
	 * Returns amount of Sales
	 * @return amount of Sales
	 */
	public double getAmount()
	{
		return amount;
	}
	/**
	 * Returns date of Sales
	 * @return date of Sales
	 */
	public String getDate()
	{
		return date;
	}
	/**
	 * Returns output of Sales
	 * @return output of Sales
	 */
	public String toString()
	   {
	  return name+":"+service+":"+amount+":"+date;
	   }
}
