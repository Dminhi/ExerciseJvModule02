package TimSoNguyenDuongNhoNhatChiaHetCho5711;

public class Exercise05 {
    public static void main(String[] args) {
        int n = 1;
        boolean check = true;
        while (check){
            n++;
            if(n % 5== 0 && n%7==0 && n%11 == 0){
                System.out.println("Số nhỏ nhất chia hết cho 5,7,11: "+n);; break;
            }
            check = true;
            }

        }
    }

