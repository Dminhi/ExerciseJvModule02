package HienThiCacSoNguyen;

public class Exercise03 {
    public static void main(String[] args) {
        // Tìm số nguyên tố trong khoảng từ 2 tới 100
        for(int i= 2;i<100;i++){
           boolean check = true;
        // Chạy vòng lặp j = 2 tới j = căn bậc 2 của i xem i có chia hết cho số nào hay không
            for(int j = 2; j<=Math.sqrt(i);j++){
        // Nếu i chia hết cho j thì không là số nguyên tố
                if(i%j==0){check = false;
                    break;
                }
            }
        // Ngược lại thì là số Nguyên tố
            if(check){
                System.out.println(i + "Là số nguyên tố");
            }
        }
    }
}
