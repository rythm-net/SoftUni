function loadingBar(n) {
    let arr = new Array(10)
    arr.fill(".")

    for (let i = 0; i < n / 10; i++) {
        arr.pop()
        arr.unshift(`%`)
    }
    if (n != 100) {
        console.log(`${n}% [${arr.join("")}]`);
        console.log(`Still loading...`);
    } else {
        console.log(`100% Complete!`)
        console.log(arr.join(""));

    }
}
loadingBar(30);
loadingBar(50);
loadingBar(100);