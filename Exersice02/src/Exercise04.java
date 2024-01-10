import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời điền số số nguyên tố cần in");
        int Number = sc.nextInt();
        int Count = 0;
        int n = 1;

        while (Count < Number) {
            n++;
            boolean check = true;
            for (int j = 2; j <= Math.sqrt(n); j++) {
                if (n % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.print(n + ", ");
                Count++;
            }
        }
    }
}

