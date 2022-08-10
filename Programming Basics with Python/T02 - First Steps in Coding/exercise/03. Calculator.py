deposited_amount = float(input())
deposite_months = int(input())
annual_interest_rate = float(input())

accrued_interest = (deposited_amount*annual_interest_rate) / 100
month_interest = accrued_interest / 12

total=deposited_amount + (deposite_months * month_interest)

print(total)