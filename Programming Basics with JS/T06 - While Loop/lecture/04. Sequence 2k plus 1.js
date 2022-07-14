function sequence(input) {
    let number = Number(input[0]);
    let counter = 1;

    while (counter <= number) {
        console.log(counter);
        counter = 2 * counter + 1;
    }
}
sequence(['3']);
sequence(['8']);
sequence(['17']);
sequence(['31']);