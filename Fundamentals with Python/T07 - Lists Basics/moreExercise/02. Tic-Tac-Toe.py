x = input()
y = input()
z = input()

x = x.split(" ")
y = y.split(" ")
z = z.split(" ")

if x[0] == "1" and x[1] == "1" and x[2] == "1":
    print("First player won")
elif y[0] == "1" and y[1] == "1" and y[2] == "1":
    print("First player won")
elif z[0] == "1" and z[1] == "1" and z[2] == "1":
    print("First player won")
elif x[0] == "1" and y[0] == "1" and z[0] == "1":
    print("First player won")
elif x[1] == "1" and y[1] == "1" and z[1] == "1":
    print("First player won")
elif x[2] == "1" and y[2] == "1" and z[2] == "1":
    print("First player won")
elif x[0] == "1" and y[1] == "1" and z[2] == "1":
    print("First player won")
elif x[2] == "1" and y[1] == "1" and z[0] == "1":
    print("First player won")
elif x[0] == "2" and x[1] == "2" and x[2] == "2":
    print("Second player won")
elif y[0] == "2" and y[1] == "2" and y[2] == "2":
    print("Second player won")
elif z[0] == "2" and z[1] == "2" and z[2] == "2":
    print("Second player won")
elif x[0] == "2" and y[0] == "2" and z[0] == "2":
    print("Second player won")
elif x[1] == "2" and y[1] == "2" and z[1] == "2":
    print("Second player won")
elif x[2] == "2" and y[2] == "2" and z[2] == "2":
    print("Second player won")
elif x[0] == "2" and y[1] == "2" and z[2] == "2":
    print("Second player won")
elif x[2] == "2" and y[1] == "2" and z[0] == "2":
    print("Second player won")
else:
    print("Draw!")