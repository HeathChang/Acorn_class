"use strict";
exports.__esModule = true;
var main_module_Circle_1 = require("./main_module_Circle"); //export default 리네임해서 사용
var main_module_Triangle_1 = require("./main_module_Triangle"); //export Alias
function drawAllShape(shapeToDraw) {
    shapeToDraw.draw(); //trigger
}
drawAllShape(new main_module_Circle_1["default"]());
drawAllShape(new main_module_Triangle_1.Triangle());
drawAllShape(new main_module_Triangle_1.Triangle());
