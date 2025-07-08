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




/**********CONVERT DECIMAL -> BINARY PROGRAMM***********/
#include <stdio.h>
#include <stdlib.h>

int stk[11];
int top = -1;
int idx;
int main()
{
    int num,rem;
    printf("Enter A Number\n");
    scanf("%d", &num);
    //WHILE
    while(num != 0){
        rem = num%2;
        push(rem);
        num = num/2;
    }
    //LOOPING
        idx = top;
    for(int i = 0; i<= idx; i++){
        pop();
    }
    return 0;
}

//LOGIC FOR PUSH FUNCTION
void push(int n){

    if(top == 10){
        printf("STACK-OVERFLOW");
    }
    else{
        top++;
        stk[top] = n;
    }
}
//LOGIC FOR POP FUNCTION
void pop (){
    if(top == -1){
        printf("UNDERFLOW");
    }
    else{
        printf("%d\n", stk[top]);
        top--;

    }
}




/**********REVERRSE STRING BY STACK PROGRAMM***********/
#include <stdio.h>
#include <stdlib.h>
#include<string.h>

char stk[11],rev[11];
char n;
int top=-1,k=0;


int main()
{
    char name[11];
    //TAKING INPUT OF NAME
    printf("Enter A Name\n");
    scanf("%s", &name);

    //LOGIC FOR PUSHING IN METHOD
    for(int i=0; name[i]!='\0'; i++){
        push(name[i]);
    }

    //LOGIC FOR PUSHING IN POP
    for(int i = 0; i<strlen(name); i++){
        pop();

    }
    //PRINTING
    printf("The original Name is %s\n", stk);
    printf("The Reversed Name is %s\n", rev);

    return 0;
}
//LOGIC FOR PUSH function
void push(char n){
    if(top == 10){
        printf("STACK-OVERFLOW");
    }
    else{
        top++;
        stk[top] = n;
    }
}

//LOGIC FOR pop
void pop (){
    rev[k]=stk[top--];
    k++;
}

