package capstoneCS2334;

public class ArrayList<T>
{
	public T[] data;
	private int size;
	private static final int DEFAULT_CAPACITY = 10;

	public ArrayList()
	{
		data = (T[]) new Object[DEFAULT_CAPACITY];
		size = 0;
	}

	public void add(T element)
	{
		checkCapacity();
		data[size] = element;
		size++;
	}

	public T get(int index)
	{
		checkIndex(index);
		return data[index];
	}

	public void remove(int index)
	{
		checkIndex(index);

		for (int i = index; i < size - 1; i++)
		{
			data[i] = data[i + 1];
		}
		data[size - 1] = null;
		size--;
	}

	public int size()
	{
		return size;
	}

	private void checkCapacity()
	{
		if (size == data.length)
		{
			T[] newData = (T[]) new Object[data.length * 2];
			for (int i = 0; i < data.length; i++)
			{
				newData[i] = data[i];
			}
			data = newData;
		}
	}

	private void checkIndex(int index)
	{
		if (index < 0 || index >= size)
		{
			throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
		}
	}

	public void add(int index, T element)
	{
		if (index < 0 || index > size)
		{
			throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
		}

		checkCapacity();

		for (int i = size; i > index; i--)
		{
			data[i] = data[i - 1];
		}

		data[index] = element;
		size++;
	}
}
