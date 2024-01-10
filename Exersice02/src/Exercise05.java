public class Exercise05 {
    public static void main(String[] args) {
        int N = 1;
        boolean check = true;
        while (check){
            N++;
            if(N % 5== 0 && N%7==0 && N%11 == 0){
                System.out.println("Số nhỏ nhất chia hết cho 5,7,11: "+N);; break;
            }
            check = true;
            }

        }
    }

