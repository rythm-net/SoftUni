function serializeString(arr) {
    let string = arr[0];
    let container = {};

    for (let i = 0; i < string.length; i++) {
        if (container.hasOwnProperty(string[i]) == false) {
            container[string[i]] = [];
        }
        container[string[i]].push(i);
    }
    let entries = Object.entries(container);

    for (let [key, value] of entries) {
        console.log(`${key}:${value.join('/')}`);
    }
}
serializeString(["abababa"]);