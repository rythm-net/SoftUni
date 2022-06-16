function numberModification(number) {
    let numbInString = String(number);
    let numb = 0;

    for (let i = 0; i < 6; i++) {
        let count = 1;
        numb = Number(numbInString[0]);
        for (let j = 1; j < numbInString.length; j++) {
            numb += Number(numbInString[j]);
            count++;
        }
        if (numb / count < 5) {
            numbInString += "9";
        } else {
            break;
        }
    }
    console.log(numbInString);
}
numberModification(5835);