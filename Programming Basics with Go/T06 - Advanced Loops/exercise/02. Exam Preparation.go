package main

import "fmt"

func main() {
	var poorGradesMaxCount int
	fmt.Scanln(&poorGradesMaxCount)

	var countPoorGrades int = 0
	var countGrades int = 0
	var sumOfGrades int = 0
	var exit bool = false
	var nameOfTask string
	fmt.Scanln(&nameOfTask)
	var lastProblem string = ""

	for nameOfTask != "Enough" {
		var grade int
		fmt.Scanln(&grade)
		if grade <= 4 {
			countPoorGrades++
		}
		if countPoorGrades == poorGradesMaxCount {
			fmt.Printf("You need a break, %d poor grades.", poorGradesMaxCount)
			exit = true
			break
		}
		countGrades++
		sumOfGrades += grade
		lastProblem = nameOfTask
		fmt.Scanln(&nameOfTask)
	}
	
	if !exit {
		var averageGrade float32 = float32(sumOfGrades) / float32(countGrades)
		fmt.Printf("Average score: %.2f\n", averageGrade)
		fmt.Printf("Number of problems: %d\n", countGrades)
		fmt.Printf("Last problem: %s", lastProblem)
	}
}
