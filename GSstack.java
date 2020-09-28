
/**
 * クラス GSstack の注釈をここに書きます.
 * 
 * @author (사사키야스오 2019310566)
 * @version (2020.9.28)
 */
public class GSstack<T>
{
    private int top;
    Object[] s;
    
    public GSstack(){
        top = -1;
        s = new Object[6];
    }
    
    public void push(T data){
        try{
            top += 1;
            s[top] = data;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("더 이상 못들어갑니다.");
        }
    }
    
    public T pop(){
        try{
            T result = (T)s[top];
            top -= 1;
            return result;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("이미 비어 있습니다.");
            return null;
        }
    }

}
