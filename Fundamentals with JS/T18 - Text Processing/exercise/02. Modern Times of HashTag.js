function solve(str) {
    let arr = [];

    for (let element of str.split(" ")) {
        if (element[0] === "#" && element.lenght !== 1) {
            arr.push(element.substring(1));
        }
    }
    let helpArr = [];

    for (let words of arr) {
        let array = words.split("");
        let flag = true;

        for (let i = 0; i < array.length; i++) {
            let chars = array[i].charCodeAt(0);

            if ((chars < 65 || chars > 90) && (chars < 97 || chars > 122)) {
                flag = false;
            }
        }
        if (flag) {
            helpArr.push(words);
        }
    }
    console.log(helpArr.join("\n").trim());
}
solve("Nowadays everyone uses # to tag a #special word in #socialMedia45");