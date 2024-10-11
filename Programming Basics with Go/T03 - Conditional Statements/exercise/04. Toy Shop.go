package main

import "fmt"

func main () {
	//1. входни данни - цена за екскурзия, брой пъзели, брой кукли, брой мечета, брой миньони, брой камиони
	//2. общ приход от играчките = (бр. пъзели * 2.60) + (бр. кукли * 3) + (бр. мечета * 4.10) + (бр. миньони * 8.20) + (бр. камиони * 2)
	//3. общ брой играчки = брой пъзели + брой кукли + брой мечета + брой миньони + брой камиони
	//4. ако общ брой играчки >= 50 -> общ приход от играчките - 25%
	//5. наем = 10 % от общ приход от играчките
	//6. крайна сума = общ приход от играчките - наем
	//7. проверка дали крайната сума ще покрие екскурзията

	var tripPrice float32
	fmt.Scanln(&tripPrice) //40.80

	var puzzlesCount, dollsCount, bearsCount, minionsCount, trucksCount int
	fmt.Scanln(&puzzlesCount) //20
	fmt.Scanln(&dollsCount) //25
	fmt.Scanln(&bearsCount) //30
	fmt.Scanln(&minionsCount) //50
	fmt.Scanln(&trucksCount) //10

	var profit float32 = (float32(puzzlesCount) * 2.60) + (float32(dollsCount) * 3.00) + (float32(bearsCount) * 4.10) + (float32(minionsCount) * 8.20) + (float32(trucksCount) * 2.00) //680
	var countToys int = puzzlesCount + dollsCount + bearsCount + minionsCount + trucksCount //135

	if countToys >= 50 {
		profit = profit - 0.25 * profit //0.75 * profit  -> 510
	}

	var rent float32 = 0.1 * profit //51
	var finalSum float32 = profit - rent //крайна сума събрана за екскурзията -> 459

	//1. достатъчни
	if tripPrice <= finalSum {
		var leftMoney float32 = finalSum - tripPrice //оставащи пари
		fmt.Printf("Yes! %.2f lv left.", leftMoney)
	} else {
		//не са достатъчни (tripPrice > finalSum)
		var needMoney float32 = tripPrice - finalSum
		fmt.Printf("Not enough money! %.2f lv needed.", needMoney)
	}

}