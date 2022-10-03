var Fruit = /** @class */ (function () {
    function Fruit(color) {
        this.color = color;
    }
    Fruit.prototype.disp = function () {
        console.log("favourate fruit is:" + this.color);
    };
    return Fruit;
}());
var fru = new Fruit("apple");
console.log("favourate fruit is: " + fru.color);
fru.disp();
var price = new Array(4);
for (var i = 0; i < price.length; i++) {
    price[i] = i * 250;
    console.log("Price  Of " + i + "  Kilograms");
    console.log(price[i]);
}
