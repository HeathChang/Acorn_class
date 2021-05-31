import {Person ,bbb} from "./b.js"; //export default 아닌경우
//import ccc from "./c.js"; //export default인 경우
//import {default as kkk} from "./c.js"; //export default ccc에서 alias 부여
import defaultExport from "./c.js"; //export default ccc


var p = new Person("홍길동");
bbb();
//ccc();
///kkk(); //3라인 default as kkk
defaultExport(); //4라인 ccc()호출
console.log(">>>>>",p.name);
