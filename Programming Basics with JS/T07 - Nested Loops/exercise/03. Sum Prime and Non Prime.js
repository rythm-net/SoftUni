function sumPrimeNonPrime(input) {
    let command = input.shift();
    let primeSum = 0;
    let nonPrimeSum = 0;

    while (command !== "stop") {
        let num = Number(command);
        let prime = true;

        for(let i = 2; i <= Math.sqrt(num); i++) {
            if (num % i === 0 && num > 2){
                prime = false;
                break;
            }
        }

        if (num < 0) {
            console.log("Number is negative.");
        } else if (prime && num >= 2) {
            primeSum += num;
        } else {
            nonPrimeSum += num;
        }
        command = input.shift();
    }
    console.log(`Sum of all prime numbers is: ${primeSum}`);
    console.log(`Sum of all non prime numbers is: ${nonPrimeSum}`);
}
sumPrimeNonPrime(["3", "9", "0", "7", "19", "4", "stop"]);