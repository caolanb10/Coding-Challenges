
public class MyArrayList<T> {
	private int size = 0;
	private static final int DEFAULT_COPY = 10;
	private Object elements[];
	private T t;
	
	public MyArrayList()
	{
		elements = new Object[DEFAULT_COPY];
	}
	
	public void add(T a)
	{
		if(size == elements.length)
			resize();
		elements[size++] = a;
	}
	
	public void resize()
	{
		int newSize = size * 2;
		elements = copy(elements, newSize);
	}
	
	public Object[] copy(Object[] a, int size)
	{
		Object[] newA = new Object[size];
		for(int i = 0; i<size; i++)
		{
			newA[i] = a[i];
		}
		return newA;
	}
	
	public T get(int i)
	{
		if(i>=size|| i<0)
			throw new IndexOutOfBoundsException("Index " + i + " is out of bounds");
		return (T) elements[i];
	}
}
