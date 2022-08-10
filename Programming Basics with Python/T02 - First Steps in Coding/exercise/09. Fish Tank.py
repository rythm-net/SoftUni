lenght = int(input())
width = int(input())
height = int(input())
percent = float(input())

volume = lenght * width * height

total_liters = volume / 1000
percent_liters = total_liters * (percent / 100)

result = total_liters - percent_liters

print(result)