public class QueueObj
{
	private int maxsize;
	private int head;
	private int tail;
	private int nItems;
	private Object [] elements;

	public QueueObj(int maxSize) 
	{
		this.maxsize = maxSize;
		head = 0;
		tail = maxsize-1;
		nItems = 0;
		elements = new Object[maxsize];
	}

	public void enqueue(Object x)
	{
		
		if(isFull()) return;
		
			tail=(tail+1)%maxsize;

		elements[tail] = x;
		nItems++;
	}

	public Object dequeue()
	{
		
		if(isFull()) return null;
		
		Object result = elements[head];
		head=(head+1)%maxsize;

		nItems--;
		return result;
	}

	public Object peek()
	{
		return elements[head];
	}

	public boolean isEmpty()
	{
		return (nItems == 0);
	}

	public boolean isFull()
	{
		return (nItems == maxsize);
	}

	public int size()
	{
		return nItems;
	}

	public void printQueue() {
		if(nItems == 0){
			System.out.println("The queue is empty!");
			return;
		}
		for (int i = 0;i < nItems;i++) {
			System.out.print(elements[(head + i)%maxsize] + "  ");
		}
		System.out.println();
	}
}
