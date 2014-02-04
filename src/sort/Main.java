package sort;

/**
 * Test block
 * @author John Ying
 */
public class Main
{
    /**
     * Print contents of array
     * @param a
     */
    public static void printArray(Comparable[] a) {
        int N = a.length;
        
        for (int ii = 0; ii < N; ii++)
            System.out.print(a[ii] + " ");
        
        System.out.println();
    }
    
    /**
     * Unit test
     * @param args
     */
    public static void main(String[] args) {
        Integer[] numbers = new Integer[20];
        
        for (int ii = 0; ii < numbers.length; ii++)
            numbers[ii] = (int) (Math.random() * 100.0);
        
        printArray(numbers);
        //Selection.sort(numbers);
        //Insertion.sort(numbers);
        Bubble.sort(numbers);
        printArray(numbers);
    }
}
