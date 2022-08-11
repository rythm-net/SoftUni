from math import pi

shape = input()
result = 0

if shape == 'square':
    square_side = float(input())
    square_area = square_side ** 2
    result = square_area
elif shape == 'rectangle':
    rectangle_side_a = float(input())
    rectangle_side_b = float(input())
    rectangle_area = rectangle_side_a * rectangle_side_b
    result = rectangle_area
elif shape == 'circle':
    circle_r = float(input())
    circle_area = pi * circle_r ** 2
    result = circle_area
else:
    shape == 'triangle'
    triangle_a = float(input())
    triangle_h = float(input())
    result = triangle_a * triangle_h / 2

print(f'{result:.3f}')