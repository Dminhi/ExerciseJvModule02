import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập điểm Toán");
        int mathematics = sc.nextInt();
        System.out.println("Mời nhập điểm Vật lý");
        int physical = sc.nextInt();
        System.out.println("Mời nhập điểm Hoá");
        int chemical = sc.nextInt();
        System.out.println("Mời nhập điểm Văn");
        int literature = sc.nextInt();
        System.out.println("Mời nhập điểm Tiếng Anh");
        int English = sc.nextInt();
        int average = (mathematics+physical+chemical+literature+English)/5;
        if(average>=0&&average<5){
            System.out.println("Xếp loại yếu "+average);
        }
        if(average>=5&&average<6.5){
            System.out.println("Xếp loại trung bình "+average);
        }
        if(average>=6.5&&average<8){
            System.out.println("Xếp loại khá "+average);
        }
        if(average>=8&&average<9){
            System.out.println("Xếp loại giỏi "+average);
        }
        if(average>=9&&average<=10){
            System.out.println("Xếp loại xuất sắc "+average);
        }

    }
}
