function words(input) {
    let i = 0;

    while(input[i] !== 'Stop') {
        console.log(input[i]);
        i++;
    }
}
words(["Nakov",
    "SoftUni",
    "Sofia",
    "Bulgaria",
    "SomeText",
    "Stop",
    "AfterStop",
    "Europe",
    "HelloWorld"]);
words(["Sofia",
    "Berlin",
    "Moscow",
    "Athens",
    "Madrid",
    "London",
    "Paris",
    "Stop",
    "AfterStop"]);