import java.util.Scanner;

//import java.util.Scanner;
//
public class Exercise01_02_03 {
//    public static void main(String[] args) {
//        Scanner Sc = new Scanner(System.in);
//        System.out.println("Enter your name");
//        String name = Sc.nextLine();
//        System.out.println("Hello: "+name);
//    }
//
//public static void main(String[] args) {
//    int rate = 23000;
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Điền số tiền usd cần chuyển đổi");
//    int Usd = sc.nextInt();
//    System.out.println("VND: "+ rate * Usd );
//}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Số cần đọc là gì: ");
    int Number = sc.nextInt();
    if(Number<10&&Number>=0){
        switch (Number){
            case 1: System.out.println("one");
                break;
            case 2: System.out.println("two");
                break;
            case 3: System.out.println("three");
                break;
            case 4: System.out.println("four");
                break;
            case 5: System.out.println("five");
                break;
            case 6: System.out.println("six");
                break;
            case 7: System.out.println("seven");
                break;
            case 8: System.out.println("eight");
                break;
            case 9: System.out.println("nine");
                break;

        }
            }
        if (Number>=10 && Number<20){
            switch (Number){
                case 10: System.out.println("ten");
                    break;
                case 11: System.out.println("eleven");
                    break;
                case 12: System.out.println("twelve");
                    break;
                case 13: System.out.println("thirteen");
                    break;
                case 14: System.out.println("fourteen");
                    break;
                case 15: System.out.println("fifteen");
                    break;
                case 16: System.out.println("sixteen");
                    break;
                case 17: System.out.println("seventeen");
                    break;
                case 18: System.out.println("eighteen");
                    break;
                case 19: System.out.println("nineteen");
                    break;
        }
    }
        if (Number>=20&&Number<100){
            int donVi = Number%10;
            double hangChuc = Math.floor( Number/10);
            int myInt = (int) hangChuc;
            switch (myInt){
                case 2: System.out.print("twenty");
                    break;
                case 3: System.out.print("thirty");
                    break;
                case 4: System.out.print("forty");
                    break;
                case 5: System.out.print("fifty");
                    break;
                case 6: System.out.print("sixty");
                    break;
                case 7: System.out.print("seventy");
                    break;
                case 8: System.out.print("eighty");
                    break;
                case 9: System.out.print("ninety");
                    break;
            }
            switch (donVi){
                case 1: System.out.println("one");
                  break;
                case 2: System.out.println("two");
                    break;
                case 3: System.out.println("three");
                    break;
                case 4: System.out.println("four");
                    break;
                case 5: System.out.println("five");
                    break;
                case 6: System.out.println("six");
                    break;
                case 7: System.out.println("seven");
                    break;
                case 8: System.out.println("eight");
                    break;
                case 9: System.out.println("nine");
                    break;
            }

        }
        if(Number>=100&&Number<1000){
            int hangTram = Number/100;
            switch (hangTram){
                case 1: System.out.print("one hundred");
                      break;
                case 2: System.out.print("two hundred");
                    break;
                case 3: System.out.print("three hundred");
                    break;
                case 4: System.out.print("four hundred");
                    break;
                case 5: System.out.print("five hundred");
                    break;
                case 6: System.out.print("six hundred");
                    break;
                case 7: System.out.print("seven hundred");
                    break;
                case 8: System.out.print("eight hundred");
                    break;
                case 9: System.out.print("nine hundred");
                    break;

            }
            int hangChuc = Number%100;
            if (hangChuc>=10 && hangChuc<20){
                switch (hangChuc){
                        case 10: System.out.print("ten");
                            break;
                        case 11: System.out.print("eleven");
                            break;
                        case 12: System.out.print("twelve");
                            break;
                        case 13: System.out.print("thirteen");
                            break;
                        case 14: System.out.print("fourteen");
                            break;
                        case 15: System.out.print("fifteen");
                            break;
                        case 16: System.out.print("sixteen");
                            break;
                        case 17: System.out.print("seventeen");
                            break;
                        case 18: System.out.print("eighteen");
                            break;
                        case 19: System.out.print("nineteen");
                            break;
                    }
                }
                if (hangChuc>=20&&hangChuc<100){
                    int donVi = hangChuc%10;
                    double hangChu = Math.floor( hangChuc/10);
                    int myInt = (int) hangChu;
                    switch (myInt){
                        case 2: System.out.print("twenty");
                            break;
                        case 3: System.out.print("thirty");
                            break;
                        case 4: System.out.print("forty");
                            break;
                        case 5: System.out.print("fifty");
                            break;
                        case 6: System.out.print("sixty");
                            break;
                        case 7: System.out.print("seventy");
                            break;
                        case 8: System.out.print("eighty");
                            break;
                        case 9: System.out.print("ninety");
                            break;
                    }
                    switch (donVi){
                        case 1: System.out.print("one");
                            break;
                        case 2: System.out.print("two");
                            break;
                        case 3: System.out.print("three");
                            break;
                        case 4: System.out.print("four");
                            break;
                        case 5: System.out.print("five");
                            break;
                        case 6: System.out.print("six");
                            break;
                        case 7: System.out.print("seven");
                            break;
                        case 8: System.out.print("eight");
                            break;
                        case 9: System.out.print("nine");
                            break;
                    }
            }
        }

}
}


