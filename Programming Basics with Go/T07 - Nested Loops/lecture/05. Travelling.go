package main


import "fmt"


func main6 () {
	//входни данни: "End" или дестинация
	//спираме: входни данни == "End"
	//продължавам: входни данни != "End"

	var input string
	fmt.Scanln(&input)

	for input != "End" {
		//input = дестинация
		var needMoney float32
		fmt.Scanln(&needMoney) //нужни пари, за да отида на дестинация

		//повтарям: събирам пари (въвеждане на суми и ги сумирам)
		//спирам: събрани пари >= нужни пари
		//продължавам: събрани пари < нужни пари

		var savedMoney float32 = 0 //събрани пари
		for savedMoney < needMoney {
			var money float32
			fmt.Scanln(&money) //спестена сума

			savedMoney += money
		}
		//спестени пари >= нужни пари -> отивам на екскурзия
		fmt.Printf("Going to %s!\n", input)

		fmt.Scanln(&input)
	}
}

