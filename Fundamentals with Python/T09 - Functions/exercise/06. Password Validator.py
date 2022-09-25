password = input()

def password_validator(password):
    valid_password = True
    if len(password) < 6 or len(password) > 10:
        print("Password must be between 6 and 10 characters")
        valid_password = False
    if not password.isalnum():
        print(f'Password must consist only of letters and digits')
        valid_password = False
    count_numbers = 0
    for char in password:
        if char.isnumeric():
            count_numbers += 1
    if count_numbers < 2:
        print("Password must have at least 2 digits")
        valid_password = False
    if valid_password:
        print("Password is valid")

password_validator(password)