function bookShelf(input) {
    let shelvesList = new Map();
    let bookList = new Map();

    for (const line of input) {

        if (line.includes('->')) {
            let [id, genre] = line.split('->').map(str => str.trim());

            if (![...shelvesList.values()].includes(id)) {
                shelvesList.set(genre, id);
                bookList.set(genre, []);
            }

        } else {
            let [bookTitle, bookAuthor, genre] = line.split(/[:,]+/).map(str => str.trim());

            if (bookList.has(genre)) {
                bookList.get(genre).push({bookTitle: bookTitle, bookAuthor: bookAuthor});
            }
        }
    }

    [...bookList.entries()].sort((a, b) => b[1].length - a[1].length).forEach((shelf) => {
        let [genre, books] = shelf;
        books.sort((a, b) => a.bookTitle.localeCompare(b.bookTitle));
        console.log(`${shelvesList.get(genre)} ${genre}: ${books.length}`);

        for (const book of books) {
            console.log(`--> ${book.bookTitle}: ${book.bookAuthor}`);
        }
    });
}