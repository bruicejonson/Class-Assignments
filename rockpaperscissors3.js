
var hand = ["rock", "paper", "scissors"];
var player1name = prompt('What is your name?');
const playUntil = 1;       


let player1 = {
    name: player1name,
    hand: null,
    won: 0,
};
let player2 = {
    name: "Computer",
    getCompHand: function (hand) {
        return hand[parseInt(Math.random() * 10) % 3];
    },
    hand: null,
    won: 0,
};

function playRound(player1hand) {
    player1.hand = player1hand;//("Do you choose rock, paper or scissors?");
    player2.hand = player2.getCompHand(hand);
    if (player1.hand === player2.hand) {
        return null;
    } else {
        if ((player1.hand == "scissors" && player2.hand == "paper") || (player1.hand == "rock" && player2.hand == "scissors") ||
            (player1.hand == "paper" && player2.hand == "rock")) {
            player1.won++;
            alert(`${player1.name} chose ${player1.hand} and the computer chose ${player2.hand}, ${player1.name} wins`);
            alert(`${player1.name} Wins  !!!`)
            alert(`${player1.name}: ${player1.won}\n ${player2.name}: ${player2.won}`);
            winner = (`${player1.name} is the winning !!!`);
            


        } else{
            player2.won++
            alert(`${player1.name} chose ${player1.hand} and the computer chose ${player2.hand}, the computer wins`);
            alert('Tony Stark Wins !!!, I mean the computer wins..... you werent playing Tony Stark that would be obsurd');
            alert(`${player1.name}: ${player1.won}\n ${player2.name}: ${player2.won}`);
            winner = (`The ${player2.name} is winning !!!`);
            
};            
score= (`${player1.name}:${ player1.won}`)
score2 = (`${player2.name}: ${ player2.won}`)  
document.getElementById("winner").innerHTML = winner;
document.getElementById("score").innerHTML = score;
document.getElementById("score2").innerHTML = score2;   
}
}


document.getElementById("userchoice").addEventListener("click", () => playRound("rock"));
document.getElementById("userchoice1").addEventListener("click", () => playRound("paper"));
document.getElementById("userchoice2").addEventListener("click", () => playRound("scissors"));
