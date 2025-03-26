/* Made by Miroshnichenko Daniel
           26/03/2005           */
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите выражение: ");
        String in = sc.nextLine();
        try {
            String answer = calc(in);
            System.out.println(answer);
        } catch (Exception e) {
            System.out.println("Ошибка");
        }
    }

    public static String calc(String input) throws Exception {
        String[] split = input.split(" ");
        if (split.length != 3) {
            throw new Exception();
        }

        String aSt = split[0];
        String op = split[1];
        String bSt = split[2];

        int a, b;
        try {
            a = Integer.parseInt(aSt);
            b = Integer.parseInt(bSt);
        } catch (NumberFormatException e) {
            throw new Exception();
        }

        if (a < 1 || a > 10 || b < 1 || b > 10) {
            throw new Exception();
        }

        int answer;
        if (op.equals("+")) {
            answer = a + b;
        } else if (op.equals("-")) {
            answer = a - b;
        } else if (op.equals("*")) {
            answer = a * b;
        } else if (op.equals("/")) {
            if (b == 0) throw new Exception();
            answer = a / b;
        } else {
            throw new Exception();
        }

        return String.valueOf(answer);
    }
}