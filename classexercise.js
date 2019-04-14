var superHeroes = [
  ['Batman', 'Bruce wayne'],
  ['Spiderman', 'Peter Parker'],
  ['The Flash', 'Barry Allen']]

var SecretIdentity = superHeroes.map(function (revealArray) {
  return revealArray.join(' is ');
});
//console.log(SecretIdentity.join('\n'));


var players = [
  { firstName: 'Cam', lastName: 'Newton', position: 'QB', touchdowns: 32 },
  { firstName: 'Derek', lastName: 'Anderson', position: 'QB', touchdowns: 0 },
  { firstName: 'Jonathan', lastName: 'Stewart', position: 'RB', touchdowns: 12 },
  { firstName: 'Mike', lastName: 'Tolbert', position: 'RB', touchdowns: 8 },
  { firstName: 'Fozzy', lastName: 'Whittaker', position: 'RB', touchdowns: 3 },
  { firstName: 'Ted', lastName: 'Ginn', position: 'WR', touchdowns: 9 },
  { firstName: 'Devin', lastName: 'Funchess', position: 'WR', touchdowns: 2 }
];


var player1 = players.find(function (players) {
  return players.firstName === 'Mike';
});
//console.log(player1);
var RB = players.filter(function (players) {
  return players.position === 'RB';

});
//console.log(RB);
var lastnames = players.map(function (players) {
  return players.lastName;
});
//console.log(lastnames);
var fivetouch = players.filter(function (player) {
  return player.touchdowns > 5 && player.position == 'RB';
}).map(function (player) {
  return player.firstName + ' ' + player.lastName;
});
//console.log(fivetouch);
var score = players.filter(function (players) {
  return players.position === 'RB';
}).reduce(function (sum, current) {
  return sum += current.touchdowns;
}, 0);
console.log(score);
