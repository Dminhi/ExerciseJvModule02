public class Exercise02 {
    public static void main(String[] args) {
        for (int i = 1; i< 4;i++){
                for(int j = 1; j<7;j++){
                System.out.print("*");
            } System.out.println("*");
        }

        for(int a = 0;a<6;a++){
            for (int b=5-a;b>0;b--){System.out.print("*");}
            System.out.println("*");
        }

        for(int x = 0;x<6;x++){
            for(int y = 0; y<x;y++){
                System.out.print("*");
            }
            System.out.println("*");
        }

    }
}
