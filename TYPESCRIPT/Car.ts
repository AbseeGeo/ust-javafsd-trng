class Car
{
    engine:string;
    constructor(engine:string){
        this.engine=engine;
    }

    disp():void
    {
        console.log("function display engine is:"+this.engine)
    }
}
var obj1=new Car("xxxsy1");
console.log("reading attribute value engine as:   "+obj1.engine);
obj1.disp();