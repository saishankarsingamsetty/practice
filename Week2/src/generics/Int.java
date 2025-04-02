package generics;

public class Int<T> {
	private T t;
	public void set(T t) {
		this.t=t;
	}
	
	public T get() {
		return t;
	}
}
