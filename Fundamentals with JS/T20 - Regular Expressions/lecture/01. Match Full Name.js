function solve(input) {
    let pattern = /\b[A-Z][a-z]+ [A-Z][a-z]+\b/g;
    let result = [];
    let match = pattern.exec(input);

    while (match != null) {
        result.push(match[0]);
        match = pattern.exec(input);
    }
    console.log(result.join(' '));
}