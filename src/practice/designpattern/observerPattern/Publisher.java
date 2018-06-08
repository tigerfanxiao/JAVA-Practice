package practice.designpattern.observerPattern;


public interface Publisher {
	
	public abstract void registerObserver(MyObserver observer);
	public abstract void removeObserver(MyObserver observer);
	public abstract void notifyObservers();
}
