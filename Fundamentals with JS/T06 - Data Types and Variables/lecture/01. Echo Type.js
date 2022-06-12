function solve(input) {
  let ourText = input;

  console.log(typeof ourText);

  if (typeof ourText === "string" || typeof ourText === "number") {
    console.log(ourText);
  } else {
    console.log("Parameter is not suitable for printing");
  }
}

solve(18);
