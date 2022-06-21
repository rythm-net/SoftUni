function solve(input) {
    let finalResult = {}

    for (let tokens of input) {
        let [town, latitude, longitude] = tokens.split(' | ')
        finalResult.name= town;
        finalResult.latitude = Number(latitude).toFixed(2);
        finalResult.longitude = Number(longitude).toFixed(2)
        console.log(finalResult)
    }
}
solve(["Sofia | 42.696552 | 23.32601", "Beijing | 39.913818 | 116.363625"]);