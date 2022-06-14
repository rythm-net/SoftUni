function numberChecker(number) {
    let string = "";

    for (let i = 2; i < number; i++) {
        if (number === 2) {
            console.log(`true`);
            break;
        }
        if (number % i === 0) {
            string = "false";
            break;
        } else {
            string = "true";
        }
    }

    console.log(string);
}
numberChecker(8);