import java.util.Scanner;
public class Main {
    static void printArray(int a[])
    {
        for (int i = 0; i < a.length ; i++) {
            System.out.print(a[i]+" ");
        }
    }
    static void bubblesort(int a[])
    {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp;
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
    static void selectionsort(int a2[])
    {
        for (int i = 0; i < a2.length; i++) {
            int min = i;
            for (int j = i + 1; j < a2.length; j++) {
                if (a2[j] < a2[min]) {
                    min = j;
                }
            }
            int temp;
            temp = a2[i];
            a2[i] = a2[min];
            a2[min] = temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of an array - ");
        int size=sc.nextInt();
        System.out.print("enter array - ");
        int a[]=new int[size];
        for (int i = 0; i < a.length ; i++) {
            a[i]= sc.nextInt();
        }
        System.out.print("enter 1 for bubble sort and 2 for selection sort - ");
        int x324 = sc.nextInt();
        switch (x324) {
            case 1: //bubble sort:
                bubblesort(a);
                printArray(a);
                break;

            case 2: // Selection sort
                selectionsort(a);
                printArray(a);
                break;
        }
    }

}