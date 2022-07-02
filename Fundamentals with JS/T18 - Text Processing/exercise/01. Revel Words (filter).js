function revealWords(words, sentance) {
    words = words.split(', ');
    sentance = sentance.split(' ');

    for (const iterator of words) {
        sentance.filter(x => {
            if (x === '*'.repeat(iterator.length)) {
                sentance[sentance.indexOf(x)] = iterator;
            }
        });
    }
    console.log(sentance.join(' '));
}
revealWords ("great, learning", "softuni is ***** place for ******** new programming languages");