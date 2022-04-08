import java.util.Scanner;

public class PthBit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // get the bit at position p of number n
        int n = Integer.parseInt(scanner.nextLine());
        int p = Integer.parseInt(scanner.nextLine());;

        int bitAtPositionP = (n >> p) & 1; // formula

        System.out.println(bitAtPositionP);
    }
}

//   Operator| | - | - | - | | & - & - & - & | ^ - ^ - ^ - ^ |
//   Operand1| 0 | 0 | 1 | 1 | 0 | 0 | 1 | 1 | 0 | 0 | 1 | 1 |
//   Operand2| 0 | 1 | 0 | 1 | 0 | 1 | 0 | 1 | 0 | 1 | 0 | 1 |
//   Result  | 0 | 1 | 1 | 1 | 0 | 0 | 0 | 1 | 0 | 1 | 1 | 0 |