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





/**********DECI -> BINARY BY USING STK PROGRAMM***********/
/*
    import java.util.Scanner;


public class Main {

    static int[] stk = new int[11]; // ✅ Java array syntax
    static int top = -1;

    //LOGIC FOR PUSH FUNCTION
    public void push(int n){
        if (top == 10){
            System.out.println("OVER-FLOW");
        }
        else {
            top++;
            stk[top] = n;
        }
    }


    //LOGIC FOR POP FUNCTION
    public void pop(){
        if (top == -1){
            System.out.println("UNNDER-FLOW");
        }
        else {
            System.out.println("\n" + stk[top]);
            top--;
        }
    }


    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        Main obj = new Main();

        int num,rem;
        System.out.println("Enter A NUmber\n");
        num = sc.nextInt();

        //LOGIC
        while (num !=0){    //JOPARYNAT N ZERO HOT NAHI
            rem = num%2;    //REMAINDER HECH TAR CONVERSION ASTY MHANUN REM PUSH MADHE GHATILI
            obj.push(rem);
            num = num/2;
        }
        //LOGIC FOR POP IN MAIN
        int idx = top;      //TOP ADKUN RAHU NAYE MHANUN
        for (int i =0; i<=idx; i++){
            obj.pop();
        }
    }
    }

 */





 /**********REVERSE STRING BY USING STK PROGRAMM***********/
 /*
  import java.util.Scanner;

class stackrev {

    String stk;
    String rev;
    char n;
    int top = -1, k = 0;

    //LOGIC FOR PUSH function
    public void push(char n) {
        if (top == 10) {
            System.out.println("STACK-OVERFLOW");
        } else {
            top++;
            stk = stk + n;
            //stk.charAt(top)=n;
        }
    }

    //LOGIC FOR pop
    public void pop() {
        rev = rev + stk.charAt(top--);
        k++;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.println("Enter A Name\n");
        name = sc.next();
        stackrev obj = new stackrev();

        //LOGIC FOR PUSHING IN METHOD
        for (int i = 0; i < name.length(); i++) {
            obj.push(name.charAt(i));
        }
        //LOGIC FOR PUSHING IN POP
        for (int i = 0; i < name.length(); i++) {
            obj.pop();

        }
        System.out.println("The original Name is %s\n" + obj.stk);
        System.out.println("The Reversed Name is %s\n" + obj.rev);
    }
}







/****************************SEPERATE DIGITS OF NUMBER BY USING STACK*********************** */
/* 
import java.util.Scanner;


public class Main {
    int[] stk = new int[11]; // Stack of size 11
    int top = -1;


    //LOGIC FOR PUSH-METHOD
    public void Push(int num){
        // CORNER CASE
        if (top == 10){
            System.out.println("OVER-Flow");
        }
        else {
            top++;
            stk[top] = num;
        }
    }

    //LOGIC FOR POP-METHOD

    public void Pop(){
        //corner Case
        if(top == -1){
            System.out.println("UNDER-FLOW\n");
        }

        else{
            System.out.println("Digits of the number are:\n");
            while(top != -1){
                System.out.println(stk[top]);
                top--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            Main obj = new Main();  //MAIN LA LINK KARUN GHENE

        //TAKING NUMBER INPUT
        System.out.println("Enter A Number\n");
        int num = sc.nextInt();

        //LOGIC TO SEPERATE DIGITS
        while (num>0){
           int digit = num%10;
           obj.Push(digit);
            num = num / 10;
        }
        obj.Pop();
    }
}

  */
