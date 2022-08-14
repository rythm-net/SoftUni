width = int(input())
lenght = int(input())
pieces = width * lenght
taking = input()

while taking != 'STOP':
    pieces -= int(taking)
    if pieces <= 0:
        needed = abs(pieces)
        print(f'No more cake left! You need {needed} pieces more.')
        break
    taking = input()

if pieces > 0:
    print(f'{pieces} pieces are left.')