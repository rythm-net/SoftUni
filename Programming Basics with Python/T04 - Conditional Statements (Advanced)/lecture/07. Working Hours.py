hour = int(input())
day = str(input())

if day == "Sunday" or hour < 10 or hour >= 18:
    print("closed")
else:
    print("open")