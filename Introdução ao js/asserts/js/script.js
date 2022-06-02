var currentNumberWrapper = document.getElementById('currentNumber')
var currentNumber = 0

function increment() {
    currentNumberWrapper.innerHTML = ++currentNumber;
    if (currentNumber >= 0){
        currentNumberWrapper.style.color="#000000";
    }
}

function decrement() {
    currentNumberWrapper.innerHTML = --currentNumber
    if (currentNumber < 0){
        currentNumberWrapper.style.color="#ff0000";
    }
}

document.getElementById("subtrair").addEventListener("click",decrement);
document.getElementById("adicionar").addEventListener("click",increment);