/*parent class*/
class person
{
    constructor(name)
    {
        this.name=name;
        this.occupation="unemployed";
    }
    abc()
    {
        console.log("hello",this.name);
    }
}
//inheriting parent class
class student extends person
{
    constructor(name)
    {
        // call super class constructor and pass name parameter
        super(name);
        // overriding occupation
        this.occupation="student";
    }
    abc()
    {
        console.log("hello student",this.name);
        console.log("occupation :  ",this.occupation);
    }
}
let p=new student("jack");
p.abc();