public class ArrayStack implements Stack {
// declare constructor
	//top = index of the thing at the top @ -1
    private int top = -1;
	private Object arr [] = new Object [10];
	public void push(Object item)
	{
	    if (top == arr.length-1)
        {
            double_arr_size();
        }
		arr[++top] = item;
	}

	private void double_arr_size()
	{
		Object [] newarr = new Object[arr.length*2];
		for (int i =0; i<arr.length; i++)
		{
			newarr[i] = arr[i];
		}
        arr = newarr;
    }
	public Object pop()
	{
		if (!empty())
		{
			return arr[top--];
		}
        throw new IllegalArgumentException("Bad");

    }
	public Object peek()
	{
		if (!empty())
		{
			return arr[top];
		}
        throw new IllegalArgumentException("Bad");
    }

    public boolean empty() {
        return (top == -1);
    }
}