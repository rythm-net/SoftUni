package main

import (
	"fmt"
	"math"
)

func main() {
	var recordTime float32
	fmt.Scanln(&recordTime)

	var distance float32
	fmt.Scanln(&distance)

	var timePerMeter float32
	fmt.Scanln(&timePerMeter)

	var swimTime = distance * timePerMeter
	var additionalTime = math.Floor(float64(distance) / 15.0) * 12.5
	var totalTime = swimTime + float32(additionalTime)

	if (totalTime < recordTime) {
		fmt.Printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime)
	} else {
		fmt.Printf("No, he failed! He was %.2f seconds slower.", totalTime - recordTime)
	}
}