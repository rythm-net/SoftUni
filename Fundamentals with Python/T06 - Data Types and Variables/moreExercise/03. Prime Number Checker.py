number = int(input())

if number > 0:
    if number == 2 or number == 3:
        print("True")
    else:
        count_true = 0

        for x in range(3, number + 1):
            if number % x == 0:
                count_true += 1

        if count_true == 1:
            print("True")
        else:
            print("False")