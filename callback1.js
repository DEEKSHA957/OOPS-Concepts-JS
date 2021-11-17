function greet(name, callback)
{
    console.log('hello world');
    callback(name);
}
function sayName(name)
{
    console.log('hello' + ' ' +name);
}
setTimeout(greet,5000,'john',sayName);
