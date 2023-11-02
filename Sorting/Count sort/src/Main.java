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
    static void basiccountSort(int a[]) {
        int max=findmax(a);
        int []count =new int[max+1];
        for (int i = 0; i <a.length ; i++) {
            count[a[i]]++;
        }
        int k=0;
        for (int i = 0; i < count.length ; i++) {
            for (int j = 0; j <count[i] ; j++) {
                a[k++]=i;
            }
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
        System.out.print("original array - ");
        display(a);
        basiccountSort(a);
        System.out.print("sorted array with merge sort - ");
        display(a);
        }
    }
