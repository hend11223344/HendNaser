import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by thabi on 3/26/2021.
 */
public class THIRD_HOMEWORK
{
    public static <T> void printArray(T[]array)
    {
        for (T el: array)
        {
            System.out.print(el+"  ");
        }
    }
    public static <T> Object[] dmg(T[] a,T[] b)
    {
        return Stream.concat(Arrays.stream(a),Arrays.stream(b)).toArray();
    }
    public static void main(String[] args)
    {
        String[] a=new String[]{"Hend","Mohammed"};
        String[] b=new String[]{"Ahmed","Nasser"};
        Object[] c=dmg(a,b);
        System.out.println(Arrays.toString(c));
        System.out.println("//////////////////////////////////////////////////////");
        String[] names={"Hello", "World"};
        printArray(names);
    }
}
