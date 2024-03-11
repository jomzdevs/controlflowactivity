import java.util.Scanner;

/**
 * ControlFlowActivity
 */
public class ControlFlowActivity {

    private static void evenOrOdd(){
        int number, remainder;
        System.out.println("Please Enter a Number:");
        Scanner scan = new Scanner(System.in);
        number = scan.nextInt();
        scan.close();

        remainder = number % 2;
        if(remainder == 0 )
            System.out.println(number + " Nice! A Even Number");
        else
            System.out.println(number + " Great! A Odd Number");
    }
   private static void FactorialNum(){
        int number;
        long factorial = 1;
        Scanner input =  new Scanner(System.in);

        System.out.println("Enter the Number:");
         number = input.nextInt();
         input.close();

        if( number < 0)
            System.out.println("Can't find the factorial!");
        else if (number <= 1)
        System.out.printf("%d! - %d", number, factorial);
        else {
            for(int counter = number; counter >=2; counter--) {
                factorial = factorial*counter;
            }
            System.out.printf("%d! = %d",number, factorial);
           }
    }
  private static void FibonacciSeries(){
       
            Scanner input = new Scanner(System.in);
            
            System.out.println("Enter a First Term Number:");
            int fTerm = input.nextInt();
            System.out.print("Enter a Second Term Number:");
           int sTerm = input.nextInt();
           int n = 10;

           System.out.println("The Fibonacci till" + n + "terms:");

           for(int i =  1; i <= n; ++i){
            System.out.print(fTerm + ", ");

            //computing the next term
            int nxtTerm = fTerm + sTerm;

            fTerm = sTerm;
            sTerm = nxtTerm;
           }
    }
private static void LeapYear(){
    Scanner input = new Scanner(System.in);

    System.out.print("\t Please Enter a Year: ");

    //user input of year
    int year = input.nextInt();
    boolean leap =  false;


    //year is divided by 4
    if(year % 4 == 0){
        //year is divided by 100 if a input value is a century
        if(year % 100 == 0){
            //year is divided by 400 if a input value is a century
            //then it will became leap year if the calcuations is true
            if(year % 400 == 0)
            leap = true;
            else
                leap = true;
        }
        //if the input year is not century, it will loop here
        else
            leap = true;
    }else
         leap = false;
    
    if(leap)
    //message if the input is true
        System.out.print("\t-->" + year + "is a Leap Year! That's Great!");
    else
     //message if the input is false
    System.out.print("\t-->" + year + "is a not Leap Year! WOAH! That's Surprised Me!");
}
  private static void SimplePaNaCalculatorTo(){
        char operator;
        int num1, num2, result;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a operator: +, -, *, /");
        operator= scanner.next().charAt(0);

        System.out.println("Enter a  First NUMBER:");
        num1 = scanner.nextInt();

        System.out.println("Enter a  Second NUMBER:");
        num2 = scanner.nextInt();

        switch(operator){

            case '+':
            result = num1 + num2;
            System.out.println("Output: " + num1 + " + " + num2 + " = " + result);
            break;

            case '-':
            result = num1 - num2;
            System.out.println("Output: " + num1 + " - " + num2 + " = " + result);
            break;

            case '*':
            result = num1 * num2;
            System.out.println("Output: " + num1 + " * " + num2 + " = " + result);
            break;

            case '/':
            result = num1 / num2;
            System.out.println("Output: " + num1 + " / " + num2 + " = " + result);
            break;
            default: System.out.println("Invalid Choosen operator!");
            break;
        }
        
    }



    static void divider(){
        for (int i = 1; i < 50; i++){
            System.out.print("~");
        }
        System.out.println();
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
           while (true){

            divider();

            Scanner UserInput = new Scanner(System.in);

            String UserOptions[] = new String[]{
                "Welcome!",
                "1. Odd or Even Number Determinator",
                "2. The Factorial Revealer",
                "3. Fibonacci Series",
                "4. Leap Year Seeker",
                "5. Mas Simple pa sa Simpleng Calculator",
            };
            System.out.println("Please Choose a Program to perform");
            
            for (String string : UserOptions){
                System.out.println("\t"+ string);
            }
            System.out.print("Please Choose a Number:");
            int option = UserInput.nextInt();

            switch (option) {
                case 1:
                    System.out.println("* " + UserOptions[option -1].substring(3));
                    evenOrOdd();
                    break;


                case 2:
                    System.out.println("* " + UserOptions[option - 1].substring(3));
                    FactorialNum();
                    break;
                
                case 3:
                    System.out.println("* " + UserOptions[option - 1].substring(3));
                    FibonacciSeries();
                    break;


                case 4:
                    System.out.println("* " + UserOptions[option - 1].substring(3));
                    LeapYear();
                    break;


                case 5:
                    System.out.println("* " + UserOptions[option - 1].substring(3));
                    SimplePaNaCalculatorTo();
                    break;
            
                default:
                System.out.println("TODO: default");
                    break;
            }
            System.err.println();
           }
        }
    }

