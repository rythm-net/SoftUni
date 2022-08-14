contribution = input()

bank_account_total = 0

while contribution != "NoMoreMoney":
    if float(contribution) > 0:
        print(f"Increase: {float(contribution):.2f}")
    if float(contribution) < 0:
        print("Invalid operation!")
        break
    bank_account_total += float(contribution)
    contribution = input()

print(f"Total: {bank_account_total:.2f}")