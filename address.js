class Address
{
    constructor(a,b,c,d)
    {
        this.house_no=a;
        this.area=b;
        this.city=c;
        this.state=d;
    
    }
}
class SBI_customer
{
    constructor(a,acc_name,amt,b)
    {
        this.acc_no=a;
        this.acc_name=acc_name;
        this.amt=amt;
        this.b=b;
        console.log(this.b);
    }
}
let c1=new SBI_customer(101,"Ram",5000,new Address("#553","Marathalli","Bangalore","KA"));
class SBI_acc{}
let cc1=new SBI_acc(new Address("#553","Marathalli","Bangalore","KA"));
