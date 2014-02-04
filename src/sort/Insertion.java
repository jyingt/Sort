package sort;

/**
 * Insertion sort class
 * @author John Ying
 */
public class Insertion
{
    /**
     * Sort algorithm
     * @param a the array to be sorted
     */
    public static void sort(Comparable[] a) {
        int N = a.length;
        
        for (int ii = 0; ii < N; ii++) {
            for (int jj = ii; jj > 0; jj--) {
                if (a[jj].compareTo(a[jj-1]) < 0)
                    swap(a, jj, jj-1);
                else
                    break;
            }
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
