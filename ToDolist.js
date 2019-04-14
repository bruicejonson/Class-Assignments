var lis = document.querySelectorAll('li');

function myFunction() {
    var node = document.createElement("li");
    node.setAttribute("id", "li");
    var textnode = document.createTextNode(document.getElementById('myText').value);
    node.appendChild(textnode);
    document.getElementById("TODO List").appendChild(node);
    document.getElementById('myText').value = null;
    node.addEventListener('click',remove,false);
    
  }
  Object.prototype.remove = function(){
    this.parentNode.removeChild(this);
};
for (var i = 0, len = lis.length; i < len; i++) {
    lis[i].addEventListener('click', remove, false);
};

