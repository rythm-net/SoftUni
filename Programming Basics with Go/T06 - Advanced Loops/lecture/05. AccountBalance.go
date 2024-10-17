package main

import (
	"fmt"
	"strconv"
)

func main () {
	//входни данни (текст): "NoMoreMoney" или сума ("5.51")
	//стоп: входни данни == "NoMoreMoney"
	//продължавам: входни данни != "NoMoreMoney"

	var bankAccount float32 = 0 //пари в сметката
	
	var input string  //входни данни
 	fmt.Scanln(&input)

	for input != "NoMoreMoney" {
		//input e сума за внасяне ("5.56")
		//input = "23.45" -> дробно число 23.45
		sum, _ := strconv.ParseFloat(input, 32) //сума за внасяне в сметката

		// >= 0
		if sum >= 0 {
			bankAccount += float32(sum)
			fmt.Printf("Increase: %.2f\n", sum)
		} else {
			//sum < 0
			fmt.Println("Invalid operation!")
			break
		}
		fmt.Scanln(&input)
	}

	fmt.Printf("Total: %.2f", bankAccount)
/*120
45.55
-150*/

}