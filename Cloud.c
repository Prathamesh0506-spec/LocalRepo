/***** 
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




/**********LL_BY_USING_STk***********/
#include <stdio.h>
#include <stdlib.h>
//STRUCTURE FOR CREATING NODE
struct Node{
int data;
int *ptr;
};

struct Node *top = NULL, *temp,*first;

int main(){
int ch,n;
    while(1){
        printf("Enter Choices 1.insert\t 2.Delete\t 3.Display\t");
        scanf("%d", &ch);
        switch(ch){

        case 1:
        printf("Enter A Number\t");
        scanf("%d", &n);
        push(n);
        break;

        case 2: pop();
        break;

        case 3: Display();
        break;

        case 4: exit(0);
        break;
        }
    }

    return 0;
}

//LOGIC FOR PUSH FUCNN
void push(int n){
    struct Node *newnode;       //ek node create honar
    newnode = (struct Node*)malloc(sizeof(struct Node));  //memory allocation
    newnode -> data = n;
    newnode -> ptr = top;
    //ASSING TOP
    top = newnode;
    printf("%d",top->data);
}


//LOGIC FOR DISPLAY
void Display(){
struct Node *temp = top;
    if(top == NULL){
        printf("EMEPTY");
    }
    else{
        while(temp != NULL){
            printf("%d\t", temp->data);
            temp = temp->ptr;    //POINTING TO NEXT NODE'S ADRESSS
        }
    }
}

//LOGIC FOR POP
void pop(){
struct Node *temp;
   if (top == NULL) {
        printf("Underflow: Stack is empty\n");
        return;  // Exit if the stack is empty
    }

        printf("Item %d popped from stack\n", top->data);
        temp=top;
        top=top->ptr;
        free(temp);
}










/********************************************-> UNIT-QUEUE <-********************************************/


/**********QUEUE BASIC PROGRAMM BY ARRAY***********/
#include <stdio.h>
#include <stdlib.h>

int que[6];
int front = -1;
int rear = -1;
int ch,n;
int size =6;
void main()
{

    do{
        printf("Enter Operation\t 1.insert\n  2.del\n  3.Display\n 4.Exit\n\n");
        scanf("%d", &ch);
        //
        switch(ch){
            case 1:
            printf("Enter Element");
            scanf("%d", &n);
            insert(n);
            break;

            case 2: del();
                break;

            case 3: Display();
            break;

            case 4: exit(0);
        }
    }
    while(ch<=4 && ch>=1);
}

void insert(int n){
    if(rear == size-1){     //MEANS LAST IDX LA AHE
        printf("Queue Is Full\n");
    }
    else{
            if(front == -1){
                front++;
            }
        rear++;
        que[rear] = n;
        printf("%d is inserted\n", n);
    }
}

void del(){
    if(front == -1 && rear == -1 || front == rear+1){
        printf("Queue Is Emepty\n");
    }
    else{
        printf("%d is Deleted\n", que[front]);
        front++;
    }
}

void Display(){
    for(int i = front; i<=rear; i++){
        printf("%d\t", que[i]);
    }
}





/**********QUEUE AS LINKED-LIST********/
#include <stdio.h>
#include <stdlib.h>

//NODE CREATION THROUGH QUEUE
struct Node{
int data;
struct Node *next;
};
struct Node *front = NULL, *rear = NULL, *temp, *t;


void enque(int );
void deque();
void display();


void main()
{
int no, ch, c;
printf("\n enter to insert");
printf("\n delete");
printf("\n display");
printf("\n exit");
//front=rear=NULL;

while(1){
        printf("\n Enter Your Choice");
        scanf("%d", &ch);

    switch(ch){
    case 1:
        printf("\nEnter data");
        scanf("%d", &no);
        enque(no);
        break;

        case 2: deque();
        break;

        case 3: display();
        break;

        case 4:
            exit(0);
            break;

            default: printf("You Entered Wrong Choice\n");
            break;
    }
}
}


void enque(int n){
if(rear == NULL){       //JAR QUEUE EMEPTY ASEL TAR 1St Node Sathi
    rear = (struct Node *)malloc(sizeof(struct Node));
    rear -> next = NULL;
    rear -> data = n;
    front = rear;
    }

    else{     //JAR AADHICH KAY TAR PRESENT ASEL TAR

    temp = (struct Node *)malloc(sizeof(struct Node));
    rear -> next = temp;
    temp -> data = n;
    temp -> next = NULL;
    rear = temp;

    }
}

