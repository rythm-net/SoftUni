package main

import "fmt"

func main () {

	//повтаряме: четем входни данни -> отпечатваме входни данни
	//спираме: входни данни == "Stop"
	//продължаваме: входни данни != "Stop"
	//for с едно условие

	var input string //входни данни
	fmt.Scanln(&input)

	for input != "Stop" {
		fmt.Println(input)
		fmt.Scanln(&input)
	}
}

