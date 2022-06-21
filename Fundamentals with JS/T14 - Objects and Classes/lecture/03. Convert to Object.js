function  jsonToObj(objAsString) {
    let object = JSON.parse(objAsString)

    for (let key of Object.keys(object)) {
        console.log(`${key}: ${object[key]}`)
    }
}
jsonToObj ('{"name": "George", "age": 40, "town": "Sofia"}')
jsonToObj ('{"name": "Peter", "age": 35, "town": "Plovdiv"}')