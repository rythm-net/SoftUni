exam_hour = int(input())
exam_minutes = int(input())
arrival_hour = int(input())
arrival_minutes = int(input())
exam_time_in_minutes = (exam_hour * 60) + exam_minutes
arrival_time_in_minutes = (arrival_hour * 60) + arrival_minutes
diff = abs(exam_time_in_minutes - arrival_time_in_minutes)
hour = diff // 60
minutes = diff % 60

if exam_time_in_minutes == arrival_time_in_minutes:
    print("On time")

elif exam_time_in_minutes > arrival_time_in_minutes:
    if diff <= 30:
        print("On time")
        print(f"{minutes} minutes before the start")
    elif 30 < diff < 60:
        print("Early")
        print(f"{minutes} minutes before the start")
    elif diff > 59:
        print("Early")
        print(f"{hour}:{minutes:02d} hours before the start")

elif arrival_time_in_minutes > exam_time_in_minutes:
    print("Late")
    if diff < 60:
        print(f"{minutes} minutes after the start")
    else:
        print(f"{hour}:{minutes:02d} hours after the start")