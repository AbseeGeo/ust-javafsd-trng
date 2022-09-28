class student{
    constructor(name,age){
        this.n=name;
        this.a=age;
    }
    stu()
    {
        console.log("the name of student is:",this.n)
        console.log("the age of student is:",this.a)
    }
}
var stuObj=new student('peter',20);
stuObj.stu();