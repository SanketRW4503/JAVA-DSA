import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {

        int[] arr = { 95, 13, 47 ,52 ,41 ,68 ,42 };

        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int l, int h) {
        // end condition
        if (l >= h) {
            return;
        }

        int s = l;
        int e = h;
        int m=s + (e - s) / 2;
        int pivot = arr[m];

        while (s <e) {

            while (arr[s] <=pivot && s<=h-1) {
                s++;
            }
            while (arr[e] > pivot && e>=l+1) {
                e--;
            }

            if(s<e){
            swap(arr, s, e);
            
            }
        }

                    swap(arr, m, e);

        System.out.println("l: "+l);
        System.out.println("h: "+h);
        System.out.println("pivot :"+pivot);
        System.out.println("s :"+arr[s]);
        System.out.println("e"+arr[e]);
        System.out.println(Arrays.toString(arr));
        int []arr1=Arrays.copyOfRange(arr,l,h+1);
        System.out.println(Arrays.toString(arr1));
        System.out.println("--------------------------");

        quickSort(arr, l, e-1);
        quickSort(arr, s+1, h);

    }

    public static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
}
