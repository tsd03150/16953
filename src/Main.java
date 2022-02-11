import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int cnt = 1;

        while (m != 0) {
            if (n == m) {
                break;
            } else if (m % 10 == 1 && m / 10 > 0) {
                cnt++;
                m /= 10;
            } else if (m % 2 == 0) {
                cnt++;
                m /= 2;
            } else {
                cnt = -1;
                break;
            }
        }
        System.out.println(cnt);
    }
}
