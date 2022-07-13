function character(input) {
    let word = input[0];

    for (let i = 0; i < word.length; i++) {
        console.log(word.charAt(i));
    }
}
character(['softuni']);
character(['ice cream']);