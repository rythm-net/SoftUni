package main 


import "fmt"


func main() {

	//входни данни
	var budget float32
	fmt.Scanln(&budget)

	var countNights int
	fmt.Scanln(&countNights)

	var pricePerNight float32
	fmt.Scanln(&pricePerNight)

	var percent int
	fmt.Scanln(&percent)

	//разходи: нощувки и допълнителни разходи
	//сума за нощувки = бр. нощувки * цена за 1 нощувка
	if countNights > 7 {
		pricePerNight = pricePerNight - 0.05 * pricePerNight
		//pricePerNight = 0.95 * pricePerNight
	}
	var sumNights float32 = float32(countNights) * pricePerNight

	//сума за доп. разходи = % от бюджета
	var sumExtraExpenses float32 = (float32(percent) / 100.0) * budget

	//обща сума за плащане = сума за нощувки + сума за доп. разходи
	var totalSum float32 = sumNights + sumExtraExpenses

	//проверка дали бюджетът покрива сумата за плащане
	if budget >= totalSum {
		var leftMoney float32 = budget - totalSum // останали пари след почивката
		fmt.Printf("Ivanovi will be left with %.2f leva after vacation.", leftMoney)
	} else {
		//budget < totalSum
		var needMoney float32 = totalSum - budget
		fmt.Printf("%.2f leva needed.", needMoney)
	}
}