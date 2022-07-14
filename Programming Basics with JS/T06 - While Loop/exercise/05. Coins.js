function coins(input) {
    let changeInCoins = Math.floor(Number(input[0]) * 100);
    let coins = 0;

    while (changeInCoins > 0) {
        if (changeInCoins >= 200) {
            changeInCoins -= 200;
            coins++;
        } else if (changeInCoins >= 100) {
            changeInCoins -= 100;
            coins++;
        } else if (changeInCoins >= 50) {
            changeInCoins -= 50;
            coins++;
        } else if (changeInCoins >= 20) {
            changeInCoins -= 20;
            coins++;
        } else if (changeInCoins >= 10) {
            changeInCoins -= 10;
            coins++;
        } else if (changeInCoins >= 5) {
            changeInCoins -= 5;
            coins++;
        } else if (changeInCoins >= 2) {
            changeInCoins -= 2;
            coins++;
        } else if (changeInCoins >= 1) {
            changeInCoins -= 1;
            coins++;
        }
    }
    console.log(coins);
}
// coins(['1.23']);
// coins(['2']);
// coins(['0.56']);
coins(['2.73']);