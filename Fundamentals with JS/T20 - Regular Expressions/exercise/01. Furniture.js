function solve(input) {
    console.log(`Bought furniture:`);
    let totalSum = 0;

    for (let line of input) {
        let pattern =
            />>(?<name>[A-Za-z]+)<<(?<price>\d+(?:\.\d+)?)!(?<quantity>\d+)/gm;
        let match = pattern.exec(line);

        if (match !== null) {
            console.log(match.groups["name"]);
            totalSum +=
                Number(match.groups["price"]) * Number(match.groups["quantity"]);
        }
    }
    console.log(`Total money spend: ${totalSum.toFixed(2)}`)
}
solve([">>Sofa<<312.23!3",
    ">>TV<<300!5",
    ">Invalid<<!5",
    "Purchase"]);

solve(['>>Laptop<<312.2323!3',
    '>>TV<<300.21314!5',
    '>Invalid<<!5',
    '>>TV<<300.21314!20',
    '>>Invalid<!5',
    '>>TV<<30.21314!5',
    '>>Invalid<<!!5',
    'Purchase'])