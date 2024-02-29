document.getElementById('movieForm-sin').addEventListener('submit', function(event) {
    event.preventDefault();
    loadSinMsg();
});

document.getElementById('movieForm-cos').addEventListener('submit', function(event) {
    event.preventDefault();
    loadCosMsg();
});

document.getElementById('movieForm-palindrome').addEventListener('submit', function(event) {
    event.preventDefault();
    loadPalindromeMsg();
});

document.getElementById('movieForm-magnitud').addEventListener('submit', function(event) {
    event.preventDefault();
    loadMagnitudMsg();
});

function loadSinMsg() {
    let nameVar = document.getElementById("name-get").value;
    const xhttp = new XMLHttpRequest();
    xhttp.onload = function() {
        document.getElementById("sinrespmsg").innerHTML = this.responseText;
    };
    xhttp.open("GET", "/sin/"+nameVar);
    xhttp.send();
}

function loadCosMsg() {
    let nameVar = document.getElementById("name-cos").value;
    const xhttp = new XMLHttpRequest();
    xhttp.onload = function() {
        document.getElementById("cosrespmsg").innerHTML = this.responseText;
    };
    xhttp.open("GET", "/cos/"+nameVar);
    xhttp.send();
}

function loadPalindromeMsg() {
    let nameVar = document.getElementById("name-palindrome").value;
    const xhttp = new XMLHttpRequest();
    xhttp.onload = function() {
        document.getElementById("palindromerespmsg").innerHTML = this.responseText;
    };
    xhttp.open("GET", "/palindome/"+nameVar);
    xhttp.send();
}

function loadMagnitudMsg() {
    let nameVar1 = document.getElementById("name-magnitud1").value;
    let nameVar2 = document.getElementById("name-magnitud2").value;
    const xhttp = new XMLHttpRequest();
    xhttp.onload = function() {
        document.getElementById("magnitudrespmsg").innerHTML = this.responseText;
    };
    xhttp.open("GET", "/magnitud/"+nameVar1+"/"+nameVar2);
    xhttp.send();
}

