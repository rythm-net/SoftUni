function solve(input) {
    const regEx = /(\s|^)(?<email>(?<user>[0-9a-zA-Z][.\-_0-9a-zA-Z]*[0-9a-zA-Z])@(?<host>([a-zA-Z]+(-+[a-zA-Z]+)?)\.([a-zA-Z]+(-+[a-zA-Z]+)?)(\.([a-zA-Z]+(-+[a-zA-Z]+)?))?))/g
    let emails = [];
    let result = regEx.exec(input);

    while (result !== null) {
        emails.push(result.groups.email);
        result = regEx.exec(input);
    }

    for (const email of emails) {
        console.log(email);
    }
}