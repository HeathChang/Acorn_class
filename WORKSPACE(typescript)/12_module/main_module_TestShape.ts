import {IShape} from './main_module_IShape';
import CircleAlias from './main_module_Circle'; //export default 리네임해서 사용
import {Triangle, Triangle as XXX} from './main_module_Triangle'; //export Alias


function drawAllShape(shapeToDraw: IShape){
  shapeToDraw.draw(); //trigger
}

drawAllShape(new CircleAlias());
drawAllShape(new Triangle());
drawAllShape(new XXX());