void display(){
t = front;      //JAR 1ST CH ELEMENT NASEL TAR
if((t == NULL) && (rear == NULL)){
    printf("QUEUE IS EMEPTY");
    return;
}

while(t!= NULL){
    printf("%d\t", t-> data);
    t = t-> next;
}
}

void deque(){
    t = front;      //JAR 1ST CH ELEMENT PRESENT NASEL TAR
    if(t == NULL){
        printf("\n emepty queue");
        return;
    }
    else
        if(t ->next !=NULL){        //TRAVSERSAL KARUN DELETE KARNE
        t = t-> next;
        printf("\n deque value : %d", front -> data);
        free(front);
        front = t;
    }
    else{           //JAR AAPN 1ST CH ELEMNET DELETE KELA
        printf("\n Deque value %d", front->data);
        free(t);
        front = NULL;
        rear = NULL;
    }
}


/*
void emepty(){
    if((front == NULL) && (rear == NULL))
        printf("\n Queue Is Emepty");
    else
        printf("\n Queue Is Not emepty");
}
*/





/********** SUM OF ELEMENTS OF QUEUE ************/
#include <stdio.h>
#include <stdlib.h>

int que[10];
int count = 0;
int rear = -1;
int front = -1;
int ch,n;
int size = 10;
int sum = 0;

void enque(int n){
    //FULL ASTANACHI CONDITION
    if(rear == size-1){
        printf("Queue Is Full\n");
    }
    else{
        //KIND OF EMEPTY ASTANACHI CONDITION
        if(front == -1){
            front++;      //FRONT LA 1ST IDX LA LAVUN GHETLA
        }
        rear++;
        que[rear] = n;
        printf("%d is inserted\n", n);
        count++;
        printf("Total Elem In Currrent Situation are%d\t\n", count);
        //LOGIC FOR ADDITION OF QUE ELEM
        sum = sum +que[rear];
        printf("The Addition Of elements After This Operation Is %d\n", sum);
    }

}

//LOGIC FOR DELETE
void deque(){
    if(front == -1 && rear == -1 || front == rear+1){
       printf("Queue Is Emepty\n");
    }
    else{
        sum = sum - que[front];
        printf("%d is deleted\n", que[front]);
        front++;
        count--;
        printf("Total Elem In Currrent Situation are%d\t\n", count);
        //LOGIC FOR SUBSTRACTION OF QUE ELEM

        printf("The Addition Of elements After This Operation Is %d\n", sum);
    }

}

//LOGIC FOR DISPLAY

void Display(){
    for(int i = front; i<=rear; i++){
        printf("%d\t", que[i]);
    }
    printf("Total Elem In Currrent Situation are%d\t", count);
    //AFTER
    printf("The Addition Of elements After This Operation Is %d\n", sum);
}


void main()
{
do{
    printf("Enter Operation\t 1.insert\n  2.del\n  3.Display\n 4.Exit\n\n");
    scanf("%d", &ch);
    //
        switch(ch){
            case 1:
            printf("Enter Element");
            scanf("%d", &n);
            enque(n);
            break;

            case 2: deque();
                break;

            case 3: Display();
            break;

            case 4: exit(0);
        }
    }
        while(ch<=4 && ch>=1);
}






/********** NO OF ELEMENTS OF QUEUE************/
#include <stdio.h>
#include <stdlib.h>

int que[10];
int count = 0;
int rear = -1;
int front = -1;
int ch,n;
int size = 10;

void enque(int n){
    //FULL ASTANACHI CONDITION
    if(rear == size-1){
        printf("Queue Is Full\n");
    }
    else{
        //KIND OF EMEPTY ASTANACHI CONDITION
        if(front == -1){
            front++;      //FRONT LA 1ST IDX LA LAVUN GHETLA
        }
        rear++;
        que[rear] = n;
        printf("%d is inserted\n", n);
        count++;
        printf("Total Elem In Currrent Situation are%d\t\n", count);
    }

}

