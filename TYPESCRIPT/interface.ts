interface IPerson
{
    firstName:string,
    lastName:string,
    sayHi:()=>string
}
var customer:IPerson={
    firstName:"tom",
    lastName:"hanks",
    sayHi:():string=>{return "hi there"}
}
console.log("customer object");
console.log(customer.firstName);
console.log(customer.lastName);
console.log(customer.sayHi())
var employee:IPerson={
firstName:"JIM",
lastName:"BLAKES",
sayHi:():string=>{
    return "hello!!!"
}
}
console.log("employee object")
console.log(employee.firstName);
console.log(employee.lastName);



