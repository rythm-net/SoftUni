package main

import "fmt"

func main0 () {

	var countJury int 
	fmt.Scanln(&countJury)

	//входни данни: "Finish" или презентация
	//спираме: входни дании == "Finish"
	//продължаваме: входни данни != "Finish"

	var input string
	fmt.Scanln(&input)

	var sumAllGrades float32 = 0 //сумата на всички получени оценки
	var countAllGrades int = 0 // брой на всички получени оценки

	for input != "Finish" {
		//input = "Arrays"
		//input e презентация
		var presentation string = input
		var sumGradesPerPresentation float32 = 0 //сума на оценките за презентацията
		//получавам оценка от всеки от журито
		for jury := 1; jury <= countJury; jury++ {
			var grade float32
			fmt.Scanln(&grade)
			//оценките за текущата презентация
			sumGradesPerPresentation += grade
			//общо за всички оценки
			sumAllGrades += grade
			countAllGrades++
		}
		//средна оценка = сбор от оценки / бр. оценки == бр. журито
		var average float32 = sumGradesPerPresentation / float32(countJury)
		fmt.Printf("%s - %.2f.\n", presentation, average)

		fmt.Scanln(&input) //въвеждаме нови входни данни
	}

	//среден оценка от всички презентации = сбор от всички презентации / общ брой оценки
	var averageAll float32 = sumAllGrades / float32(countAllGrades)
	fmt.Printf("Student's final assessment is %.2f.", averageAll)




}