//LOGIC FOR DELETE
void deque(){
    if(front == -1 && rear == -1 || front == rear+1){
       printf("Queue Is Emepty\n");
    }
    else{
        printf("%d is deleted\n", que[front]);
        front++;
        count--;
        printf("Total Elem In Currrent Situation are%d\t\n", count);
    }

}

//LOGIC FOR DISPLAY

void Display(){
    for(int i = front; i<=rear; i++){
        printf("%d\t", que[i]);
    }
    printf("Total Elem In Currrent Situation are%d\t", count);
}


void main()
{
do{
    printf("Enter Operation\t 1.insert\n  2.del\n  3.Display\n 4.Exit\n\n");
    scanf("%d", &ch);
    //
        switch(ch){
            case 1:
            printf("Enter Element");
            scanf("%d", &n);
            enque(n);
            break;

            case 2: deque();
                break;

            case 3: Display();
            break;

            case 4: exit(0);
        }
    }
        while(ch<=4 && ch>=1);
}





/********** MAXIMUM ELEMENTS OF QUEUE************/
#include <stdio.h>
#include <stdlib.h>

int que[6];
int count = 0;
int rear = -1;
int front = -1;
int ch,n;
int size = 10;
int max = 0;

void enque(int n){
    //FULL ASTANACHI CONDITION
    if(rear == size-1){
        printf("Queue Is Full\n");
    }
    else{
        //KIND OF EMEPTY ASTANACHI CONDITION
        if(front == -1){
            front++;      //FRONT LA 1ST IDX LA LAVUN GHETLA
        }
        rear++;
        que[rear] = n;
        printf("%d is inserted\n", n);
        count++;
        printf("Total Elem In Currrent Situation are%d\t\n", count);
        }
    }



//LOGIC FOR DELETE
void deque(){
    if(front == -1 && rear == -1 || front == rear+1){
       printf("Queue Is Emepty\n");
    }
    else{
        printf("%d is deleted\n", que[front]);
        front++;

        printf("Total Elem In Currrent Situation are%d\t\n", count);
        //LOGIC FOR MAXIMUM ELEM OF QUE

    }
}

//LOGIC FOR DISPLAY
void Display(){
    for(int i = front; i<=rear; i++){
        printf("%d\t", que[i]);
    }
    printf("Total Elem In Currrent Situation are%d\t", count);

}


void maximumElm(){
    max = que[front];
    for(int i = front+1; i<= rear; i++){
        if(max<que[i]){
            max = que[i];
        }
    }
    printf("Maximum elem in curr situation is %d\n", max);
}

void main()
{
do{
    printf("Enter Operation\t 1.insert\n  2.del\n  3.Display\n  4.maximumElm\n  5.Exit\n\n");
    scanf("%d", &ch);
    //
        switch(ch){
            case 1:
            printf("Enter Element");
            scanf("%d", &n);
            enque(n);
            break;

            case 2: deque();
                break;

            case 3: Display();
            break;

            case 4: maximumElm();
            break;

            case 5: exit(0);
        }
    }
        while(ch<=4 && ch>=1);
}






/**************_IMP_DOUBLE_ENDED_QUEUE_************/
#include <stdio.h>
#include <stdlib.h>
#define Size 6
//SOME GLOBAL DECLERATIONS
int double_EndQue[Size];
int front = -1;
int rear = -1;

//FUNC-INSERT @T REAR
void insert_rear(){
    int added_item;
    if((front == 0 && rear == Size-1) ||(front == rear+1)){
        printf("Queue Overflow\n");
        return;
    }
    if(front == -1){
        front = 0;
        rear = 0;
    }
       else{
            //CIRCULAR LINKING CHI CONDTION
            if(rear == Size-1){
                rear = 0;
            }
            else{
                rear = rear+1;
            }
       }
       printf("Input the element for adding in queue : ");
           scanf("%d", &added_item);
           double_EndQue[rear] = added_item;
}

//FUNC-INSERT @T FRONT
void insert_front(){
    int added_item;
    if((front == 0 && rear == Size-1) || (front == rear+1)){
        printf("Queue Overflow \n");
        return;
    }
    if (front == -1){
        front = 0;
        rear = 0;
    }
    else{
        //ULTA CHALNAR AHE FRONT IN THIS FUNCTION
        //SO ULTI CIRCULAR LINKAGE LAVNE
        if(front== 0)
            front=Size-1;
        else
            front = front-1;    //-> ULTI CHALAYCHI CONDITION
        printf("Input the element for adding in queue : ");
        scanf("%d", &added_item);
        double_EndQue[front] = added_item;
    }
}

