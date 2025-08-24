
//BODY MADHE TOP LA HEDING ADD KARNE

/*let newHeading = document.createElement("h1");
newHeading.innerHTML = "<i>Hi i am new</i>";
document.querySelector("body").prepend(newHeading);

*/


/* LECTURE CODE
let newBtn = document.createElement("button");
let div = document.querySelector("div");
newBtn.innerText= "CLICK ME!!"
div.append(newBtn);

*/


/*let div = document.querySelector("box1");*/

/*let div = document.querySelector("box1");
console.log(div);
let id = div.getAttribute("class");
console.log(id);
*/

    

/*-------> DOM NE STYLES CHNAGE KARNE <-------*/

/*let div = document.querySelector("#box");
div.style.backgroundcolour = "pink";
div.style.fontsize = "26px";
div.innerText = "Hellow !";
*/



/*------->ADDING NEW ELEMENT BY USING DOM<-------*/
/*let anna = document.querySelector("box");
anna.append(newBtn);

let newHeading = document.createElement("h1");
newHeading.innerHTML = "PATA HAI HUM MATCH KAHA HARE";
document.querySelector("body").prepend(newHeading);
*/





/*------->PRACTISE QUESTION 1<-------*/
/*let div = document.querySelector("pQ");

let newBtn = document.createElement("button");
newBtn.innerHTML = "<i>THIS IS BTN</i>";
newBtn.innerText = "CLICK ME !!";
newBtn.style.backgroundColor = "red";
newBtn.style.color = "white";
document.querySelector("body").prepend(newBtn);*/





/*--EVENT'S*/
/*let elem = document.querySelector("#btn1");

elem.onclick = ()=>{
    console.log("Button was clicked");
    var a = 12;
    a++;
    console.log(a);
}

let div = document.querySelector(".box2");
div.onmouseover = ()=>{
    console.log("you're inside div");
};

elem.onclick = (evt) =>{
    console.log(evt);
    console.log(evt.type);
}*/



/*let btn = document.querySelector("#btn1");

btn.addEventListener("click", ()=>{
    console.log("Button Was Clicked");
});

btn.addEventListener("click", ()=>{
    console.log("Handler 2");
});

const Handler3 = ()=>{
    console.log("Handler 3");
};

btn.addEventListener("click", Handler3);

btn.removeEventListener("click", Handler3);
*/



/******************BUTTON FOR CHANGING DARK MODE -> LIGHT MODE**************** */
/*let modeBtn = document.querySelector("#btn1");
let currMode = "Light";

modeBtn.addEventListener("click", ()=>{
    if(currMode === "Light"){
        currMode = "dark";
        document.querySelector("body").style.backgroundColor = "black";
    }
    else{
        currMode = "Light";
        document.querySelector("body").style.backgroundColor = "white";
    }
    console.log(currMode);
});
*/



/*
const openBtn = document.getElementById('openModal');
const closeBtn = document.getElementById('closeModal');
const modal = document.getElementById('modal');
const overlay = document.getElementBy
*/


/*let promise = new Promise((resolve, reject) => {
    console.log("I Am Promise\n");
    resolve("1234");
});

let promise2 = new Promise((resolve, reject) => {
    console.log("I Am PRomise 2");
    reject("1234");
});*/



/******BASIC TIME-OUT FUNCTION *******/
/*console.log("one");
console.log("two");

setTimeout(() => {
    console.log("Hellow");
}, 4000);

console.log("Three");
console.log("four");*/




/*********@DVANCED JS CONCEPT--->>DEBOUNCING******/

/*const btn = document.querySelector(".increment_btn");
const btnPress = document.querySelector(".increment pressed");
const count = document.querySelector(".increment_count");

var pressedCount = 0;
var triggerCount = 0;

const debouncedCount = _.debounce(() =>{
    count.innerHTML = ++triggerCount;
}, 800);

btn.addEventListener("click", ()=>{
    btnPress.innerHTML = ++pressedCount;
    debouncedCount();
})*/




/*******THROTLING*******/
/*const btn = document.querySelector(".increment_btn");
const btnPress = document.querySelector(".increment pressed");
const count = document.querySelector(".increment_count");

var pressedCount = 0;
var triggerCount = 0;

const start = new Date().getTime();

const throttledCount = _.throttle(()=>{

    const now = new Date().getTime();
    console.log(now-start);
    count.innerHTML = ++triggerCount;
},800);

btn.addEventListener("click", ()=>{
    btnPress.innerHTML = ++pressedCount;
    throttledCount();
});
*/



/*function getData(1, ()=>{
    console.log("getting Data\n");
    getData2(2,()=>{
        console.log("Getting another Data\n");
        getData(3,()=>{
            console.log("Getting data 1212\n");
        })
    });
});
*/



/*const getPromise = {{ => {
    return new Promise ((resolved, rejected)) =>{
        console.log("I Am A Promise\n");
        resolve("sucess");
    }
}

}*}*/



/*****PROMISE CHANING*****/
/*function getData(dataID){
    return new Promise (resolve, reject) =>{
        setTimeout { () =>{
            console.log("data", dataID);
            resolve("Sucess");
        }

        }
    }
};*/




/*****ASYNC-AWAIT*****/
// ASYNC-AWAIT EXAMPLE

// Function that returns a promise
/*function getWeatherData() {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            console.log("Weather Data Fetched");
            console.log("Jose pedro balmceda pascal");
            resolve(200);
        }, 5000);
    });
}

// Async function to call the promise
async function fetchWeather() {
    let result = await getWeatherData();
    console.log("Result code:", result);
}

// Call the async function
fetchWeather();
*/

//console.log("my bhubhu is my labubu");




/*************************CLOUSER'S IN J.S************************* */
/*function main(){
    const name = "Pata Hai Hum Match Kaha Hare....?";

    function sayMyName(){
        console.log(name);
    }
    sayMyName();
}
main();*/



//EXAMPLE.2
/*function adder(num){
    function add(b){
        console.log(num +  b);
    }
    return add;
}

const outPut = adder(5);
outPut(2);
outPut(10);
*/








/**********REAL-LIFE USE CASE***********/
//EXA.1
/*const myName = document.getElementById("My-name");
const btn = document.getElementById("myBtn");

function makeTextSizer(size){
    function changeSize(){
        myName.style.fontSize = `${size}px`;
    }
    return changeSize;
}

const size70 = makeTextSizer(70);
//btn.addEventListener("click", size12);
//btn.addEventListener("click", size70);*/






//EXA.2
//SAME HTML FOR THIS CODE
/*const myName = document.getElementById("My-name");
const btn = document.getElementById("myBtn");

function makeCounter(){
    let count = 1;
    
    function increment(){
        console.log(count++);    
    }
    return increment;
}

const counter1 = makeCounter();
counter1();
counter1();
counter1();
counter1();
counter1();*/