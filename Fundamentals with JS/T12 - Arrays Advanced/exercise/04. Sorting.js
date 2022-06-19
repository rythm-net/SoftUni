function sorting(array) {
    let myArray = [];

    while (array.length > 0) {
        myArray.push(biggest(array), smallest(array));
    }

    console.log(myArray.join(" "));

    function biggest(array) {
        let number = Number.MIN_SAFE_INTEGER;

        for (let index of array) {
            if (index > number) {
                number = index;
            }
        }
        let i = array.indexOf(number);
        array.splice(i, 1);
        return number;
    }

    function smallest(array) {
        let numb = Number.MAX_SAFE_INTEGER;

        for (let index of array) {
            if (numb > index) {
                numb = index;
            }
        }
        let i = array.indexOf(numb);
        array.splice(i, 1);
        return numb;
    }
}

function sorting(input) {
    let result = [];
    let array = input.sort((a, b) => a - b);

    while (array.length !== 0) {
        result.push(array[array.length - 1]) && array.pop();
        result.push(array[0]) && array.shift();
    }
    console.log(result.join(" "));
}
sorting([34, 2, 32, 45, 690, 6, 32, 7, 19, 47]);