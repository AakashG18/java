import java.util.Arrays;
import java.util.Collections;
public class sorting{
  static int[] a = { 13, 7, 6, 45, 21, 9, 2, 100,100 };
   static int n = a.length;
  public static void main(String[] args) {
    Arrays.sort(a);  
    n = removeduplicates(a, n);
    for (int i = 0; i <n; i++){
      System.out.println(a[i]);
      }
    }
    public static int removeduplicates(int a[], int n)
    {
        if (n == 0 || n == 1) {
            return n;
        }

        // creating another array for only storing
        // the unique elements
        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                temp[j++] = a[i];
            }
        }

        temp[j++] = a[n - 1];

        // Changing the original array
        for (int i = 0; i < j; i++) {
            a[i] = temp[i];
        }

        return j;
    }
}
