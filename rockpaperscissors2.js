var hand = ["rock", "paper", "scissors"];

let player1 = {
    name: "Bruice",
    gethand: gethand,
    hand: null,
    won: 0,
    Championship: 0
};
let player2 = {
    name: "Kelsey",
    gethand: gethand,
    hand: null,
    won: 0,
    Championship: 0
};
let player3 = {
    name: "Walker",
    gethand: gethand,
    hand: null,
    won: 0,
    Championship: 0
};
let player4 = {
    name: "Jessica",
    gethand: gethand,
    hand: null,
    won: 0,
    Championship: 0
};

function gethand(hand) {
    return hand[parseInt(Math.random() * 10) % 3];
}

function playRound(player1, player2, hand) {
    player1.hand = player1.gethand(hand);
    player2.hand = player2.gethand(hand);
    if (player1.hand === player2.hand) {
        return null;
    } else {
        if ((player1.hand == "scissors" && player2.hand == "paper") || (player1.hand == "rock" && player2.hand == "scissors") ||
            (player1.hand == "paper" && player2.hand == "rock")) {
            return player1

        } else {
            return player2
        }

    }
}
function addWins(player) {
    if (player !== null)
        player.won++;
}

function playGame1(player1, player2, hand, playUntil) {
    console.log('Rock,Paper, Scissors Tournament Round 1 !');
    while (player1.won < playUntil && player2.won < playUntil) {
        addWins(playRound(player1, player2, hand))
    }
}
playGame1(player1, player2, hand, 5);
console.log(`${player1.name} has:${player1.won} , ${player2.name} has:${player2.won}`)
if (player1.won === 5) {
    console.log(`${player1.name} is the winner of this round !!!`)
}
else if (player2.won === 5) {
    console.log(`${player2.name} is the winner of this round !!!`)
}
else { round1winner = false }
if (player1.won === 5) {
    var round1winner = player1
} else {
    var round1winner = player2
}
function playRound(player3, player4, hand) {
    player3.hand = player3.gethand(hand);
    player4.hand = player4.gethand(hand);
    if (player3.hand === player4.hand) {
        return null;
    } else {
        if ((player3.hand == "scissors" && player4.hand == "paper") || (player3.hand == "rock" && player4.hand == "scissors") ||
            (player3.hand == "paper" && player4.hand == "rock")) {
            return player3
        } else { return player4 }
    }
}
function addWins(player) {
    if (player !== null)
        player.won++;
}

function playGame(player3, player4, hand, playUntil) {
    console.log('Round 2 !');
    while (player3.won < playUntil && player4.won < playUntil) {
        addWins(playRound(player3, player4, hand))
    }
}
playGame(player3, player4, hand, 5);
console.log(`${player3.name} has:${player3.won} , ${player4.name} has:${player4.won}`)
if (player3.won === 5) {
    console.log(`${player3.name} is the winner of this round !!!`)
}
else if (player4.won === 5) {
    console.log(`${player4.name} is the winner of this round !!!`)
}

if (player3.won === 5) {
    var round2winner = player3
} else {
    var round2winner = player4
}
function finalRound(round1winner, round2winner, hand) {
    round1winner.hand = round1winner.gethand(hand);
    round2winner.hand = round2winner.gethand(hand);
    if (round1winner.hand === round2winner.hand) {
        return null;
    } else {
        if ((round1winner.hand == "scissors" && round2winner.hand == "paper") || (round1winner.hand == "rock" && round2winner.hand == "scissors") ||
            (round1winner.hand == "paper" && round2winner.hand == "rock")) {
            return round1winner
        } else { return round2winner }
    }
}
function championshipWins(player) {
    if (player !== null)
        player.Championship++;
}

function finalGame(round1winner, round2winner, hand, playUntil) {
    console.log('Championship Round !');
    while (round1winner.Championship < playUntil && round2winner.Championship < playUntil) {
        championshipWins(finalRound(round1winner, round2winner, hand))
    }
}
finalGame(round1winner, round2winner, hand, 5);
console.log(`${round1winner.name} has:${round1winner.Championship} , ${round2winner.name} has:${round2winner.Championship}`)
if (round1winner.Championship === 5) {
    console.log(`${round1winner.name} is the Champion !!!`)
}
else if (round2winner.Championship === 5) {
    console.log(`${round2winner.name} is the Champion !!!`)
}

