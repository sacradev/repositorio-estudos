let count = 0;

const CURRENT_NUMBER = document.getElementById('currentNumber');

function increment() {
	if (count < 10) {
        count++;
	CURRENT_NUMBER.innerHTML = count;
    }
    if(count >= 0){
        CURRENT_NUMBER.style.color="#000000"
    }
}

function decrement() {
	    if(count <= 0){
        CURRENT_NUMBER.style.color="#ff0000"
    }
    if (count > -10) {
        count--;
	CURRENT_NUMBER.innerHTML = count;
    }
}


document.getElementById("subtrair").addEventListener("click",decrement);
document.getElementById("adicionar").addEventListener("click",increment);