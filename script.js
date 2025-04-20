
/*DOM PART 2 PRCTISE QUESTIONS*/
/*Q.1 
MAKE A BUTTON
CLICK ME !!
*/

let newBtn = document.createElement("button");
newBtn.innerText = "click me!!";

newBtn.style.color = "white";
newBtn.style.backgroundColor = "red";

document.querySelector("body").prepend(newBtn);
