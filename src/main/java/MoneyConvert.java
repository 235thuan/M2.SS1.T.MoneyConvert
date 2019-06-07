import java.util.Scanner;
public class MoneyConvert {
    public static void main(String[] args) {
    double rate = 23000;
    double USD,VND;
        System.out.println("Input number of USD: ");
        Scanner scanner = new Scanner(System.in);
        USD=scanner.nextDouble();
        VND=USD*rate;
        System.out.printf("%-10s%s","USD","VND\n");
        System.out.printf("%-10s%s",USD,VND);
    }
}
