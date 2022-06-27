function guestListMapTracker(arr) {
    function mapGenerator(arr) {
        let map = new Map();
        map.set('vip', []);
        map.set('regular', []);

        for (const e of arr) {
            if (e != 'PARTY') {
                if (isNaN(e[0]) == false) {
                    map.set('vip', map.get('vip').concat(e));
                } else {
                    map.set('regular', map.get('regular').concat(e));
                }
            } else {
                break;
            }
        }
        return map;
    }

    function mapManipulator(map, arr) {
        for (const e of arr.slice(arr.indexOf("PARTY") + 1)) {
            if (isNaN(e[0]) == false) {
                let vips = map.get('vip')
                vips.splice(vips.indexOf(e), 1)
                map.set('vip', vips);
            } else {
                let reg = map.get('regular');
                reg.splice(reg.indexOf(e), 1);
                map.set('regular', reg);
            }
        }
        return map;
    }

    function outputParse(map) {
        let r = `${Array.from(map.values()).reduce((a, b) => a + b.length, 0)}\n`;
        for (const kvp of map) {
            r += `${kvp[1].join('\n')}\n`;
        }
        return r;
    }
    return outputParse(mapManipulator(mapGenerator(arr), arr));
}