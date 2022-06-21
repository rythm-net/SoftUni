function printPersonInfo(fn, ln, a) {

    // First solution:
    // let personInfo = {
    //     firstName: fn,
    //     lastName: ln,
    //     age: a,
    // };
    // return personInfo;

    // Second solution:
    // let personInfo = {}
    //     personInfo.firstName = fn;
    //     personInfo.lastName = ln;
    //     personInfo.age = a;
    // return personInfo;

    // Third solution:
    let personInfo = {};
        personInfo["firstName"] = fn;
        personInfo["lastName"] = ln;
        personInfo["age"] = a;
    return personInfo;

    // for (let key in personInfo) {
    //   console.log(`${key}: ${personInfo[key]}`);
    // }

}
console.log(printPersonInfo("Peter", "Pan", "20"));