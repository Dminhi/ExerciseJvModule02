package baitap01;

public class findBigestNumber {
    private static int[] getArr(){
        int arr[] = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.ceil(Math.random() * 100);
        }
        return arr;
    }
    public static void main(String[] args) {
        int maxNumber=getArr()[0];
        for (int i : getArr()) {
            System.out.printf(i+" ");
            if(maxNumber<i){
                maxNumber=i;
            }
        }System.out.println(maxNumber);

    }
}
