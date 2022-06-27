function meetings(input) {
    let result = new Map()

    for (const line of input) {
        let [name, phone] = line.split(' ')
        result.set(name, phone)
    }
}
meetings([
    "Tim 0834212554",
    "Peter 0877547887",
    "Bill 0896543112",
    "Tim 0876566344",]);