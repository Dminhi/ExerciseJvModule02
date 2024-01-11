package TinhChuViDienTich;

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        while (choice!=4){
            System.out.println("Mời chọn menu");
            // Nhập lựa chọn
            choice = sc.nextInt();
            switch (choice){
            // Nếu lựa chọn 1 thì tính chu vi và diện tích của hình chữ nhật có giá trị chiều dài
            // rộng là một số tuỳ chọn
                case 1:
                    System.out.println("Mời nhập chiều dài hình chữ nhật");
                    double height = sc.nextInt();
                    System.out.println("Mời nhập chiều rộng hình chữ nhật");
                    double width = sc.nextInt();
                    System.out.println("Chu vi  của hình có chiều dài là "+height+" Chiều rộng là "+width+" là: "+(width+height)*2);
                    System.out.println("Diện tích  của hình có chiều dài là "+height+" Chiều rộng là "+width+" là: "+width*height);

                    break;
                case 2:
            // Nếu lựa chọn 2 thì tính chu vi và diện tích của hình tam giác
            // Với 3 cạnh là do mình nhập vào
                    System.out.println("Mời nhập chiều dài các cạnh của hình tam giác");
                    double a = sc.nextInt();
                    double b = sc.nextInt();
                    double c = sc.nextInt();
                    System.out.println("Chu vi của hình tam giác có 3 cạnh a b c là : "+a+b+c);
                    double p = ((a+b+c)/2);
                    double d = p*(p-a)*(p-b)*(p-c);
                    double s = Math.sqrt(d);
                    System.out.println("Diện tích của hình tam giác có 3 cạnh a b c là : "+s);
                    break;
                case 3:
                    // Nếu lựa chọn 3 thì tính chu vi và diện tích của hình tròn
                    // Với bán kính là do mình nhập vào
                    double PI = 3.14;
                    System.out.println("Mời nhập bán kính của hình tròn");
                    double radius = sc.nextInt();
                    System.out.println("Chu vi của hình tròn có bán kính "+radius+" là: "+2*PI*radius);
                    System.out.println("Diện tích của hình tròn có bán kính "+radius+" là: "+PI*radius*radius);
                    break;
                    // Truòng hợp nhập số khác thì thông báo nhập lại
                    default:
                    System.out.println("Mời nhập lại");
            }
        }
        System.out.println("Đã thoát chương trình");
    }
}
