package sort;

/**
 * Selection sort class
 * @author John Ying
 */
public class Selection
{
    /**
     * Sort algorithm
     * @param a the array to be sorted
     */
    public static void sort(Comparable[] a) {
        int N = a.length;
        
        for (int ii = 0; ii < N; ii++) {
            int min = ii;
            
            for (int jj = ii+1; jj < N; jj++)
                if (a[jj].compareTo(a[min]) < 0)
                    swap(a, min, jj);
        }
    }
    
    /**
     * Swap items of array
     * @param a the arraw
     * @param ii the index of first item
     * @param jj the index of second item
     */
    private static void swap(Comparable[] a, int ii, int jj) {
        Comparable temp = a[ii];
        a[ii] = a[jj];
        a[jj] = temp;
    }
}
