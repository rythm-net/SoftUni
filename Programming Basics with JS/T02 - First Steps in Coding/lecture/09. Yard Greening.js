function yardGreening(input) {
    let sqM = (input[0]);
    let pricePerSqM = 7.61;
    let discountFromPrice = 18 / 100;
    let totalPrice = sqM * pricePerSqM;
    let totalDiscount = totalPrice * discountFromPrice;
    let finalPrice = totalPrice - totalDiscount;

    console.log("The final price is: " + finalPrice + " lv.");
    console.log("The discount is: " + totalDiscount + " lv.");
}
yardGreening([550]);