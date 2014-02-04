package sort;

public class Main
{
    public static void printArray(Comparable[] a) {
        int N = a.length;
        
        for (int ii = 0; ii < N; ii++)
            System.out.print(a[ii] + " ");
        
        System.out.println();
    }
    
    public static void main(String[] args) {
        Integer[] numbers = new Integer[10];
        
        for (int ii = 0; ii < numbers.length; ii++)
            numbers[ii] = (int) (Math.random() * 100.0);
        
        printArray(numbers);
        Selection.sort(numbers);
        printArray(numbers);
    }
}
