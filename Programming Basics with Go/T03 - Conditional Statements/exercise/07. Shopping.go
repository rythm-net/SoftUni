package main

import "fmt"

func main () {

	//1. входни данни -> бюджет, бр. видеокарти, бр. процесори, бр. рам памет
	//сума за видеокарти = бр. видеокарти * 250
	//сума за процесори = бр. процесори * (0.35 * сума за видеокарти)
	//сума за рам памети = бр. рам памет * (0.10 * сума за видеокарти)
	//обща сума = сума за видеокарти + сума за процесори +  сума за рам памети
	//проверка за отстъпка: бр. видеокарти > бр. процесори -> обща сума - 15%
	//проверка дали бюджетът ни е достатъчен да покрие сумата
	var budget float32
	fmt.Scanln(&budget) //900

	var countVideoCards, countCPUs, countRam int
	fmt.Scanln(&countVideoCards) //2
	fmt.Scanln(&countCPUs) //1
	fmt.Scanln(&countRam) //3

	var sumVideoCards float32 = float32(countVideoCards) * 250.0 // 2.0 * 250.0 = 500.0
	var sumCPUs float32 = float32(countCPUs) * (0.35 * sumVideoCards) // 1.0 * 175.0 = 175.0
	var sumRam float32 = float32(countRam) * (0.10 * sumVideoCards) //3.0 * 50.0 = 150.0

	var totalSum float32 = sumVideoCards + sumCPUs + sumRam //500.00 + 175.00 + 150.0 = 825.00

	if countVideoCards > countCPUs {
		totalSum = totalSum - 0.15 * totalSum //0.85 * totalSum  -> 825 - 15% = 701.25
	}

	//бюджетът да е достатъчен
	if budget >= totalSum {
		var leftMoney float32 = budget - totalSum
		fmt.Printf("You have %.2f leva left!", leftMoney)
	} else {
		//бюджетът не е достатъчен
		//budget < totalSum
		var needSum float32 = totalSum - budget
		fmt.Printf("Not enough money! You need %.2f leva more!", needSum)
	}

}