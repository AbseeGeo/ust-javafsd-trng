var Car = /** @class */ (function () {
    function Car(engine) {
        this.engine = engine;
    }
    Car.prototype.disp = function () {
        console.log("function display engine is:" + this.engine);
    };
    return Car;
}());
var obj1 = new Car("xxxsy1");
console.log("reading attribute value engine as:   " + obj1.engine);
obj1.disp();
