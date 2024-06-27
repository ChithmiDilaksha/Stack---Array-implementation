public class Stack
{
    //....array implementation....
    public int size;
    public int arr[];
    public int top;
    private int[] isEmpty;

    public Stack(int size)

    {
        this.size=size;
        arr=new int[size];  // New array ekak create kirima // stack eka create kirima
        top=-1;// stack eka hadana kotama top el -1 we.


    }
    public boolean isEmpty()
    {
        return  top==-1;

       /* if (top==-1)
        {
            return false;

        }
        else
        {

            return false;

        }*/
    }
    public boolean isFull()
    {
        return top == size-1;
    }

    public void push(int data)
    {
        if (isFull())
        {
            System.out.println("Stack overflow!");
            return;

        }
        /*top++;
        arr[top]=data;*/
        arr[++top]=data;
        System.out.println(data+"inserted");

    }

    public void pop()
    {
        if (isEmpty())
        {
            System.out.println("Stack Empty/ underflow!");
            return;

        }
        System.out.println(arr[top]+"Remove");
        top--;

    }
    public void peek()
    {

        System.out.println(arr[top]+"is in peek");


    }

}
