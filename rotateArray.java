import java.util.*;

class rotateArray {
  void leftRotate(int arr[], int d, int n) {
    d = d % n;
    int i, j, k, temp;
    int g_c_d = gcd(d, n);
    for (i = 0; i < g_c_d; i++) {
      temp = arr[i];
      j = i;
      while (true) {
        k = j + d;
        if (k >= n)
          k = k - n;
        if (k == i)
          break;
        arr[j] = arr[k];
        j = k;
      }
      arr[j] = temp;
    }
  }

  void printArray(int arr[], int size) {
    int i;
    for (i = 0; i < size; i++)
      System.out.print(arr[i] + " ");
  }

  int gcd(int a, int b) {
    if (b == 0)
      return a;
    else
      return gcd(b, a % b);
  }

  public static void main(String[] args) {
    rotateArray rotate = new rotateArray();
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Test cases nos. you want: ");
    int tc = sc.nextInt();
    int arrayData[] = new int[2];

    while (tc != 0) {
      System.out.print("Enter Array Size and number to shift array : ");
      for (int j = 0; j < 2; j++) {
        arrayData[j] = sc.nextInt();
      }
      int array[] = new int[arrayData[0]];
      System.out.print("Enter " + arrayData[0] + " Array Element: ");
      for (int i = 0; i < array.length; i++) {
        array[i] = sc.nextInt();
      }

      rotate.leftRotate(array, arrayData[1], array.length);
      rotate.printArray(array, array.length);
      System.out.println();
      tc--;
    }
    sc.close();
  }
}