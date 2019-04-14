const selectedItem = document.querySelector('li.selected')
const header = selectedItem.parentElement.parentElement;
const section = document.querySelectorAll('section');
const current = document.querySelector('section.current');
const next = current.nextElementSibling;
const h2 = current.previousElementSibling;
const div = document.querySelector('h2.highlight').parentElement.parentElement;


var section2 = Array.from(document.querySelectorAll('section')).filter(function(header){
    return header.querySelector("h2") != null;
})


console.log(header);
console.log(section);
console.log(current);
console.log(next);
console.log(h2);
console.log(div);
console.log(section2);



const selectedItem = document.querySelector('#list');
var coffee = selectedItem.children[1].textContent='Fair Trade Coffee';

selectedItem.children[3].remove();

const snack = document.createElement('li');
snack.innerHTML = "Cheese Whiz";
selectedItem.appendChild(snack);


selectedItem.innerHTML = '';
['protein powder', 'muscle milk', 'power bars'].forEach(function(itemText){
	var li = document.createElement('li');
	li.innerHTML = itemText;
	selectedItem.appendChild(li);
});

selectedItem.children[1].className= "Important";





