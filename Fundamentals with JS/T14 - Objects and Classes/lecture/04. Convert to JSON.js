function objToJson(name, lastName, hairColor) {
    let object = {
        name,
        lastName,
        hairColor
    };

    let result = JSON.stringify(object);

    console.log(result);
}
objToJson("George", "Jones", "Brown");
objToJson("Peter", "Smith", "Blond");