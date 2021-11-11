let calculate=(a,b,callback)=>{
    if(callback==="sum")
    {
        return a+b;
    }
}
let result=calculate(10,20,"sum");
console.log(result);
