// function solve(text, word) {
//   let tokens = text.split(" ");
//   let count = tokens.filter((x) => x==word);

//   console.log(count.length);
// }
// solve("This is a word and it also is a sentence", "is");

(text, word) => text.split(' ').filter(x=>x==word).length
solve("This is a word and it also is a sentence", "is");