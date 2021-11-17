let person = {
    firstName: 'John',
    lastName: 'Doe',
    middleName: 'C.',
    currentAge: 28
};

let { firstName,  lastName, middleName = '', currentAge: age = 18 } = person;

console.log(middleName); // 'C.'
console.log(age); // 28