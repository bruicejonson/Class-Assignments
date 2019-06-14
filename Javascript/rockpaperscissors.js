var weapons = ["rock","paper","scissors"];

const player1= "Player 1";
const player2= "Player 2";
var player1wins= 0;
var player2wins= 0;
var player1weapons= null;
var player2weapons= null;

while(player1wins<3 && player2wins<3){
var player1weapons = weapons[Math.floor(Math.random() * weapons.length)]
var player2weapons = weapons[Math.floor(Math.random() * weapons.length)]

if(player1weapons === player2weapons){
console.log("Tie")

}else if(player1weapons ="scissors" && player2weapons == "Paper" || player1weapons == "rock" && player2weapons =="scissors" ||
player1weapons== "Paper" && player2weapons =="rock"){

player1wins++
console.log("Player 1 wins")}    

else{ player2wins++
    console.log("Player 2 wins")
}
}
let Winner
if ( player1wins===3)
{Winner = player1}
else{Winner = player2}
console.log (Winner, "Wins the Game")