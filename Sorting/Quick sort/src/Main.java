import java.util.Scanner;
public class Main {
    static void display(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    static void swap(int a[], int x, int y) {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }
    static int parition(int a[], int st, int end) {
        int pivot = a[st];// a[0]
        int cnt = 0;
        for (int i = st + 1; i <= end; i++) {
            if (a[i] < pivot)
                cnt++;
        }
        int pivotIdx = st + cnt;
        swap(a, st, pivotIdx);
        int i = st, j = end;
        while (j < pivotIdx && j > pivotIdx) {
            while (a[i] <= pivot)
                i++;
            while (a[j] > pivot)
                j--;
            if (i < pivotIdx && j > pivotIdx) {
                swap(a, i, j);
                i++;
                j--;
            }
        }
        return pivotIdx;
    }
    static void quickSort(int[] arr, int st, int end) {
        if (st >= end) {// 4==4
            return;
        }
        int pi = parition(arr, st, end);
        quickSort(arr, st, pi - 1);
        quickSort(arr, pi + 1, end);
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
        System.out.print("array sorted by quick sort - ");
        quickSort(a,0,a.length-1);
        display(a);

    }
}