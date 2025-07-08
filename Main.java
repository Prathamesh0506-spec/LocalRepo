/* JAVA PROGRAMS FILE FOR CLOUD */


/**********STACK BASIC PROGRAMM***********/

/*import java.util.Scanner;

public class Main {
    //VARIABLES FOR FOLLOWING CODE
    int[] stk = new int[5];
    int top = -1;
    int i, n;
    static int ch;


    //LOGIC FOR PUSH
    public void push(int n) {
        if (top == 4) {
            System.out.println("OVER-FLOW");
        } else {
            top++;
            stk[top] = n;
            System.out.println("inserted\t" + n);
        }
    }


    //LOGIC FOR POP
    public void pop() {
        if (top == -1) {
            System.out.println("UNDER-FLOW");
        } else {
            System.out.println("%d is deleted" + stk[top]);
            top--;
        }
    }


    //LOGIC FOR DISPLAY
    public void Display() {
        if (top == -1) {
            System.out.println("EMEPTY");
        } else {
            for (i = 0; i <= top; i++) {
                System.out.println("\n" + stk[i]);
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Main obj = new Main();
        //LOGIC FOR DO-LOOP
        do {

            System.out.println("Enter Operations\t 1.push\n 2.pop\n 3.Display\n");
            //SWITCH CASE
             ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter Element");
                    int n = sc.nextInt();
                    obj.push(n);
                    break;

                case 2:
                    obj.pop();
                    break;

                case 3:
                    obj.Display();
                    break;

                case 4:
                    System.exit(0);
            }
        }
        while (ch >= 1 && ch <= 4);

        }
    }


*/