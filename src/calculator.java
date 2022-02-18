import java.util.Scanner;

public class calculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Calculator!");
        System.out.println("Which operation do you want to perform: (    +  -  *  /    )");
        char operator = scanner.next().charAt(0);
        if (operator == '+' || operator == '-' || operator == '*' || operator == '/'){
            System.out.println("your choice is:" + operator);
        }else {
            System.out.println("please enter correct operator!");
            return;
        }
    }
}