//**********DELETE SATHI CHE 2 FUNCTIONS**********//

//FUNNCT DELETE FROM @REAR
void delete_rear(){
   //CORNER CASE #1
    if (front == -1)
    {
        printf("Queue Underflow\n");
        return ;
    }
    printf("Element deleted from queue is : %d\n",double_EndQue[rear]);
    if(front == rear){
    //SPECIAL-CORNER CASE
    //-> *queue has only one element ani jar aapn delete option dablo*
        front = -1;
        rear=-1;
    }
    else{
    //ULTI CHALAYACHI CONDITION
        if(rear == 0){
            rear = Size-1;
        }
    else{
     rear = rear-1;
    }
}
}

//FUNCTION DELETE FROM FRONT -->(NORMAL DELETION)//
void delete_front()
{   if (front == -1)
    {   printf("Queue Underflow\n");
        return ;
    }
    printf("Element deleted from queue is : %d\n",double_EndQue[front]);
    if(front == rear) /*Queue has only one element */
    {   front = -1;
        rear=-1;
    }
    else
        if(front == Size-1)
            front = 0;
        else
            front = front+1;
}

//****LOGIC && SWITCH CASES FOR INPUT-RESTRICTION FUNCTION****//
void input_Restrict(){
//HYAT INSERT FAKT 1KA SIDE NE HONAR
int option;
do{
    printf("1.Insert at rear\n");
    printf("2.Delete from front\n");
    printf("3.Delete from rear\n");
    printf("4.Display\n");
    printf("5.Quit\n");
    printf("Enter your choice : ");
    scanf("%d",&option);

    switch(option){
        case 1:
            insert_rear();
            break;
         case 2:
            delete_front();
            break;
         case 3:
            delete_rear();
            break;
         case 4:
            display_double_EndQue();
            break;
         case 5:
            break;
         default:
            printf("Wrong choice\n");
    }
}
while(option!=5);
}

//THE GRAND DISPLAY-FUNCTION//
void display_double_EndQue(){
 int f_pos = front,r_pos = rear;
    //CORNER CASE #1
    if(front == -1)
    {   printf("Queue is empty\n");
        return;
    }
    //NORMAL PRINTING
    printf("Queue elements :\n");
    if(f_pos <= r_pos){
        while(f_pos <= r_pos){
            printf("%d ",double_EndQue[f_pos]);
            f_pos++;
        }
    }
    else{
        //SPECIAL CASE 2
        while(f_pos <= Size-1)
        {   printf("%d ",double_EndQue[f_pos]);
            f_pos++;
        }
        //CIRCULAR CONDITION
        f_pos = 0;
        while(f_pos <= r_pos){
            printf("%d", double_EndQue[f_pos]);
            f_pos++;
        }
    }
    printf("\n");
}


//****SWITCH CASES FOR OUTPUT-RESTRICTION****//
void output_Restrict(){
    //HYAT DELETE FAKT 1KA SIDE NE HONAR
    int opt;
    do{
        printf("1. Insert from rear\n");
        printf("2. Insert from Front\n");
        printf("3. Delete from Front\n");
        printf("4. Display\n");
        printf("5.Quit\n");
        printf("Enter a Option\n");
        scanf("%d", &opt);
        switch(opt){
        case 1:
            insert_rear();
            break;
         case 2:
            insert_front();
            break;
         case 3:
            delete_front();
            break;
         case 4:
            display_double_EndQue();
            break;
         case 5:
            break;
         default:
            printf("Wrong choice\n");
        }
    }
    while(opt != 5);
}

//APLA MAIN FUNCT
int main()
{
    int choice;
    printf("1. INPUT-RESTRICTED QUEUE\n");
    printf("2. OUTPUT-RESTRICTED QUEUE\n");
    printf("ENTER YOUR CHOICE\n");
    scanf("%d", &choice);
    switch(choice){
    case 1: input_Restrict();
    break;

    case 2: output_Restrict();
    break;

    default:
        printf("Bro Wrong Choice!!");
    }
}




