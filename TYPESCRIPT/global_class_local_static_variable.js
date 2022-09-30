var global_num = 12;
var Numbers12 = /** @class */ (function () {
    function Numbers12() {
        this.num_val = 13;
    }
    Numbers12.prototype.storeNum = function () {
        var local_num = 14;
    };
    Numbers12.sval = 10;
    return Numbers12;
}());
console.log("global num:" + global_num);
console.log(Numbers12.sval);
var obj = new Numbers12();
console.log("global_num:" + obj.num_val);
