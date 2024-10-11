package main

import "fmt"
import "math"

func main () {
	//1. входни данни -> име на сериал; време на епизода; време на обедна почивка
	//2. време за обяд = 1 / 8 от време на обедна почивка
	//3. време за отдих = 1 / 4 от  време на обедна почивка
	//4. оставащо време за сериал = обедна почивка - (време за обяд + време за отдих)
	//обедна почивка -> време за обяд + време за отдих + време за сериал
	//5. проверка дали в оставащото време за сериал ще изгледам епизода

	var seriesName string
	fmt.Scanln(&seriesName) //You

	var episodeDuration int
	fmt.Scanln(&episodeDuration) //60

	var totalTimeBreak int
	fmt.Scanln(&totalTimeBreak) //96

	var timeLunch float32 = float32(totalTimeBreak) / 8.0 // 96.0 / 8.0 = 12.0
	var timeRest float32 = float32(totalTimeBreak) / 4.0  // 96.0 / 4.0 = 24.0
	var timeSeries float32 = float32(totalTimeBreak) - timeLunch - timeRest; //96.0 - 12.0 - 24.0 = 60.0

	//1. ако време стига
	if timeSeries >= float32(episodeDuration) {
		var leftTime float32 = timeSeries - float32(episodeDuration) 
		fmt.Printf("You have enough time to watch %s and left with %.0f minutes free time.", seriesName, math.Ceil(float64(leftTime)))
	} else {
		//timeSeries < епизода
		var needTime float32 = float32(episodeDuration) - timeSeries 
		fmt.Printf("You don't have enough time to watch %s, you need %.0f more minutes.", seriesName, math.Ceil(float64(needTime)))
	}


}