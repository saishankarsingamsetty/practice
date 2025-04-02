package behavioraldesignpattern;

public class NameCollection implements IterableCollection {
	
	private String[] names= {"a","b","c","d","e","f"};

	@Override
	public Iterator getIterator() {
		return new CollectionIterator();
	}
	
	private class CollectionIterator implements Iterator{

		int index=0;
		
		@Override
		public boolean hasNext() {
			return index<names.length;
		}

		@Override
		public Object next() {
			if(this.hasNext()) {
				return names[index++];
			}
			return null;
		}
		
	}

}
