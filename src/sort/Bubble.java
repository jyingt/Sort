package sort;

/**
 * Bubble sort class
 * @author John Ying
 */
public class Bubble
{
    /**
     * Sort algorithm
     * @param a the array to be sorted
     */
    public static void sort(Comparable[] a) {
        int N = a.length;
        
        for (int ii = N-1; ii > 0; ii--)
            for (int jj = 0; jj < ii; jj++)
                if (a[jj].compareTo(a[jj+1]) > 0)
                    swap(a, jj, jj+1);
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
