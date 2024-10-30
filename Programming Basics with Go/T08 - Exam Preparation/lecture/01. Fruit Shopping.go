package main


import "fmt"

func main() {

	//входни данни
	var priceStrawberries float32
	fmt.Scanln(&priceStrawberries)

	var bananaQuantity float32
	fmt.Scanln(&bananaQuantity)

	var orangesQuantity float32
	fmt.Scanln(&orangesQuantity)

	var raspberriesQuantity float32
	fmt.Scanln(&raspberriesQuantity)

	var strawberriesQuantity float32
	fmt.Scanln(&strawberriesQuantity)

	//ягоди, банани, портокали и малини
	//сума за ягоди = количество (кг) * цена за 1 кг ягоди
	var sumStrawberries float32 = strawberriesQuantity * priceStrawberries
	//сума за малини = количество (кг) * цена за 1 кг малини
	var priceRaspberries float32 = priceStrawberries / 2
	var sumRaspberries float32 = raspberriesQuantity * priceRaspberries
	//сума за банани = количество (кг) * цена за 1 кг банани
	var priceBanana float32 = priceRaspberries - 0.8 * priceRaspberries
	var sumBananas float32 = bananaQuantity * priceBanana
	//сума за портокали = количество (кг) * цена за 1 кг портокали
	var priceOrange float32 = priceRaspberries - 0.4 * priceRaspberries
	var sumOranges float32 = orangesQuantity * priceOrange
	//общ сума = сума за ягоди +  сума за банани + сума за портокали +  сума за малини
	var totalSum float32 = sumStrawberries + sumBananas + sumOranges + sumRaspberries

	fmt.Printf("%.2f", totalSum)









}