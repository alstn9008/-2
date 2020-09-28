import java.util.*;
/**
 * Write a description of class MyStack here.
 *
 * @author (2017210105 김민수)
 * @version (20200928)
 */
public class MyStack<T> implements Stack<T>
{
    private int top;
    Object[] stk;

    public MyStack()
    {
        top = 0;
        stk = new Object[20];
    }

    public boolean push(T tok)
    {
        try
        {
            top += 1;
            stk[top] = tok;
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Stack overFlow!");      
            return false;
        }
    }

    public T pop()
    {        
        try
        {
            T result = (T)stk[top];
            top -= 1;
            return result;
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Stack underFlow!");
            return null;
        }
    }
}
