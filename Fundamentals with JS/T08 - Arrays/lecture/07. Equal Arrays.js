function solve(arr1, arr2) {
    for (let i = 0; i < arr1.length; i++) {
        arr1[i] = Number(arr1[i]);
    }

    for (i = 0; i < arr2.length; i++) {
        arr2[i] = Number(arr2[i])
    }

    let sum = 0;
    let areEqual = true;
    let diff = 0;

    for (i = 0; i < arr1.length; i++) {
        sum += arr1[i]
        if (arr1[i] !== arr2[i]) {
            diff = i
            areEqual = false;
            break;
        } else {
            areEqual = true;

        }
    }

    if (areEqual) {
        console.log(`Arrays are identical. Sum: ${sum}`);
    } else {
        console.log(`Arrays are not identical. Found difference at ${diff} index`)
    }
}
solve(['10','20','30'], ['10','20','30']);