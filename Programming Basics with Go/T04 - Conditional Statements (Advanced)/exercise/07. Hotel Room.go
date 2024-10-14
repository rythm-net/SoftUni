package main

import "fmt"

func main() {
	var month string
	fmt.Scanln(&month)

	var count int
	fmt.Scanln(&count)

	var totalStudio float32 = 0
	var totalApartment float32 = 0

	switch month {
		case "May", "October":
			totalStudio = float32(count) * 50
			totalApartment = float32(count) * 65

			if count > 7 && count < 15 {
				totalStudio = totalStudio * 0.95
			} else if count > 14 {
				totalStudio = totalStudio * 0.7
				totalApartment = totalApartment * 0.9
			}
			break
		case "June", "September":
			totalStudio = float32(count) * 75.2
			totalApartment = float32(count) * 68.7
			if count > 14 {
				totalStudio = totalStudio * 0.8
				totalApartment = totalApartment * 0.9
			}
			break
		case "July", "August":
			totalStudio = float32(count) * 76
			totalApartment = float32(count) * 77
			if count > 14 {
				totalApartment = totalApartment * 0.9
			}
	}
	fmt.Printf("Apartment: %.2f lv.\n", totalApartment)
	fmt.Printf("Studio: %.2f lv.", totalStudio)
}
