function words(array){
    let mapped = new Map();

    for (let word of array) {
        let currentWord = word

        if(mapped.has(currentWord)){
            let sum = mapped.get(currentWord) + 1
            mapped.set(currentWord, sum)
        } else {
            mapped.set(currentWord, 1)
        }
    }

    let sorted = Array.from(mapped.entries()).
    sort((a, b) => b[1] - a[1])

    for (let currentWord of sorted) {
        console.log(`${currentWord[0]} -> ${currentWord[1]} times`);

    }
}
words(["Here", "is", "the", "first", "sentence", "Here", "is",
    "another", "sentence", "And", "finally", "the", "third", "sentence"])