function calculate_discount(price, rate) {
    if (rate === void 0) { rate = 0.50; }
    var discount = price * rate;
    console.log("discount Amount: " + discount);
}
calculate_discount(1000); //기본 파라미터
calculate_discount(1000, 0.3);
