function cityInfo(city) { //(cityName, areaKm, populationNum, countryName, postCodeNum)

    let cityEntries = Object.entries(city)
    //let cityEntries

    for (let [cityKey, cityValue] of cityEntries) {
        console.log(`${cityKey} -> ${cityValue}`)
    }

    // let cityInfo = {
    //   name: cityName,
    //   area: areaKm,
    //   population: populationNum,
    //   country: countryName,
    //   postCode: postCodeNum,
    // };
    //
    // for (let key in cityInfo) {
    //   console.log(`${key} -> ${cityInfo[key]}`);
    // }

}
cityInfo({
    name: "Plovdiv",
    area: 389,
    population: 1162358,
    country: "Bulgaria",
    postCode: "4000"})

// cityPrinter("Sofia", "492", "1238438", "Bulgaria", "1000");