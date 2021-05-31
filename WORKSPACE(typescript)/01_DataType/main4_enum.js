var Color;
(function (Color) {
    Color[Color["Red"] = 0] = "Red";
    Color[Color["Green"] = 1] = "Green";
    Color[Color["Blue"] = 2] = "Blue";
})(Color || (Color = {}));
;
var c = Color.Red;
console.log(Color.Red); //0
//초기값 설정
var Color2;
(function (Color2) {
    Color2[Color2["Red"] = 1] = "Red";
    Color2[Color2["Green"] = 2] = "Green";
    Color2[Color2["BLue"] = 3] = "BLue";
})(Color2 || (Color2 = {}));
;
var c2 = Color2.Green;
console.log(c2); //2
//명시적 값설정
var Color3;
(function (Color3) {
    Color3[Color3["Red"] = 1] = "Red";
    Color3[Color3["Green"] = 3] = "Green";
    Color3[Color3["BLue"] = 4] = "BLue";
})(Color3 || (Color3 = {}));
;
var c3 = Color3.Green;
console.log(c3); //2
