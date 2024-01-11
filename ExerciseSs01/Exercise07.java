import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập số");
        int Number = sc.nextInt();
        if(Number>0&&Number<10){
        switch (Number){
            case 1: System.out.println("Số một");
            break;
            case 2: System.out.println("Số hai");
                break;
            case 3: System.out.println("Số ba");
                break;
            case 4: System.out.println("Số bốn");
                break;
            case 5: System.out.println("Số năm");
                break;
            case 6: System.out.println("Số sáu");
                break;
            case 7: System.out.println("Số bảy");
                break;
            case 8: System.out.println("Số tám");
                break;
            case 9: System.out.println("Số chín");
                break;
        }
        } else {
            System.out.println("Số không hợp lệ");
        }
    }
}
