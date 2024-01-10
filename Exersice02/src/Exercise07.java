import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        while (choice!=4){
            System.out.println("Mời chọn menu");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Mời nhập chiều dài hình chữ nhật");
                    int height = sc.nextInt();
                    System.out.println("Mời nhập chiều rộng hình chữ nhật");
                    int width = sc.nextInt();
                    System.out.println("Chu vi  của hình có chiều dài là "+height+" Chiều rộng là "+width+" là: "+(width+height)*2);
                    System.out.println("Diện tích  của hình có chiều dài là "+height+" Chiều rộng là "+width+" là: "+width*height);

                    break;
                case 2:
                    System.out.println("Mời nhập chiều dài các cạnh của hình tam giác");
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    int c = sc.nextInt();
                    System.out.println("Chu vi của hình tam giác có 3 cạnh a b c là : "+a+b+c);
                    int p = ((a+b+c)/2);
                    int d = p*(p-a)*(p-b)*(p-c);
                    double s = Math.sqrt(d);
                    System.out.println("Diện tích của hình tam giác có 3 cạnh a b c là : "+s);
                    break;
                case 3:
                    double PI = 3.14;
                    System.out.println("Mời nhập bán kính của hình tròn");
                    int radius = sc.nextInt();
                    System.out.println("Chu vi của hình tròn có bán kính "+radius+" là: "+2*PI*radius);
                    System.out.println("Diện tích của hình tròn có bán kính "+radius+" là: "+PI*radius*radius);


                    break;
            }
        }
        System.out.println("Đã thoát chương trình");
    }
}
