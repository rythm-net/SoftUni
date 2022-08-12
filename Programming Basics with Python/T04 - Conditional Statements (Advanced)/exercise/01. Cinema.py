screening_type = str(input())
rows = int(input())
columns = int(input())
capacity = rows * columns
profit = 0

if screening_type == "Premiere":
    profit = capacity * 12
    print(f"{profit:.2f} leva")

elif screening_type == "Normal":
    profit = capacity * 7.50
    print(f"{profit:.2f} leva")

elif screening_type == "Discount":
    profit = capacity * 5
    print(f"{profit:.2f} leva")