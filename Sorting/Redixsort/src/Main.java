import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static void display(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    static int findmax(int a[]) {
        int max=Integer.MIN_VALUE;
        for (int i = 0; i <a.length ; i++) {
            if(a[i]>max) {
                max=a[i];
            }
        }return max;
    }
    public static void countsort(int a[],int place)
    {
        int n=a.length;
        int output[]=new int[n];
        int max=findmax(a); // find largest element
        int []count= new int[10];
        // frequency
        for (int i = 0; i < a.length; i++) {
            count[a[i] / place % 10]++;
        }
        // make prefix sum of the count array
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }
        // indexing
        for (int i = n - 1; i >= 0; i--) {
            int idx = count[a[i] / place % 10] - 1;
            output[idx] = a[i];
            count[a[i] / place % 10]--;
        }
        // copy all the elements of output of array
        for (int i = 0; i < n; i++) {
            a[i] = output[i];
        }
    }
    public static void radixsort(int a[]) {
        int max = findmax(a);// want to get maximum elemeny
        // apply counting sort to to sort the element based on places
        for (int place = 1; max / place > 0; place *= 10) {
            countsort(a, place);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array - ");
        int size= sc.nextInt();
        System.out.print("enter the array - ");
        int a[]=new int[size];
        for (int i = 0; i <a.length ; i++) {
            a[i]= sc.nextInt();
        }
        int n=a.length;

        System.out.print("original array - ");
        display(a);
        radixsort(a);
        System.out.print("sorted array with merge sort - ");
        display(a);
    }
}