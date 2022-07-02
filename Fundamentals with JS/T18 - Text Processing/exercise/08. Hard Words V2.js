function solve(arrData) {
    let text = arrData.shift().split(" ")
    let words = arrData.shift()

    for (let i = 0; i < text.length; i++) {
        for (let word of words) {
            let spaces = '_'.repeat(word.length)

            if (text[i].includes('_')) {
                if (text[i].includes(',')) {
                    let token = text[i].split(',')
                    if(token[0].length === spaces.length) {
                        text[i] = word + ','
                    }

                } else if(text[i].includes('.')) {
                    let token = text[i].split('.')
                    if(token[0].length === spaces.length) {
                        text[i] = word + '.'
                    }

                } else {
                    if(text[i].length === spaces.length) {
                        text[i] = word
                    }
                }
            }
        }
    }
    console.log(text.join(" "))
}
solve([
    "Hi, grandma! I'm so ____ to write to you. ______ the winter vacation, so _______ things happened. My dad bought me a sled. Mom started a new job as a __________. My brother's ankle is ________, and now it bothers me even more. Every night Mom cooks ___ on your recipe because it is the most delicious. I hope this year Santa will _____ me a robot.",
    ["pie", "bring", "glad", "During", "amazing", "pharmacist", "sprained"],]);