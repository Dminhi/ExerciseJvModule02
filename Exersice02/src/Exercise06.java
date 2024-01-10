import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice=0;
        while (choice!=4) {
            System.out.println("Mời chọn menu");

            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Mời nhập số cần kiểm tra chẵn lẻ");
                    int number = sc.nextInt();
                    if(number%2==0){
                        System.out.println(number + ": Là số chẵn");
                        break;
                    } else {
                        System.out.println(number + ": Là số lẻ");
                        break;
                    }
                case 2:
                    System.out.println("Mời nhập số cần kiểm tra số nguyên tố");
                    int isPrime = sc.nextInt();
                    boolean check = true;
                    for (int i = 2; i<Math.sqrt(isPrime);i++){
                        if(isPrime%i==0){ check = false;
                            System.out.println(isPrime+": Không à số nguyên tố");

                            break;}
                        if(check){
                            System.out.println(isPrime+": Là số nguyên tố");
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Mời nhập số cần kiểm tra xem có chia hết cho 3 không");
                    int Number = sc.nextInt();
                    if(Number%3==0){
                        System.out.println(Number + ": chia hết cho 3 ");
                        break;
                    } else {
                        System.out.println(Number + ": không chia hết cho 3 ");
                    }
                    break;

            }
            System.out.println("Đã thoát chương trình");
        }

    }
}
