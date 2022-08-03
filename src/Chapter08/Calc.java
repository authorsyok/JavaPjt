package Chapter08;
import java.util.*;

class Add {
    private int a, b;

    void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }
    int calculate() { return a + b; }
}
class Sub {
    private int a, b;

    void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }
    int calculate() { return a - b;}
}
class Mul {
    private int a, b;

    void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }
    int calculate() {return a * b;}
}
class Div {
    private int a, b;

    void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }
    int calculate() {return a / b;}
}

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;
        char op;
        System.out.print("두 정수와 연산자를 입력하시오>> ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        op = scanner.next().charAt(0);

        switch (op) {
        case '+':
            Add add = new Add();
            add.setValue(num1, num2);
            System.out.println(add.calculate());
            break;
        case '-':
            Sub sub = new Sub();
            sub.setValue(num1, num2);
            System.out.println(sub.calculate());
            break;
        case '*':
            Mul mul = new Mul();
            mul.setValue(num1, num2);
            System.out.println(mul.calculate());
            break;
        case '/':
            Div div = new Div();
            div.setValue(num1, num2);
            System.out.println(div.calculate());
            break;
        default:
        	System.out.println("잘못된연산자");
        	break;
        }
    }
}
