package main

import (
	"fmt"
	"math"
	"strconv"
)

func main1 () {

	var width, lenght int 
	fmt.Scanln(&width) //широчина на тортата
	fmt.Scanln(&lenght) //дължина на тортата
	//бр парчета = лице на тортата = широчина * дължина
	var pieces int = width * lenght

	//входни данни (текст): "STOP" или взети бр. парчета ("34")
	//спираме: входни данни == "STOP"
	//продължаваме: входни данни != "STOP"
	var input string
	fmt.Scanln(&input)

	for input != "STOP" {
		//взети бр. парчета ("34")
		//input = "34"
		takenPieces, _ := strconv.Atoi(input) //колко парчета са взети

		//взима парчетата от тортата
		pieces -= takenPieces

		//проверяваме дали имаме останали парчета
		if pieces <= 0 {
			//тортата свършва
			fmt.Printf("No more cake left! You need %.0f pieces more.", math.Abs(float64(pieces)))
			break
		} 

		fmt.Scanln(&input)

	}

	if input == "STOP" {
		fmt.Printf("%d pieces are left.", pieces)
	}
}