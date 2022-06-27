function parkingTracker(data) {
    function objGenerator(data) {
        return data.reduce((a, b) => {
            let [dir, x] = b.split(', ');
            if (dir == "IN") {
                a[x] = 0;
            } else {
                delete a[x];
            }
            return a;
        }, {});
    }

    let parkingLot = objGenerator(data);
    const sortByNumber = (a, b) => a.localeCompare(b)

    function outputParse(obj, sort) {
        if (Object.entries(obj).length == 0) {
            return 'Parking Lot is Empty';
        }
        return Object.keys(obj).sort(sort).join('\n');
    }
    return outputParse(parkingLot, sortByNumber);
}