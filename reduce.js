let euros=[29.5,70,2,67];
let doubled=euros.reduce((total,amount)=>{
    total.push(amount*2);
    return total;
},[]);
console.log(doubled);

