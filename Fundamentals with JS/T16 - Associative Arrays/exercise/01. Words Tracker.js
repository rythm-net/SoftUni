function mapWordsTracker(data) {
    function mapGenerator(str) {
        let arr = str.split(' ');
        return arr.reduce((a, b) => {
            a.set(b, 0);
            return a;
        }, new Map());
    }

    function mapWordsCounterTuples(map, arr) {
        for (const e of arr) {
            if (map.has(e)) {
                map.set(e, map.get(e) + 1);
            }
        }
        return Array.from(map);
    }

    function sortByCount(arrOfTuples) {
        return arrOfTuples.sort((a, b) => b[1] - a[1]);
    }

    function outputParse(arrOfTuples) {
        return arrOfTuples.map(([k, v] = e) => `${k} - ${v}`).join('\n')
    }
    return outputParse(sortByCount(mapWordsCounterTuples(mapGenerator(data[0]), data.slice(1))));
}