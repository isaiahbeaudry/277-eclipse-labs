// Implemented by Baby Data
public interface Subject {
	public void registerObserver(Observer o);
	public void unregister(Observer o);
	public void notifys();
}
