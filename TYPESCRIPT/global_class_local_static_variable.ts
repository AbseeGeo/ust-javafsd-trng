var global_num=12
class Numbers12{
    num_val=13;
    static sval=10;
    storeNum(): void{
       var local_num=14;
    }
}
console.log("global num:"+global_num)
console.log(Numbers12.sval)
var obj=new Numbers12();
console.log("global_num:"+obj.num_val)