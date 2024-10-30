package main


import "fmt"

func main () {
	var days int
	fmt.Scanln(&days)

	var totalFood float32 //общо количество налична храна
	fmt.Scanln(&totalFood)

	var totalEatenBiscuits float32 = 0 //количество изядени бискивити
	var totalEatenFood float32 = 0 //количество изядена храна от двете животни за всички дни
	var totalEatenDog float32 = 0 //количество изядено от кучето за всички дни
	var totalEatenCat float32 = 0 //количество изядено от котката за всички дни

	//всеки един ден
	for day := 1; day <= days; day++ {
		var eatenDog int
		fmt.Scanln(&eatenDog)
		totalEatenDog += float32(eatenDog)

		var eatenCat int
		fmt.Scanln(&eatenCat)
		totalEatenCat += float32(eatenCat)

		var totalGramsPerDay float32 = float32(eatenCat) + float32(eatenDog)
		totalEatenFood += totalGramsPerDay

		//дали съм на третия ден
		if day % 3 == 0 {
			//получават бисквита
			var biscuitGrams float32 = 0.10 * totalGramsPerDay
			totalEatenBiscuits += biscuitGrams
		}
	}


	fmt.Printf("Total eaten biscuits: %.0fgr.\n", totalEatenBiscuits)

	var percentEatenFood float32 = totalEatenFood / totalFood * 100.0
	fmt.Printf("%.2f%% of the food has been eaten.\n", percentEatenFood)

	var percentEatenDog float32 = totalEatenDog / totalEatenFood * 100.0
	fmt.Printf("%.2f%% eaten from the dog.\n", percentEatenDog)

	var percentEatenCat float32 = totalEatenCat / totalEatenFood * 100.0
	fmt.Printf("%.2f%% eaten from the cat.\n", percentEatenCat)

}