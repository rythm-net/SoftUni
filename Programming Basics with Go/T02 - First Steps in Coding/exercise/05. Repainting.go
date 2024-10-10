package main

import "fmt"

func main() {
	var nylonQuantity, paintQuantity, razQuantity, hours int
	fmt.Scanln(&nylonQuantity)
	fmt.Scanln(&paintQuantity)
	fmt.Scanln(&razQuantity)
	fmt.Scanln(&hours)

	var nylonSum = float32(nylonQuantity + 2) * 1.50
	var paintSum = float32(paintQuantity) * 1.1 * 14.50
	var razSum = float32(razQuantity) * 5.00
	var bagsSum float32 = 0.40
	var totalSumMaterials float32 = nylonSum + paintSum + razSum + bagsSum
	var workersSum = (totalSumMaterials * 0.3) * float32(hours)
    var finalSum = workersSum + totalSumMaterials
	fmt.Print(finalSum)
}