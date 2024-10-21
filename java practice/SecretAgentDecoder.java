import java.util.Scanner;

public class SecretAgentDecoder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        for (int i = 0; i < n; i++) {
            String str = scanner.nextLine();
            long decodedNumber = decodeString(str);
            System.out.println(decodedNumber);
        }
    }

    private static long decodeString(String str) {
        long decodedNumber = 0;
        int power = str.length() - 1;
        for (char c : str.toCharArray()) {
            decodedNumber += (c - 'A' + 65) * Math.pow(10, power);
            power--;
        }
        return decodedNumber;
    }
}