package main

import "fmt"

func main () {

	var countEggsFirst, countEggsSecond int
	fmt.Scanln(&countEggsFirst)
	fmt.Scanln(&countEggsSecond)

	//входни данни: "End"  или победител ("one" или "two")
	var input string
	fmt.Scanln(&input)

	//спираме: input == "End"
	//продължаваме: input != "End"

	for input != "End" {
		//input е победител -> "one" или "two"
		//резултат
		if input == "one" {
			countEggsSecond--
		} else if input == "two" {
			countEggsFirst--
		}

		//проверка дали някой е останал без яйца
		if countEggsFirst <= 0 {
			fmt.Printf("Player one is out of eggs. Player two has %d eggs left.", countEggsSecond)
			break
		}

		if countEggsSecond <= 0 {
			fmt.Printf("Player two is out of eggs. Player one has %d eggs left.", countEggsFirst)
			break
		}	

		fmt.Scanln(&input)
	}

	if input == "End" {
		fmt.Printf("Player one has %d eggs left.\n", countEggsFirst)
		fmt.Printf("Player two has %d eggs left.\n", countEggsSecond)
	}




}