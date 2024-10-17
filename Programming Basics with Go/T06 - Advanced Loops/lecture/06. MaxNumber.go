package main

import (
	"fmt"
	"math"
	"strconv"
)

func main() {

	var min int = math.MaxInt32 //минималното число
	//повтаряме: число  -> проверка дали е максимум
	//спираме: входни данни == "Stop"
	//продължаваме: входни данни != "Stop"
	//входни данни (текст): "Stop" или число под формата на текст ("199")
	var input string
	fmt.Scanln(&input)

	for input != "Stop" {
		//input e число под формата на текст ("199")
		//1. input = "199" -> цяло число = 199
		//преобразувание от текст към число
		number, _ := strconv.Atoi(input)
		//2. проверка дали цяло число е мин
		if number < min {
			min = number
		}

		fmt.Scanln(&input)
	}

	fmt.Print(min)

}

