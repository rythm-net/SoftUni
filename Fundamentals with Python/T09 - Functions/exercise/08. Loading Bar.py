percent_loaded = int(input())

def loading_bar(percent):
    x = int(percent / 10)
    y = 10 - x
    loaded = '%' * x
    loading = '.' * y

    if x < 10:
        print(f'{percent}% [{loaded}{loading}]')
        print('Still loading...')
    else:
        print('100% Complete!')
        print(f'[{loaded}{loading}]')

loading_bar(percent_loaded)