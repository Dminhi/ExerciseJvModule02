import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập chiều dài");
        int length = sc.nextInt();
        System.out.println("Mời bạn nhâp chiều rộng");
        int width = sc.nextInt();
        int perimeter = (length+width)*2;
        int acreage = length*width;
        System.out.println("perimeter = "+perimeter);
        System.out.println("acreage = "+acreage);

    }
}

