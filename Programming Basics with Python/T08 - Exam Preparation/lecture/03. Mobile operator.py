term = input()
agr_type = input()
m_internet = input()
months = int(input())

contract_price = 0
total = 0

if term == 'one':
    if agr_type == 'Small':
        contract_price = 9.98
    elif agr_type == 'Middle':
        contract_price = 18.99
    elif agr_type == 'Large':
        contract_price = 25.98
    elif agr_type == 'ExtraLarge':
        contract_price = 35.99
elif term == 'two':
    if agr_type == 'Small':
        contract_price = 8.58
    elif agr_type == 'Middle':
        contract_price = 17.09
    elif agr_type == 'Large':
        contract_price = 23.59
    elif agr_type == 'ExtraLarge':
        contract_price = 31.79

if m_internet == 'yes':
    if term == 'two':
        if contract_price <= 10:
            total = contract_price + 5.5
            total = total - (total * 0.0375)
        elif 11 <= contract_price <= 30:
            total = contract_price + 4.35
            total = total - (total * 0.0375)
        elif contract_price > 30:
            total = contract_price + 3.85
            total = total - (total * 0.0375)
    elif term == 'one':
        if contract_price <= 10:
            total = contract_price + 5.5
        elif 11 <= contract_price <= 30:
            total = contract_price + 4.35
        elif contract_price > 30:
            total = contract_price + 3.85

elif m_internet == 'no':
    if term == 'two':
        if contract_price <= 10:
            total = contract_price
            total = total - (total * 0.0375)
        elif 11 <= contract_price <= 30:
            total = contract_price
            total = total - (total * 0.0375)
        elif contract_price > 30:
            total = contract_price
            total = total - (total * 0.0375)
    elif term == 'one':
        if contract_price <= 10:
            total = contract_price
        elif 11 <= contract_price <= 30:
            total = contract_price
        elif contract_price > 30:
            total = contract_price

end_sum = total * months
print(f'{end_sum:.2f} lv.')