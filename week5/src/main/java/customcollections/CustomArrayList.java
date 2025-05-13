package customcollections;

public class CustomArrayList<T> {

	@SuppressWarnings("unchecked")
	T[] data = (T[]) new Object[5];
	private int insertPointer = 0;

	// to add the element
	public boolean addElement(T item) {
		if (insertPointer == data.length) {
			increaseSize();
		}
		data[insertPointer++] = item;
		return true;
	}

	// to return the size of the list
	public int size() {
		return insertPointer;
	}

	// get element at
	public T getElementAt(int index) {
		if (index < insertPointer && index >= 0)
			return data[index];
		else
			throw new IllegalArgumentException("index value is not valid");
	}

	// set element at
	public T setElementAt(int index, T t) {
		T element;
		if (index >= 0 && index < insertPointer) {
			element = data[index];
			data[index] = t;
		} else {
			throw new IllegalArgumentException("index is not valid");
		}
		return element;
	}

	// to check is empty
	public boolean isEmpty() {
		return insertPointer == 0;
	}

	// contains menthod
	public boolean contains(T t) {
		for (int i = 0; i < insertPointer; i++) {
			if (t.equals(data[i])) {
				return true;
			}
		}
		return false;
	}

	// index of the element
	public int indexOf(T t) {
		for (int i = 0; i < insertPointer; i++) {
			if (t.equals(data[i])) {
				return i;
			}
		}
		return -1;
	}

	// clear
	@SuppressWarnings("unchecked")
	public void clear() {
		data = (T[]) new Object[5];
	}

	// for printing the list;
	@Override
	public String toString() {
		String s = "{ ";
		for (int i = 0; i < insertPointer; i++) {
			s = s + data[i].toString() + ", ";
		}
		s = s.substring(0, s.length() - 2);
		s = s + " }";
		return s.trim();
	}

	//removing using object
	public void remove(T t) {
		int index = indexOf(t);

		if (index >= 0) {

			for (int i = index; i < insertPointer - 1; i++) {
				data[i] = data[i + 1];
			}

			data[insertPointer - 1] = null;
			insertPointer--;
		} else {
			throw new IllegalArgumentException("element not found");
		}
	}

	// remove at index
	public void removeAtIndex(int index) {
		if (index >= 0 && index < insertPointer) {

			for (int i = index; i < insertPointer - 1; i++) {
				data[i] = data[i + 1];
			}

			data[insertPointer - 1] = null;
			insertPointer--;
		} else {
			throw new IllegalArgumentException("invalid index");
		}
	}

	// auto grow
	private void increaseSize() {
		int newLength = data.length * 2;

		@SuppressWarnings("unchecked")
		T[] t = (T[]) new Object[newLength];

		for (int i = 0; i < data.length; i++) {
			t[i] = data[i];
		}

		insertPointer = data.length;
		data = t;

	}
}
