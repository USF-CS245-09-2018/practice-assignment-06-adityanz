import java.lang.reflect.Array;
import java.util.Objects;

public class ArrayQueue implements Queue{
    // head
    // tail
   // String arr [] = new String[10];
    private Object arr [] = new Object [10];
    private int head = 0;
    private int tail = 0;
    //private int size = 0;

	public void grow_arr()
	{
		Object[] newr = new Object [arr.length*2];
		int count = 0;
		if (tail < head) {
            for (int i = head; i < arr.length; i++) {
                newr[count] = arr[i];
                count++;
            }
        }
            for (int i = 0; i < tail; i++) {
                newr[count] = arr[i];
                count++;
            }

            head = 0;
            tail = count;
            arr = newr;
	}

	public Object dequeue()
	{
//	    if (empty())
//        {
//            throw new IllegalArgumentException("Bad");
//        }
		Object obj = arr[head];
		head = head +1;
		if (head >= arr.length)
		{
			head = 0;
		}
		return obj;

	}

	public void enqueue(Object item)
	{
        if ((tail + 1) % arr.length == head)
		{
			grow_arr();
		}
        arr[tail] = item;
        tail = tail +1;
		if (tail >= arr.length)
		{
			tail = 0;
		}


	}
	public boolean empty()
	{
	    if (head == tail) {
            return true;
        }
        return false;
    }
}
