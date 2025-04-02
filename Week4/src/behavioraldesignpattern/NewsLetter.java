package behavioraldesignpattern;

import java.util.ArrayList;
import java.util.List;

public class NewsLetter implements Subject {
	List<Observer> list=new ArrayList<>();
	

	@Override
	public void subscribe(Observer observer) {
		list.add(observer);
	}

	@Override
	public void unsubscribe(Observer observer) {
		list.remove(observer);
	}

	@Override
	public void notifyObservers(String news) {

	}

}
