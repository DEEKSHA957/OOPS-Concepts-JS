class Tax
{
    Tax=5;
}
class KA_Tax extends Tax{}
let KA=new KA_Tax();
console.log(KA.Tax);
console.log(KA.sal);
class Goa_Tax extends Tax{
    Tax=15;
    sal=500000;
}
let g=new Goa_Tax();
console.log(g.Tax);
console.log(g.sal);
