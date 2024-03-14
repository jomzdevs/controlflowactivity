import java.util.Scanner;

/**
 * ControlFlowActivity
 */
public class ControlFlowActivity {

  public static void evenOrOdd(){
        int number, remainder;
        System.out.println("\tPlease Enter a Number:");
        Scanner scan = new Scanner(System.in);
        number = scan.nextInt();
        scan.close();

        remainder = number % 2;
        if(remainder == 0 )
            System.out.println(number + " Nice! A Even Number");
        else
            System.out.println(number + " Great! A Odd Number");
    }
  public static void FactorialNum(){

    Scanner input = new Scanner(System.in);
    System.out.print("\t Enter a number: ");
    int num = input.nextInt();

    long factorial = 1;

    for (int i = 1; i <= num; ++i) {
        // factorial = factorial * i;
        factorial *= i;
    }
    System.out.printf("Factorial of %d = %d", num, factorial);
}
    
  public static void FibonacciSeries(){
       
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
  public static void LeapYear(){
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
        System.out.print("\t-->" + year + " is a Leap Year! That's Great!\t");
    else
     //message if the input is false
    System.out.print("\t-->" + year + " is a not Leap Year! WOAH! That's Surprised Me!\t");
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



    /**
     * @param args
     */
    public static void main(String[] args) {

        boolean exit = false;
           while (!false){


            Scanner UserInput = new Scanner(System.in);
            System.out.println("*********************************************");
            System.out.println("Please Choose a Program to perform\t");
            System.out.println("1. It is Even? or Odd?");
            System.out.println("2. Factorial Number Printer");
            System.out.println("3. The Fibonacci Series");
            System.out.println("4. Guessing the Leap Year");
            System.out.println("5. Simple Java Calculator");
            System.out.println("6. Exit");
           
            System.out.print("\t Please Choose a Number:");
            int option = UserInput.nextInt();

            switch (option) {
                case 1:
                    System.out.println("TODO: EVEN OR ODD");
                    evenOrOdd();
                    break;
                case 2:
                    System.out.println("TODO: FACTORIAL");
                    FactorialNum();
                    break;
                case 3:
                    System.out.println("TODO: FIBONACCI");
                    FibonacciSeries();
                    break;
                case 4:
                    System.out.println("TODO: LEAP YEAR");
                    LeapYear();
                    break;
                case 5:
                    System.out.println("TODO: SIMPLE CALCULATOR");
                    SimplePaNaCalculatorTo();
                    break;
                case 6:
                    System.out.println("EXIT");
                    exit = false;
                    break;
            
                default:
                System.out.println("\n");
                    break;
            }
            
           }
        }
    }

