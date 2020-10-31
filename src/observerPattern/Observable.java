package observerPattern;

import java.util.ArrayList;
import java.util.List;

public class Observable {
	private List<Observer> observers = new ArrayList<>();
	private int value;
	
	public void addObserver(Observer o)	{
		observers.add(o);
	}
	
	private void notifyObservers()	{
		for (Observer observer : observers) {
			observer.notify(value);
		}
	}
	
	public void changeValue(int value)	{
		this.value = value;
		notifyObservers();
	}
}
