function calculate_discount(price:number, rate:number=0.50) {
  var discount=price*rate;
  console.log("discount Amount: "+discount);
}

calculate_discount(1000);//기본 파라미터
calculate_discount(1000,0.3);