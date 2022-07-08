function solve(input) {
    let message = input.shift();
    let line = input.shift();

    while (line != "Decode") {
        let tokens = line.split("|");
        let command = tokens[0];

        switch (command) {
            case "Move": {
                let index = Number(tokens[1]);
                let firstPart = message.substring(0, index);
                let secondPart = message.substring(index);

                message = secondPart + firstPart;
                break;
            }

            case "Insert": {
                let index = Number(tokens[1]);
                let firstPart = message.substring(0, index);
                let secondPart = message.substring(index);
                let value = tokens[2];

                message = firstPart + value + secondPart;
                break;
            }

            case "ChangeAll": {
                let subString = tokens[1];
                let replacement = tokens[2];

                message = message.split(subString).join(replacement);
                break;
            }
        }
        line = input.shift();
    }
    console.log(`The decrypted message is: ${message}`);
}
solve(["zzHe", "ChangeAll|z|l", "Insert|2|o", "Move|3", "Decode",]);