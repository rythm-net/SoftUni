data_type = input()
data = input()

def print_depending_of_data_type(type, data):
    result = ""
    if type == "int":
        data = int(data)
        result = f'{data * 2}'
    elif type == "real":
        data = float(data)
        result = f'{data * 1.5:.2f}'
    elif type == "string":
        result = f'${data}$'
    return result

print(print_depending_of_data_type(data_type, data))