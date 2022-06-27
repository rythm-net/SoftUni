function solve(data) {
    const powerMap = {
        1: 1, 2: 2, 3: 3, 4: 4, 5: 5, 6: 6, 7: 7, 8: 8, 9: 9, 10: 10, 'J': 11, 'Q': 12, 'K': 13, 'A': 14
    }

    const typeMap = {
        S: 4, H: 3, D: 2, C: 1
    }

    let cardPowerConverter = e => {
        let splitted = e.split('');
        let p = splitted.slice(0, splitted.length - 1).join('');
        let t = splitted.slice(-1).join('');
        return e = powerMap[p] * typeMap[t];
    }

    let pointsCalc = e => {
        e[1] = [...e[1]]
            .map(cardPowerConverter)
            .reduce((a, b) => a + b);
        return e;
    }

    function objGenerator(b, a) {
        let [name, cards] = b.split(': ');
        cards = cards.split(', ');

        if (!a.hasOwnProperty(name)) {
            a[name] = new Set();
        }
        cards.forEach(card => a[name].add(card));
        return a;
    }

    return Object.entries(data.reduce((a, b) => {
        return objGenerator(b, a);}, {})).map(pointsCalc).map(e => e.join(': ')).join('\n');
}