/**
 * Created by thabi on 3/26/2021.
 */
public class SECOND_HOMEWORK
{
    void RepeatingElement(int arr[],int size)
    {
        int i,j;
        System.out.println("Repeating element are: ");
        for ( i = 0; i <size ; i++) {
            for ( j = i+1; j <size ; j++) {
                if (arr[i]==arr[j])
                    System.out.println(arr[i]+"  ");
            }
        }
    }

    public static void main(String[] args) {

         SECOND_HOMEWORK B=new SECOND_HOMEWORK();
         int arr[]={4,2,4,5,2,3,1};
        int arr_size=arr.length;
        B.RepeatingElement(arr,arr_size);
        System.out.println();
        System.out.println("//////////////////////////////////////////////////////");
        int[] A={10,20,30,40,50,60,70,80,90,100};
        System.out.println("Orginal Array:");
        for (int i = 0; i <A.length ; i++)
            System.out.print(A[i]+"  ");
        System.out.println();
        System.out.println("Reverse order for array");
        for (int i = A.length-1; i >=0 ; i--)
            System.out.print(A[i]+"  ");
    }
}