/**************CIRCULAR QUEUE AS ARRAY**********/
#include <stdio.h>
#include <stdlib.h>

int que[6];
int front = -1;
int rear = -1;
int ch,n;
int size =6;
int insert(int);
int main()
{
    do{
        printf("Enter Operation\t 1.insert\n  2.del\n  3.Display\n 4.Exit\n\n");
        scanf("%d", &ch);
        //
        switch(ch){
            case 1:
            
            printf("Enter Element");
            scanf("%d", &n);
            insert(n);
            break;

            case 2: del();
                break;

            case 3: Display();
            break;

            case 4: exit(0);
        }
    }
    while(ch<=4 && ch>=1);
    return 0;
}


//LOGIC FOR INSERTION
int insert(int n){
    if(((rear == size-1 && front == 0 )||(front==rear+1))){     //TRADITONL COND
        printf("Queue Is Full\n");
    }
    else{
            if(front == -1)
                front=0;


            if(rear == size-1)
                rear =0;

else
                rear++;

        que[rear] = n;
        printf("%d is inserted\n front =%d\t rear =%d\t", n,front,rear);
    }
}


void del(){
    int n;
    if(front==-1)
    {
        printf("queue is empty");
    }
    else{
    printf("%d is deleted",que[front]);
    if(front==rear)
        front=rear=-1;
    else if(front==size-1)
        front=0;
    else front++;
}
}



void Display(){
    if(front==-1)
    {
        printf("queue is empty");
    }
    else{
    printf("Queue elements are\n");

if(front<=rear ){
        for(int i = front; i<=rear; i++)
        printf("%d\t", que[i]);
}
else{

for(int i = front; i<size; i++)
        printf("%d\t", que[i]);

for(int i= 0; i<=rear; i++)
        printf("%d\t", que[i]);

    }
    }}





/***********~~LEGENDARY_QUESTION ~~************/

/***********->
                PRIORITY_QUEUE ->/***********/


#include <stdio.h>
#include <stdlib.h>

int priority_queue[11];
int f = -1;
int r = -1;
int size = 11;

// Function declarations
void insert(int);
void del(int);
void check(int);
void display();

void main() {
    int n, ch;
    while (1) {
        printf("\n\n1. Insert");
        printf("\n2. Delete");
        printf("\n3. Display");
        printf("\n4. Exit");
        printf("\nEnter your choice: ");
        scanf("%d", &ch);

        switch (ch) {
            case 1:
                printf("Enter a number: ");
                scanf("%d", &n);
                insert(n);
                break;
            case 2:
                printf("Enter a number to delete: ");
                scanf("%d", &n);
                del(n);
                break;
            case 3:
                display();
                break;
            case 4:
                exit(0);
                break;
            default:
                printf("Entered wrong option\n");
        }
    }
}

void insert(int data) {
    if (r >= size - 1) {
        printf("Queue is full\n");
        return;
    }

    if ((f == -1) && (r == -1)) {
        f++;
        r++;
        priority_queue[r] = data;
        return;
    } else {
        check(data);
        r++;
    }
}

void check(int data) {
    int i, j;
    for (i = 0; i <= r; i++) {
        if (data >= priority_queue[i]) {
            for (j = r + 1; j > i; j--) {
                priority_queue[j] = priority_queue[j - 1];
            }
            priority_queue[i] = data;
            return;
        }
    }
    priority_queue[i] = data;
}

void del(int data) {
    int i;
    if ((f == -1) && (r == -1)) {
        printf("\nQueue is empty\n");
        return;
    }

    for (i = 0; i <= r; i++) {
        if (data == priority_queue[i]) {
            for (; i < r; i++) {
                priority_queue[i] = priority_queue[i + 1];
            }
            priority_queue[i] = -99;
            r--;
            if (r == -1) {
                f = -1;
            }
            return;
        }
    }
    printf("%d not found in queue", data);
}

void display() {
    if ((f == -1) && (r == -1)) {
        printf("\nQueue is empty");
        return;
    }

    printf("\nPriority Queue: ");
    for (int i = f; i <= r; i++) {
        printf("%d ", priority_queue[i]);
    }
}
*******/