class Fruit
{
   color:string;
    constructor(color:string){
        this.color=color;
    }

    disp():void
    {
        console.log("favourate fruit is:"+this.color);
    }
}
var fru=new Fruit("apple");
console.log("favourate fruit is: "+fru.color);
fru.disp();
var  price:number[]=new Array(4)
for(var i=0;i<price.length;i++)
{
    price[i]=i*250;
    console.log("Price  Of "+i +"  Kilograms");
    console.log(price[i])
}
