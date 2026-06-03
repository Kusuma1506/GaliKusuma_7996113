// TASK 1
console.log("Welcome to the Community Portal");

window.onload = function(){
  alert("Page Fully Loaded");
};


// TASK 2
const eventName = "Music Night";
const eventDate = "10 June 2026";

let seats = 50;

seats++;

document.getElementById("task2").innerHTML =
`
Event: ${eventName} <br>
Date: ${eventDate} <br>
Seats: ${seats}
`;


// TASK 3
const events = [
  {name:"Music Night", seats:10},
  {name:"Old Event", seats:0}
];

let output3 = "";

events.forEach(event => {

  if(event.seats > 0){
    output3 += `${event.name} Available <br>`;
  }

  else{
    output3 += `${event.name} Full/Past Event <br>`;
  }

});

try{

  let registration = true;

  if(!registration){
    throw "Registration Failed";
  }

}

catch(error){

  output3 += error;

}

document.getElementById("task3").innerHTML = output3;


// TASK 4
function addEvent(name){

  return `${name} added successfully`;

}

function registerUser(user){

  return `${user} registered`;

}

function filterEventsByCategory(events, callback){

  return events.filter(callback);

}

function registrationTracker(){

  let count = 0;

  return function(){

    count++;

    return count;

  };

}

const tracker = registrationTracker();

document.getElementById("task4").innerHTML =
addEvent("Workshop") + "<br>" +
registerUser("Kusuma") + "<br>" +
"Total Registrations: " + tracker();


// TASK 5
class Event{

  constructor(name, seats){

    this.name = name;
    this.seats = seats;

  }

}

Event.prototype.checkAvailability = function(){

  return this.seats > 0 ? "Available" : "Full";

};

const eventObj = new Event("Dance Show", 20);

let entries = Object.entries(eventObj);

document.getElementById("task5").innerHTML =
`
Availability: ${eventObj.checkAvailability()} <br>
Object Entries: ${JSON.stringify(entries)}
`;


// TASK 6
let eventArray = ["Music", "Workshop"];

eventArray.push("Sports");

let musicEvents = eventArray.filter(e => e === "Music");

let mapped = eventArray.map(e => `Workshop on ${e}`);

document.getElementById("task6").innerHTML =
`
Filtered: ${musicEvents} <br>
Mapped: ${mapped.join(", ")}
`;


// TASK 7
const container = document.getElementById("eventContainer");

const card = document.createElement("div");

card.className = "event-card";

card.innerHTML = `
<h3>Music Night</h3>
<button onclick="cancelEvent()">Cancel</button>
`;

container.appendChild(card);

function cancelEvent(){

  alert("Event Cancelled");

}


// TASK 8
function registerEvent(){

  document.getElementById("task8").innerText =
  "Successfully Registered!";

}

document.getElementById("categoryFilter")
.onchange = function(){

  alert("Category Changed: " + this.value);

};

document.getElementById("searchBox")
.addEventListener("keydown", function(event){

  console.log("Searching:", event.key);

});


// TASK 9
function fetchEvents(){

  document.getElementById("loading").innerText =
  "Loading...";

  fetch("https://jsonplaceholder.typicode.com/posts/1")

  .then(response => response.json())

  .then(data => {

    document.getElementById("loading").innerText = "";

    document.getElementById("task9").innerHTML =
    data.title;

  })

  .catch(error => {

    console.log(error);

  });

}

async function asyncFetch(){

  try{

    let response =
    await fetch("https://jsonplaceholder.typicode.com/posts/1");

    let data = await response.json();

    console.log(data);

  }

  catch(error){

    console.log(error);

  }

}

asyncFetch();


// TASK 10
function showEvent(name="Community Meetup"){

  return name;

}

const modernEvent = {

  title:"Coding Workshop",
  location:"Vijayawada"

};

const {title, location} = modernEvent;

const cloneEvents = [...eventArray];

document.getElementById("task10").innerHTML =
`
Default Parameter: ${showEvent()} <br>
Destructuring: ${title}, ${location} <br>
Cloned Array: ${cloneEvents}
`;


// TASK 11
document.getElementById("registerForm")
.addEventListener("submit", function(event){

  event.preventDefault();

  const form = event.target;

  const name = form.elements["username"].value;

  const email = form.elements["email"].value;

  const selectedEvent =
  form.elements["eventName"].value;

  let message = "";

  if(name === "" || email === "" || selectedEvent === ""){

    message = "All fields are required";

  }

  else{

    message = "Registration Successful";

  }

  document.getElementById("formMessage").innerHTML =
  message;

});


// TASK 12
function sendRegistration(){

  document.getElementById("task12").innerText =
  "Sending Request...";

  setTimeout(() => {

    fetch("https://jsonplaceholder.typicode.com/posts", {

      method:"POST",

      body:JSON.stringify({

        name:"Kusuma",
        event:"Music Night"

      }),

      headers:{

        "Content-type":"application/json"

      }

    })

    .then(response => response.json())

    .then(data => {

      document.getElementById("task12").innerText =
      "Registration Successful";

      console.log(data);

    })

    .catch(error => {

      document.getElementById("task12").innerText =
      "Registration Failed";

      console.log(error);

    });

  }, 2000);

}


// TASK 13
console.log("Debugging Started");


// TASK 14
$("#registerBtn").click(function(){

  $("#jqueryCard").fadeOut(1000).fadeIn(1000);

  alert("jQuery Button Clicked");

});