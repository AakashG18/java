import java.util.Arrays;
import java.util.Collections;
public class sorting{
  static Integer[] arr = { 13, 7, 6, 45, 21, 9, 2, 100 };
  public static void main(String[] args) {
    Arrays.sort(arr, Collections.reverseOrder());
    for (int i = 0; i < arr.length; i++){
      System.out.println(arr[i]);
      }

  }
}
