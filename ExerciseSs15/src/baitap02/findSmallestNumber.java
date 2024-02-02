package baitap02;

public class findSmallestNumber {
    private static int[] getArr(){
        int arr[] = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }

    public static void main(String[] args) {
        int minNumber=getArr()[0];
        for (int i : getArr()) {
            System.out.printf(i+" ");
            if(minNumber>i){
                minNumber=i;
            }
        }System.out.println(minNumber);

    }

}
