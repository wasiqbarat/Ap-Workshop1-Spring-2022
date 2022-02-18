import java.util.Scanner;

public class calculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Calculator!");
        System.out.println("Enter first number:");
        float firstNum = scanner.nextInt();
        System.out.println("Enter second num:");
        float secondNum = scanner.nextInt();
        if (secondNum == 0){
            System.out.println("enter non-zero number!!!!");
            return;
        }
        System.out.println("Which operation do you want to perform: (    +  -  *  /    )");
        char operator = scanner.next().charAt(0);
        if (operator == '+' || operator == '-' || operator == '*' || operator == '/'){
        }else {
            System.out.println("please enter valid operator!");
            return;
        }
        float result = 0;
        switch ( operator ){
            case '+' -> result = firstNum + secondNum;
            case '-' -> result = firstNum - secondNum;
            case '*' -> result = firstNum * secondNum;
            case '/' -> result = firstNum / secondNum;
        }


    }
}
