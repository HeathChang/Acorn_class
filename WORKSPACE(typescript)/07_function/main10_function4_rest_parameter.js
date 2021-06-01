//1. rest Param
function test_param() {
    var n = [];
    for (var _i = 0; _i < arguments.length; _i++) {
        n[_i] = arguments[_i];
    }
    console.log(n);
}
test_param(1, 2, 3);
test_param(10, 20, 30, 40, 50);
function test_param2(x, y) {
    var n = [];
    for (var _i = 2; _i < arguments.length; _i++) {
        n[_i - 2] = arguments[_i];
    }
    console.log(x, y, n);
}
test_param2("a", "b", "c", "d", "e");
