var MyNamespace;
(function (MyNamespace) {
    var Math = /** @class */ (function () {
        function Math(eng, kor) {
            this.eng = eng;
            this.kor = kor;
        }
        Math.prototype.getInfo = function () {
            return this.eng + this.kor;
        };
        return Math;
    }());
    MyNamespace.Math = Math;
    MyNamespace.user = {
        name: "이순신",
        age: 33
    };
})(MyNamespace || (MyNamespace = {})); //end namespace
var kkk = {
    username: "맹구",
    age: 10
};
console.log(kkk.username + kkk.age);
var m0 = new MyNamespace.Math(100, 200);
console.log(m0.eng + m0.kor);
console.log(MyNamespace.user.name + MyNamespace.user.age);
