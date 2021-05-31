var foo2 = 123;
var bar2 = "hey";
//bar2=foo2; str에 number안됨
var foo3 = 123;
var bar3 = "hey3";
bar3 = foo3;
console.log(bar3); //number에서 any로 변경
//2.샘플
function foo4() {
    return 1;
}
var result = foo4();
var bar4 = 'hey';
//bar4=foo4(); 할당 X
