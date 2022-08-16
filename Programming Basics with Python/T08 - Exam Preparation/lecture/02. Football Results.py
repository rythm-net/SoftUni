first = input()
second = input()
tirth = input()

first_1 = int(first[0])
first_2 = int(first[2])
second_1 = int(second[0])
second_2 = int(second[2])
tirth_1 = int(tirth[0])
tirth_2 = int(tirth[2])

win=0
lose=0
neutr=0

if first_1 > first_2:
    win+=1
elif first_2 > first_1:
    lose+=1
elif first_2==first_1:
    neutr+=1
if second_1 > second_2:
    win+=1
elif second_2 > second_1:
    lose+=1
elif second_2==second_1:
    neutr+=1
if tirth_1 > tirth_2:
    win+=1
elif tirth_2 > tirth_1:
    lose+=1
elif tirth_2==tirth_1:
    neutr+=1

print(f'Team won {win} games.')
print(f'Team lost {lose} games.')
print(f'Drawn games: {neutr}')