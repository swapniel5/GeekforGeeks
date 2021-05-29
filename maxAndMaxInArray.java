import java.util.*;

public class maxAndMaxInArray {
    public static void main(String[] args) {
        maxAndMaxInArray m = new maxAndMaxInArray();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter test case nos: ");
        int tc = sc.nextInt();
        while (tc != 0) {
            System.out.println("Enter Arrays Size: ");
            int arraySize = sc.nextInt();
            if (arraySize != 0) {
                int array[] = new int[arraySize];
                for (int i = 0; i < arraySize; i++) {
                    array[i] = sc.nextInt();
                }
                m.maxAndMix(array);
            } else {
                System.out.println("Enter Valid arraysize..!!");
            }
            tc--;
        }
        sc.close();
    }

    public void maxAndMix(int array[]) {
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            // System.out.println(array[i]);
        }
        System.out.println("Max:  " + array[array.length - 1] + "  Min: " + array[0]);
    }
}
