import java.util.*;

class Main {
  public static void main(String[] args) {
    Main m = new Main();
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Test cases nos. you want: ");
    int tc = sc.nextInt();
    int arrayData[] = new int[2];
    // int sizeOfArray = sc.nextInt();
    // int rotateArray = sc.nextInt();

    while (tc != 0) {
      // int array[] = new int[sizeOfArray];
      System.out.print("Enter Array Size and number to shift array : ");
      for (int j = 0; j < 2; j++) {
        arrayData[j] = sc.nextInt();
      }
      int array[] = new int[arrayData[0]];
      System.out.print("Enter "+ arrayData[0]+" Array Element: ");
      for (int i = 0; i < array.length; i++) {
        array[i] = sc.nextInt();
      }
      m.rotateArray(array, arrayData[1]);
      for (int i = 0; i < array.length; i++) {
        System.out.print(array[i] + " ");
      }
      System.out.println();
    tc--;
    }
    
    sc.close();
  }

  void rotateArray(int[] array, int shift) {
    int firstEle, j;
    for (int i = 0; i < shift; i++) {
      firstEle = array[0];
      for (j = 0; j < array.length-1; j++) {
        array[j] = array[j + 1];
      }
    array[array.length-1] = firstEle;
    }
  }
}