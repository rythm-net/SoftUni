function reversedChars(a, b, c) {
  let string = a + b + c;
  let reverse = "";

  for (let i = string.length - 1; i >= 0; i--) {
    reverse += string[i] + " ";
  }
  console.log(reverse);
}
reversedChars("A", "B", "C");
