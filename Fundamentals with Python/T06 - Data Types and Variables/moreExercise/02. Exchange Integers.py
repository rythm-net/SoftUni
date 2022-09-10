a = int(input())
b = int(input())

print("Before:")
print(f"a = {a}")
print(f"b = {b}")

c = a
a = b
b = c

print("After:")
print(f"a = {a}")
print(f"b = {b}")