function biggestNumbers(n1, n2, n3) {
    let maxNumb = Number.MIN_SAFE_INTEGER;

    if (n1 > n2 && n1 > n3) {
        maxNumb = n1;
    } else if (n2 > n1 && n2 > n3) {
        maxNumb = n2;
    } else {
        maxNumb = n3;
    }
    console.log(maxNumb);
}
biggestNumbers(10, 7, 3);