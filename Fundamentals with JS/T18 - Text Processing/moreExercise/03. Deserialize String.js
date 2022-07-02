function deserializeString(arr) {
    let result = [];

    for (let curr of arr) {
        if (curr == "end") {
            break;
        }
        let [char, rest] = curr.split(":");
        let indexes = rest.split("/");

        for (let index of indexes) {
            index = Number(index);
            result[index] = char;
        }
    }
    console.log(result.join(""));
}
deserializeString([
    "a:0/3/5/11",
    "v:1/4",
    "j:2",
    "m:6/9/15",
    "s:7/13",
    "d:8/14",
    "c:10",
    "l:12",
    "end",
]);