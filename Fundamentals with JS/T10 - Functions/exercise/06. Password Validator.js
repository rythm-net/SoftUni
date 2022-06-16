function passwordValidator(password) {
    function isLengthEnough(password) {
        return password.length >= 6 && password.length <= 10;
    }

    function isLettersAndDigits(password) {
        for (let i = 0; i < password.length; i++) {
            let currentChar = password[i].charCodeAt(0);
            if (
                !(currentChar >= 65 && currentChar <= 90) &&
                !(currentChar >= 97 && currentChar <= 122) &&
                !(currentChar >= 48 && currentChar <= 57)
            ) {
                return false;
            }
        }
        return true;
    }

    function isTwoDigits(password) {
        let counter = 0;
        for (let i = 0; i < password.length; i++) {
            let currentChar = password[i].charCodeAt(0)
            if (currentChar >= 48 && currentChar <= 57) {
                counter++;
            }
        }
        return counter >= 2 ? true : false;
    }

    let isLengthValid = isLengthEnough(password);
    let isOnlyLettersAndDigits = isLettersAndDigits(password);
    let isAtLeastwoNumbers = isTwoDigits(password);

    if (isLengthValid && isOnlyLettersAndDigits && isAtLeastwoNumbers) {
        console.log("Password is valid");
    }
    if (!isLengthValid) {
        console.log("Password must be between 6 and 10 characters");
    }
    if (!isOnlyLettersAndDigits) {
        console.log("Password must consist only of letters and digits");
    }
    if (!isAtLeastwoNumbers) {
        console.log("Password must have at least 2 digits");
    }
}
passwordValidator('logIn');
console.log('---');
passwordValidator('MyPass123');
console.log('---');
passwordValidator('Pa$s$s');