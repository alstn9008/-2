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
        if(top == 20)
            return ;
        stk[top] = tok;
        tok ++;
    }
    
    public T pop()
    {
        T result = (T)stk[top];
        top -= 1;
        return result;
        try
        {
            (T)stk[-1];
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Stack underFlow!");
            return null;
        }
    }
}
