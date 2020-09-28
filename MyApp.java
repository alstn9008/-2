
/**
 * クラス MyApp の注釈をここに書きます.
 * 
 * @author (사사키야스오 2019315066)
 * @version (2020.9.28)
 */
public class MyApp
{
    public static void main(String[] main){
        MyStack<Integer> stringStack = new MyStack<Integer>();
        
        System.out.println("------ Push ------");
        stringStack.push(2020);
        stringStack.push(9);
        stringStack.push(28);
        
        System.out.println("------ Pop ------");
        
        for(int n=0 ; n<4 ; n++){
            System.out.println(stringStack.pop());
        }
        
    }
}
