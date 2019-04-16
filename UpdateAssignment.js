
let Profile = {
    name: 'Batman',
	 address: 'Bat Cave',
    city: 'Gothem',
    state:'Everywhere',
    zipcode:'N/A',
     avatar:":_:"
 }
console.log(Profile);
 console.log('It is time for an update !');
var getProfileUpdate = Object.assign({},Profile,{
    state:'No where'});

console.log(`Your updated state is: ${getProfileUpdate.state}`);
console.log(getProfileUpdate);