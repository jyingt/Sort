package sort;

public class Selection
{
    public static void sort(Comparable[] a) {
        int N = a.length;
        
        for (int ii = 0; ii < N; ii++) {
            int min = ii;
            
            for (int jj = ii + 1; jj < N; jj++)
                if (a[jj].compareTo(a[min]) < 0)
                    swap(a, min, jj);
        }
    }
    
    public static void swap(Comparable[] a, int ii, int jj) {
        Comparable temp = a[ii];
        a[ii] = a[jj];
        a[jj] = temp;
    }
}
