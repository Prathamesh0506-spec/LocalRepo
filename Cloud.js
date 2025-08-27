/**********PREREQUISITE************/


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







/***************------------------->> @DVANCED JS CONCEPT DEBOUNCING <<-------------------************/


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
