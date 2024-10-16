package main

import "fmt"

func main() {
	var n int
	fmt.Scan(&n)
	var count1, count2, count3, count4, count5 int = 0, 0, 0, 0, 0

	for number := 1; number <= n; number++ {
		var value float32
		fmt.Scan(&value)

		if value < 200 {
			count1++
		} else if value >= 200 && value <= 399 {
			count2++
		} else if value >= 400 && value <= 599 {
			count3++
		} else if value >= 600 && value <= 799 {
			count4++
		} else if value >= 800 {
			count5++
		}

	}

	fmt.Printf("%.2f%%\n", float32(count1) / float32(n) * 100)
	fmt.Printf("%.2f%%\n", float32(count2) / float32(n) * 100)
	fmt.Printf("%.2f%%\n", float32(count3) / float32(n) * 100)
	fmt.Printf("%.2f%%\n", float32(count4) / float32(n) * 100)
	fmt.Printf("%.2f%%\n", float32(count5) / float32(n) * 100)

}
