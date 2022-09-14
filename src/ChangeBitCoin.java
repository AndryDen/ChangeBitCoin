import java.util.Scanner;

public class ChangeBitCoin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is Bitcoin price today?");
        double bitcoinPrice = scanner.nextInt();
        System.out.println("How much $ do you have?");
        double howMachDollrsDoYouHave = scanner.nextInt();
        double youCanBuy = howMachDollrsDoYouHave / bitcoinPrice;
        System.out.println("You can buy: " + youCanBuy + "  BTC");


    }
}
