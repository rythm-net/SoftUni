function censoredWords(text, word) {
    let censored = '';

    for (let letter of word) {
        letter = '*';
        censored += letter;
    }
    console.log(text.split(word).join(censored));
}
censoredWords('A small sentence with some words', 'small');
censoredWords('Find the hidden word', 'hidden');