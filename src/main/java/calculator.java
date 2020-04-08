import java.util.Scanner;
public class calculator{
    public static void main(String args[]){
        float a, b, res ;
        char choice, ch ;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("1. ADD TWO Numbers");
            System.out.println("1. MULTIPLY TWO Numbers");
            System.out.println("3. EXIT");
            System.out.println("Enter your choice");
            choice = sc.next().charAt(0);
            switch(choice){
                case '1' :
                    System.out.println("Enter two numbers :");
                    a = sc.nextFloat();
                    b = sc.nextFloat();
                    res = a+b ;
                    System.out.println("Result = " + res);
                    break;

//                case '2':
//                    System.out.println("Enter two numbers :");
//                    a = sc.nextFloat();
//                    b = sc.nextFloat();
//                    res = a*b ;
//                    System.out.println("Result = " + res);
//                    break;

                case '3' :
                    System.exit(0);
                    break;

                default :
                    System.out.println("INVALID CHOICE!!");
                    break;

            }
            System.out.println("----------------------------------------");
        }while(choice!=2);
    }

}