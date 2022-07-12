function dogFood(input){
    let dogFoodPrice = 2.50;
    let catFoodPrice = 4.00;
    let countDogF = (input[0]);
    let countCatF = (input[1]);
    let totalPrice = dogFoodPrice * countDogF + catFoodPrice * countCatF;

    console.log(totalPrice);
}
dogFood([5, 4]);