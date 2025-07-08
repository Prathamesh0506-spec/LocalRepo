//C PROGRAMS FILE FOR CLOUD


/**********STACK BASIC PROGRAMM***********/
#include <stdio.h>
#include <stdlib.h>


int stk[5],top = -1,i;
int ch,n;
void main()
{
    do{
        printf("Enter Operation\t 1.Push\n  2.Pop\n  3.Display\n");
        scanf("%d", &ch);

        switch(ch){
            case 1:
                printf("Enter Element");
            scanf("%d", &n);
            push(n);
            break;

            case 2 : pop();
                break;

            case 3: Display();
                break;

            case 4: exit(0);
        }
    }
    while(ch >=1 && ch<= 4);

}
void push (int n){
    if(top == 4){
        printf("STACK OVER-FLOW");
    }
    else{
        top++;
        stk[top] = n;
        printf("%d is inserted", n);
    }
}

void pop (){
    if(top == -1){
        printf("UNDERFLOW");
    }
    else{
        printf("%d is Deleted", stk[top]);
        top--;
    }

}

void Display(){
    if(top == -1){
     printf("Stack is emepty");
    }
    else{
        for(i = 0; i<= top; i++){
            printf("%d\t", stk[i]);
        }
    }
}


