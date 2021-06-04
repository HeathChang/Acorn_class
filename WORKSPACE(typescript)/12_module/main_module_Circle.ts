import {IShape} from './main_module_IShape';

export default class Cicle implements IShape{ //export default 주의 
     draw(){
        console.log("Cirlce is drawn(external Modue)");
    }
}
