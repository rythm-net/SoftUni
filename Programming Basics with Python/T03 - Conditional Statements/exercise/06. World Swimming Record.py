record_sec = float(input())
distance_meters = float(input())
seconds_for_meter = float(input())

water_density = 15
water_slow = 12.5

diff = 0
total_time = distance_meters * seconds_for_meter

delay = distance_meters // water_density * water_slow
total_time = total_time + delay

if total_time < record_sec:
    print(f'Yes, he succeeded! The new world record is {total_time:.2f} seconds.')
else:
    diff = total_time - record_sec
    print(f'No, he failed! He was {diff:.2f} seconds slower.')