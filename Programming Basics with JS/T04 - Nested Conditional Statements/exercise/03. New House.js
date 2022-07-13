function newHome(input) {
    let typeOfFlower = input[0];
    let countOfFlowers = Number(input[1]);
    let budget = Number(input[2]);
    let price = 0;


    switch (typeOfFlower) {
        case "Roses": price = countOfFlowers * 5.00;
            if(countOfFlowers > 80){
                price = price * 0.90;
            }
            break;

        case "Dahlias": price = countOfFlowers * 3.80;
            if(countOfFlowers > 90){
                price = price * 0.85;
            }
            break;

        case "Tulips": price = countOfFlowers * 2.80;
            if(countOfFlowers > 80){
                price = price * 0.85;
            }
            break;

        case "Narcissus": price = countOfFlowers * 3.00;
            if(countOfFlowers < 120){
                price = price * 1.15;
            }
            break;

        case "Gladiolus": price = countOfFlowers * 2.50;
            if(countOfFlowers < 80){
                price = price * 1.20;
            }
            break;
    }
    let diff = Math.abs(price - budget);

    if (budget >= price) {
        console.log(`Hey, you have a great garden with ${countOfFlowers} ${typeOfFlower} and ${diff.toFixed(2)} leva left.`)
    } else {
        console.log(`Not enough money, you need ${diff.toFixed(2)} leva more.`)
    }
}
newHome(["Roses", "55", "250000"]);