from math import sqrt

x1 = float(input())
y1 = float(input())
x2 = float(input())
y2 = float(input())
x3 = float(input())
y3 = float(input())
x4 = float(input())
y4 = float(input())

def find_longer_line(x1, y1, x2, y2, x3, y3, x4, y4):

    def find_line_distance(x1, y1, x2, y2):
        line_distance = sqrt((x2 - x1) ** 2 + (y2 - y1) ** 2)
        return line_distance

    def find_distance_to_center(x, y):
        distance = sqrt(x ** 2 + y ** 2)
        return distance

    first_distance = find_line_distance(x1, y1, x2, y2)
    second_distance = find_line_distance(x3, y3, x4, y4)

    if first_distance > second_distance or first_distance == second_distance:
        first_distance_to_center = find_distance_to_center(x1, y1)
        second_distance_to_center = find_distance_to_center(x2, y2)
        if first_distance_to_center < second_distance_to_center or first_distance_to_center == second_distance_to_center:
            print(f'({int(x1)}, {int(y1)})({int(x2)}, {int(y2)})')
        else:
            print(f'({int(x2)}, {int(y2)})({int(x1)}, {int(y1)})')
    else:
        first_distance_to_center = find_distance_to_center(x3, y3)
        second_distance_to_center = find_distance_to_center(x4, y4)
        if first_distance_to_center < second_distance_to_center or first_distance_to_center == second_distance_to_center:
            print(f'({int(x3)}, {int(y3)})({int(x4)}, {int(y4)})')
        else:
            print(f'({int(x4)}, {int(y4)})({int(x3)}, {int(y3)})')

find_longer_line(x1, y1, x2, y2, x3, y3, x4, y4)