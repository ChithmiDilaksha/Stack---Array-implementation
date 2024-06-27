public class StackApp
{
    public static void main(String[] args)
    {
        Stack s1=new Stack(5);
        s1.push(78);
        s1.push(8);
        s1.peek();
        s1.pop();
        s1.peek();
        s1.push(45);
        s1.peek();
        s1.pop();
        s1.push(23);
        s1.push(34);
        s1.peek();
        s1.pop();
        s1.pop();
        s1.peek();

        s1.pop();

        // size is fix
    }

}
