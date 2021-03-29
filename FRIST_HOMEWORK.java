/**
 * Created by thabi on 2/17/2021.
 */
public class FRIST_HOMEWORK
{
    int h[]={2,4,6,8,0,1,3,5,7,9};
    public void revers()
    {
        int x=h.length-1;
        for(int i=0;i<h.length/2;i++)
        {
            int a=h[i];
            h[i]=h[x];
            h[x]=a;
            x--;
        }
    }
    public void print()
    {
        System.out.print("[");
        for (int i=0;i<h.length;i++)
        {
            if (i==h.length-1)
                System.out.print(h[i]);
            else
                System.out.print(h[i]+",");
        }
        System.out.println("]");
    }
    public void backupArray()
    {
         int copyArray[]=new int [h.length];
        for (int i=0; i<h.length;i++)
            copyArray[i]=h[i];
        copyArray[0]++;
        System.out.print("[");
        for (int i=0; i<h.length; i++)
        {
            System.out.print(h[i]+",");
        }
        System.out.println("]");
        h[0]=h[0];
        System.out.print("[");
        for (int i=0; i<h.length;i++)
        {
            System.out.print(h[i]+",");
        }
        System.out.println("]");
    }
    public void removing (int [] a, int index )
    {
            if (index>=0 && index <a.length)
            {
                 int i= index;
                while (i<a.length-1)
                {
                    a[i]=a[i+1];
                    i++;
                }
                a[i]=0;
            }
    }
    public static void main(String[]args)
    {
        FRIST_HOMEWORK b=new FRIST_HOMEWORK();
         System.out.print("The original array:   ");
        b.print();
        System.out.print("The inverted array:   ");
        b.revers();
        b.print();
        b.revers();
        System.out.print("The backup array:     ");
        b.backupArray();
    }
}

