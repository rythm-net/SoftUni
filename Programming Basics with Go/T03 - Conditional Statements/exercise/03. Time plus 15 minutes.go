package main

import "fmt"

func main () {

	//1. входни данни: час и минути
	//2. преобразуваме времето в минути
	//3. добавяме 15 мин
	//4. преобразуваме времето в часове: минути
	//5. отпечатам -> часове:минути

	var currentHour, currentMinutes int
	fmt.Scanln(&currentHour) //23
	fmt.Scanln(&currentMinutes) //59

	var currentTimeInMinutes int = currentHour * 60 + currentMinutes // 23h 59min = 1439min
	var additionalTime int = currentTimeInMinutes + 15 //1439 + 15 = 1454min

	var finalHour int = additionalTime / 60  //1454 / 60 = 24
	var finalMinutes int = additionalTime % 60 //1454 / 60 = 24 (ост.14)

	if (finalHour == 24) {
		finalHour = 0
	}

	fmt.Printf("%d:%02d", finalHour, finalMinutes)

}