function employees(arr) {
    for (let employeeName of arr) {
        let employeeInfo = {
            name: employeeName,
            personalNum: employeeName.length
        }
        console.log(`Name: ${employeeInfo.name} -- Personal Number: ${employeeInfo.personalNum}`)
    }
}
employees([
    'Silas Butler',
    'Adnaan Buckley',
    'Juan Peterson',
    'Brendan Villarreal']);

console.log("---");

employees([
    'Samuel Jackson',
    'Will Smith',
    'Bruce Willis',
    'Tom Holland']);