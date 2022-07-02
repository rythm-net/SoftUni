function passwordGenerator(array) {
    let password = array[0].concat(array[1]);
    let word = array[2].toUpperCase();

    const checker = ["a", "e", "i", "o", "u"];
    let count = 0;

    for (let i = 0; i < password.length; i++) {
        if (checker.includes(password[i])) {
            password = password.replace(password[i], word[count]);
            count++;
            if (count >= word.length) {
                count = 0;
            }
        }
    }
    password = password.split(``).reverse().join(``);

    console.log(`Your generated password is ${password}`);
}
passwordGenerator(["ilovepizza", "ihatevegetables", "orange"]);
//expected output: sElbGtNgAvRtOhEGzzNpAvRlO

passwordGenerator(["easymoneyeazylife", "atleasttencharacters", "absolute"]);
//expected output: srTtcUrLhcnOttsSBltAEfTlyzULyOnSmysBA

passwordGenerator(["areyousureaboutthisone", "notquitebutitrustyou", "disturbed",]);
//expected output: SIytsDrtDtEbBtRUqtTnSnIsDhttDEbBRrUsTSyIrD