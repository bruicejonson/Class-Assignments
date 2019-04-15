function myFunction() {
    document.getElementById("myDropdown").classList.toggle("show");
  }
  
  // Close the dropdown if the user clicks outside of it
  window.onclick = function(event) {
    if (!event.target.matches('.dropbtn')) {
      var dropdowns = document.getElementsByClassName("dropdown-content");
      var i;
      for (i = 0; i < dropdowns.length; i++) {
        var openDropdown = dropdowns[i];
        if (openDropdown.classList.contains('show')) {
          openDropdown.classList.remove('show');
        }
      }
    }
  }

var button1 = document.getElementById('part1').addEventListener("click", function () {
    $.get('http://jsonplaceholder.typicode.com/posts ', function (post) {
     document.getElementById('selected').innerHTML = 'Get All Posts' ;
    document.getElementById("data").innerHTML = post.map(function(t){
    return '<br>'+'<h4>'+"User Id:  "+ t.id +'</h4>' +'<br>'+ '<h5>'+"Title:  "+ t.title + '</h5>'+ '<br>'+'<h6>'+"Body: " + t.body + '</h6>'+'<br>'
 });
    });
});
var button2 = document.getElementById('part2').addEventListener("click", function () {
    $.get('http://jsonplaceholder.typicode.com/posts/10 ', function (post1) {
    document.getElementById('selected').innerHTML = "Posts with Id#10" ;   
    document.getElementById("data").innerHTML =JSON.stringify(post1)
    });
});
var button3 = document.getElementById('part3').addEventListener("click", function () {
    $.get('http://jsonplaceholder.typicode.com/comments?postId=12 ', function(post2) {
    document.getElementById('selected').innerHTML = "Comments for Post#12" ;   
    document.getElementById("data").innerHTML = post2.map(function(t){
            return '<br>'+'<h4>'+"User Id:  "+ t.id +'</h4>' +'<br>'+ '<br>'+'<h6>'+"Body: " + t.body + '</h6>'+'<br>'
         });
    });
});
var button4 = document.getElementById('part4').addEventListener("click", function () {
    $.get('http://jsonplaceholder.typicode.com/posts?userId=2', function (post3) {
    document.getElementById('selected').innerHTML ='Posts Under User ID#12';    
    document.getElementById("data").innerHTML = post3.map(function(t){
        return '<br>'+'<h4>'+"User Id:  "+ t.id +'</h4>' +'<br>'+ '<h5>'+"Title:  "+ t.title + '</h5>'+ '<br>'+'<h6>'+"Body: " + t.body + '</h6>'+'<br>'
     });
    });
});
var button5 = document.getElementById('part5').addEventListener("click", function () {
    $.ajax({
        method:'POST',
        url:'http://jsonplaceholder.typicode.com/posts', 
        data:{
            Title:"Whats Up Doc?",
            body:'Eat lots of carrots.',
        },complete: function (post4) {
        document.getElementById('selected').innerHTML = 'Add New Post';
            document.getElementById("data").innerHTML = JSON.stringify(post4);
        }
    });
});
var button6 = document.getElementById('part6').addEventListener("click", function () {
    $.ajax({
        method: 'PUT',
        url: 'http://jsonplaceholder.typicode.com/posts/12',
        complete: function(response){
            document.getElementById('selected').innerHTML = 'Replace Post';
            document.getElementById("data").innerHTML = JSON.stringify(response.responseJSON);
        }
    })
});
var button7 = document.getElementById('part7').addEventListener("click", function () {
    $.ajax({ 
    method:'PUT',
    url:'http://jsonplaceholder.typicode.com/posts/12',
    data:{
    title:"New Title",
},complete:function (response) {   
    document.getElementById('selected').innerHTML = 'Update Post#12 Title';
    document.getElementById("data").innerHTML = JSON.stringify(response.responseJSON);
}    
});
});
var button8 = document.getElementById('part8').addEventListener("click", function () {
    $.ajax({
        method: 'DELETE',
        url: 'http://jsonplaceholder.typicode.com/posts/12',
        complete: function(){
            document.getElementById('selected').innerHTML = 'Delete Post#12';
            document.getElementById("data").innerHTML ='Delete: 100%';
        }
    })
});
var button9 = document.getElementById('part9').addEventListener("click", function () {
    $.get('http://jsonplaceholder.typicode.com/posts ', function (post5) {
     document.getElementById('selected').innerHTML = 'All Posts' ;
    document.getElementById("data").innerHTML = post5.map(function(t){
    return '<br>'+'<h4>'+"User Id:  "+ t.id +'</h4>' +'<br>'+ '<h5>'+"Title:  "+ t.title + '</h5>'+ '<br>'+'<h6>'+"Body: " + t.body + '</h6>'
    + '<br>'+ '<button onclick="myFunction2()" id="comment"class="dropbtn rounded-lg" style="float:center">'+'Comments'+'</button>'+'<br>'
 });
    });
});
function myFunction2(){
        $.get('http://jsonplaceholder.typicode.com/comments?postId=1', function (comment) {
         document.getElementById('selected').innerHTML = 'Comments form Post' ;
        document.getElementById("data").innerHTML = comment.map(function(t){
        return '<br>'+'<h4>'+"User Id:  "+ t.id +'</h4>' +'<br>'+'<br>'+'<h6>'+"Body: " + t.body + '</h6>'
        + '<br>'+ '<button onclick="myFunction3()" id="Return"class="dropbtn rounded-lg" style="float:center">'+'Back To Posts'+'</button>'+'<br>'
    });
        }); 
}
function myFunction3(){
    $.get('http://jsonplaceholder.typicode.com/posts ', function (post5) {
     document.getElementById('selected').innerHTML = 'All Posts' ;
    document.getElementById("data").innerHTML = post5.map(function(t){
    return '<br>'+'<h4>'+"User Id:  "+ t.id +'</h4>' +'<br>'+ '<h5>'+"Title:  "+ t.title + '</h5>'+ '<br>'+'<h6>'+"Body: " + t.body + '</h6>'
    + '<br>' +'<button onclick="myFunction2()" id="comment"class="dropbtn rounded-lg" style="float:center">'+'Comments'+'</button>'+'<br>'
});
});
}
