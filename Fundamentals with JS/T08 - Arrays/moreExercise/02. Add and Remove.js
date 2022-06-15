function addAndRemove(array) {
    let newArray = [];
    let numbers = 0;

    for (let i = 0; i < array.length; i++) {
        numbers++;
        if (array[i] == "add") {
            newArray.push(numbers);
        } else {
            newArray.pop();
        }
    }

    if (newArray.length > 0) {
        console.log(newArray.join(" "));
    } else {
        console.log("Empty");
    }
}
addAndRemove(["add", "add", "add", "add"]);
addAndRemove(["add", "add", "remove", "add", "add"]);
addAndRemove(["remove", "remove", "remove"]);