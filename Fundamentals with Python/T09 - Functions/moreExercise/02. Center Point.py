from math import sqrt

x1 = float(input())
y1 = float(input())
x2 = float(input())
y2 = float(input())

def find_closest_point(x1, y1, x2, y2):

    def find_distance_to_center(x, y):
        distance = sqrt(x ** 2 + y ** 2)
        return distance

    first_distance = find_distance_to_center(x1, y1)
    second_distance = find_distance_to_center(x2, y2)

    if first_distance < second_distance:
        print(f'({int(x1)}, {int(y1)})')
    elif first_distance > second_distance:
        print(f'({int(x2)}, {int(y2)})')
    else:
        print(f'({int(x1)}, {int(y1)})')

find_closest_point(x1, y1, x2, y2)