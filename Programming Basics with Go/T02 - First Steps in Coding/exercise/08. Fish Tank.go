package main

import "fmt"

func main () {
	var length, width, heigth int
	var percent float32

	fmt.Scanln(&length)
	fmt.Scanln(&width)
	fmt.Scanln(&heigth)
	fmt.Scanln(&percent)

	var volume int = length * width * heigth
	var volumeLiters float32 = float32(volume) * 0.001
	var needLiters float32 = volumeLiters * (1 - (percent / 100.0))

	fmt.Print(needLiters)


}