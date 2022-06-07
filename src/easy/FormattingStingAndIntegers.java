package easy;
import java.util.Scanner;

public class FormattingStingAndIntegers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            String paddedString = String.format("%-15s", s1);
            String paddedInt = String.format("%03d", x);
            System.out.println(paddedString + paddedInt);
        }
        System.out.println("================================");

    }

}
