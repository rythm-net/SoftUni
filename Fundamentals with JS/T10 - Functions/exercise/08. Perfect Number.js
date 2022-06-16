function perfectNumber(n) {
    let sequens = 0;

    for (let i = 1; i <= n / 2; i++) {
        if (n % i === 0) {
            sequens += i;
        }
    }

    if (sequens === n && sequens !== 0) {
        console.log("We have a perfect number!");
    }
    else {
        console.log("It's not so perfect.");
    }
}
perfectNumber(6)
perfectNumber(28)
perfectNumber(1236498)