function basketballEq(input){
    let priceOfTraining = Number(input[0]);
    let shoes = (priceOfTraining * 0.60);
    let dress = (shoes * 0.80);
    let ball = (dress * (1 / 4));
    let accesories = (ball * (1 / 5));
    let totalCost = (priceOfTraining + shoes + dress + ball + accesories);

    console.log(totalCost);
}
// basketballEq([365]);
basketballEq([550]);