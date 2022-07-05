function solve(input) {
    let pattern = /(?<stringToRepeat>[^0-9]+)(?<count>[0-9]+)/g;
    let result = '';
    let uniqueSymbolsSet = new Set();

    while((array1 = pattern.exec(input)) !== null) {
        let stringToRep = array1.groups.stringToRepeat.toUpperCase();
        let count = array1.groups.count;

        for(let i = 0; i < count; i++){
            result+=stringToRep;
        }

        for (const char of stringToRep) {
            uniqueSymbolsSet.add(char);
        }
    }
    console.log(`Unique symbols used: ${uniqueSymbolsSet.size}`);
    console.log(result);
}