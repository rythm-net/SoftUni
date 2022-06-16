function palindromeIntegers(arr) {
    for (let i = 0; i < arr.length; i++) {
        let reverseNum = (arr[i]).toString().split("").reverse().join("");
        let result = arr[i] == reverseNum ? 'true' : 'false';

        console.log(result);
    }
}
palindromeIntegers([123, 323, 421, 121]);
palindromeIntegers([32, 2, 232, 1010]);