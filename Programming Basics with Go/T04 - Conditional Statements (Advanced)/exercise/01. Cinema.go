package main

import "fmt"

func main () {
	//бр. билети = бр. места = редове * колони
	//цена за един билет -> зависи от вид на прожекцията
	//печалба = бр. билети * цена за един билет

	var typeProjection string
	fmt.Scanln(&typeProjection)

	var rows, cols int
	fmt.Scanln(&rows)
	fmt.Scanln(&cols)

	var countTickets int = rows * cols
	var pricePerTicket float32 = 0

	//•	Premiere – премиерна прожекция, на цена 12.00 лева.
	//•	Normal – стандартна прожекция, на цена 7.50 лева.
	//•	Discount – прожекция за деца, ученици и студенти на намалена цена от 5.00 лева.

	switch typeProjection {
		case "Premiere":
			pricePerTicket = 12
		case "Normal":
			pricePerTicket = 7.50
		case "Discount":
			pricePerTicket = 5.00
	}

	var profit float32 = float32(countTickets) * pricePerTicket
	fmt.Printf("%.2f leva", profit)


}