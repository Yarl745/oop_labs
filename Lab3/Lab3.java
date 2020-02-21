import java.util.Scanner;
public class Lab3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startPoint = 0, spaceIndex;

        getVariantNumb(3, 17);

        System.out.print("Input text: ");
        StringBuilder text = new StringBuilder(scanner.nextLine()+" ");

        spaceIndex = text.indexOf(" ", startPoint);
        while (spaceIndex != -1){
            text.deleteCharAt(spaceIndex - 1);
            startPoint = spaceIndex;
            spaceIndex = text.indexOf(" ", startPoint);
        }

        System.out.println("Output: "+text);
    }

    public static void getVariantNumb(int ... args){
        final int NumbInGroup = 9213;
        for (int numb:args) {
            System.out.println("C"+numb+" = "+NumbInGroup % numb);
        }
    }
}
