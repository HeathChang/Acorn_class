import {IShape} from './main_module_IShape';

export  class Triangle implements IShape{ //export default 주의 
     draw(){
        console.log("Triangle is drawn(external Modue)");
    }
}
