function solve(stringOne, char, stringTwo) {
  let newString = stringOne.replace("_", char);

  if (newString === stringTwo) {
    console.log("Matched");
  } else {
    console.log("Not Matched");
  }
}
solve("Str_ng", "I", "Strong");
solve("Str_ng", "i", "String");

function solve(stringOne, char, stringTwo) {
  let newString = stringOne.replace("_", char);
  let output = newString === stringTwo ? "Matched" : "Not Matched";

  console.log(output);
}
solve("Str_ng", "I", "Strong");
solve("Str_ng", "i", "String");
