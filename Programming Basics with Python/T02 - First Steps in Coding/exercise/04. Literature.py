num_pages = int(input())
pages_per_hour = int(input())
num_days = int(input())

reading_hours = num_pages / pages_per_hour
reading_hours_per_day = reading_hours / num_days

print(reading_hours_per_day)