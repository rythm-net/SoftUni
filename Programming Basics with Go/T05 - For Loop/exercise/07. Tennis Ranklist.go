package main

import "fmt"

func main() {
	var tournaments, startPoints int
	fmt.Scanln(&tournaments)
	fmt.Scanln(&startPoints)

	var points int = 0
	var wins int = 0
	for i := 1; i <= tournaments; i++ {
		var place string
		fmt.Scanln(&place)
		switch place {
		case "W":
			points += 2000
			wins++
			break
		case "F":
			points += 1200
			break
		case "SF":
			points += 720
			break
		}
	}
	var allPoints int = startPoints + points
	var averagePoints int = points / tournaments
	var percentWins float32 = float32(wins) * 100 / float32(tournaments)

	fmt.Printf("Final points: %d\n", allPoints)
	fmt.Printf("Average points: %d\n", averagePoints)
	fmt.Printf("%.2f%%", percentWins)
}
