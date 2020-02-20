import java.util.Random;
import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        byte[][] C;
        int numberArr, sizeArr, sumEven = 0, sumOdd = 0;
        //
        getVariantNumb(5, 7, 11);
        // 
        System.out.print("Input number of the arrays: ");
        numberArr = scanner.nextInt();
        System.out.print("Input size of the each array: ");
        sizeArr = scanner.nextInt();
        //
        if (numberArr > 0) {
            C = makeRandomArr(sizeArr);
            //
            for (int i = 2; i <= numberArr; i++) {
                byte[][] arr = makeRandomArr(sizeArr);
//                printArr(arr);
                for (int j = 0; j < sizeArr; j++) {
                    for (int k = 0; k < sizeArr; k++) C[j][k] ^= arr[j][k];
                }
            }
            System.out.print("C = "); printArr(C);
            //
            for (int column = 0; column < sizeArr; column++) {
                byte max = C[0][column];
                for (int row = 0; row < sizeArr; row++) {
                    if (C[row][column] > max) max = C[row][column];
                }
                if (column % 2 == 1) sumEven += max;
                else sumOdd += max;
            }
            //
            System.out.println("Sum in even columns = "+sumEven);
            System.out.println("Sum in odd columns = "+sumOdd);
        }
        else System.out.println("The number of arrays is invalid!");
    }

    public static void printArr(byte[][] arr){
        System.out.println("{");
        for (byte[] arr_i: arr) {
            for (byte el_i: arr_i) {
                System.out.print(el_i+" ");
            }
            System.out.println();
        }
        System.out.println("}");
    }

    public static byte[][] makeRandomArr(int sizeArr){
        byte[][] arr = new byte[sizeArr][sizeArr];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) random.nextBytes(arr[i]);
        return arr;
    }

    public static void getVariantNumb(int ... args){
        final int NumbInGroup = 9213;
        for (int numb:args) {
            System.out.println("C"+numb+" = "+NumbInGroup % numb);
        }
    }
}
