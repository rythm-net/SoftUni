package main

import "fmt"

func main () {
	var number int
	fmt.Scanln(&number)

	//валидно ->  [100…200] или е 0 -> print нищо
	//невалидно ->                  -> print invalid
	var isValid bool = (number >= 100 && number <= 200) || (number == 0)
	//isValid = true -> валидно
	//isValid = false -> невалидно
	if !isValid {
		fmt.Print("invalid")
	}
}