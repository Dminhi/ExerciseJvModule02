package baitap03;

public class SumInterger {
    public static void main(String[] args) {
        Object[] sum = {3, 5, 3, 5.5, 5,"a",null};


        int total = 0;
        for (int i = 0; i < sum.length; i++) {
            try {
                int temp = Integer.parseInt(sum[i].toString());
                total += temp;
            } catch (NumberFormatException|NullPointerException e) {
                System.out.println(sum[i]+ " : Không phải là số nguyên");
            }
        }
        System.out.println(total);


    }
}

