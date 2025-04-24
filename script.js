
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

/*DOM PART 2 PRCTISE QUESTIONS*/
/*Q.1 
MAKE A BUTTON
CLICK ME !!
*/

/*let newBtn = document.createElement("button");
newBtn.innerText = "click me!!";

newBtn.style.color = "white";
newBtn.style.backgroundColor = "red";

document.querySelector("body").prepend(newBtn);

*/

/*Q.2*/










/************************************************EVENTS**************************************/

/*btn1.onclick = ()=>{
    console.log("the button was clicked");
    let a = 25;
    a++;
    console.log(a);
}*/






/*let div = document.querySelector("box1");
div.mouseover = ()=>{
    console.log("you are inside");
}*/





//TO PRINT EVENT OBEJCT
/*btn1.onclick = (evt)=>{
    console.log(evt);
    console.log(evt.type);
}*/





/***************************EVENTS LISTENER'S**************************************/

/*let btn = document.querySelector("#btn1");
btn.addEventListener("click", ()=>{
    console.log("THE BUTTON WAS CLICKED");
})*/



//2 EVENTS AT  THE SAME TIME
/*let btn = document.querySelector("#btn1");
btn.addEventListener("click", ()=>{
    console.log("THE BUTTON WAS CLICKED");
})


btn1.addEventListener("click", ()=>{
    console.log("Handler 2");
})
*/




//ACCESING EVENT OBEJ BY USING EVENT LISTENERS
/*let btn1 = document.querySelector("#btn1");

btn1.addEventListener("click", (evt)=>{
    console.log("handler 1");
    console.log(evt);
    console.log(evt.type);
    console.log(evt.clientX,evt.clientY);
})*/






//REMOVING EVENT LISTENERS
