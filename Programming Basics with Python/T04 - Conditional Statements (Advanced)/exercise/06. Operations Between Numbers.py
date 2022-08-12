n1 = int(input())
n2 = int(input())
operator = input()
result = 0
even_odd = ""

if operator == "/" and n2 == 0:
    print(f"Cannot divide {n1} by zero")

elif operator == "%" and n2 == 0:
    print(f"Cannot divide {n1} by zero")

elif operator == "+":
    result = n1 + n2
    if result % 2 == 0:
        even_odd = "even"
    else:
        even_odd = "odd"
    print(f"{n1} {operator} {n2} = {result} - {even_odd}")

elif operator == "-":
    result = n1 - n2
    if result % 2 == 0:
        even_odd = "even"
    else:
        even_odd = "odd"
    print(f"{n1} {operator} {n2} = {result} - {even_odd}")

elif operator == "*":
    result = n1 * n2
    if result % 2 == 0:
        even_odd = "even"
    else:
        even_odd = "odd"
    print(f"{n1} {operator} {n2} = {result} - {even_odd}")

elif operator == "/":
    result = n1 / n2
    print(f"{n1} / {n2} = {result:.2f}")

elif operator == "%":
    result = n1 % n2
    print(f"{n1} % {n2} = {result}")