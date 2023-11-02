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
    static void merge(int arr[],int l,int mid,int r)
    {
        int n1=mid-l+1;
        int n2=r-mid;
        int []left=new int[n1];
        int []right=new int[n2];

        int i,j,k;
        for( i=0;i<n1;i++)
        {
            left[i]=arr[l+i];
        }
        for( j=0;j<n2;j++)
        {
            right[j]=arr[mid+1+j];
        }
        i=0;
        j=0;
        k=l;

        while(i<n1 && j<n2)
        {
            if(left[i] < right[j])
            {
                arr[k++]=left[i++];
            }
            else
            {
                arr[k++]=right[j++];
            }
        }
        while (i<n1)
        {
            arr[k++]=left[i++];
        }
        while (i<n2)
        {
            arr[k++]=right[j++];
        }
    }
    static void mergeSort(int arr[],int l,int r)
    {
        if(l>=r)
        {
            return;
        }
        int mid=(l+r)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
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
        mergeSort(a,0,n-1);
        System.out.print("sorted array with merge sort - ");
        display(a);
    }
}