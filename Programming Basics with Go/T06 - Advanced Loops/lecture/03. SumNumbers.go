package main

import "fmt"

func main () {
	var firstNumber int = 20
	fmt.Scanln(&firstNumber) //първоначално число

	//повтаряме: въвеждаме число + сумираме
	//стоп: сума >= пърначалното число
	//продължавме: сума < първоначално число

	var sum int = 0 //сума на числата

	for sum < firstNumber {
		var number int
		fmt.Scanln(&number)

		sum += number
	}

	//sum >= firstNumber
	fmt.Print(sum)

}
