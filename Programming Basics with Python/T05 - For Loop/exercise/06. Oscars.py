actor_name = input()
academy_points = float(input())
judges_count = int(input())
total_judge_points = 0
total_points = 0

for number in range(judges_count):
    judge_name = input()
    judge_points = float(input())
    total_judge_points += len(judge_name) * judge_points / 2
    total_points = academy_points + total_judge_points

    if total_points >= 1250.5:
        print(f"Congratulations, {actor_name} got a nominee for leading role with {total_points:.1f}!")
        break

if total_points < 1250.5:
    needed_points = 1250.5 - total_points
    print(f"Sorry, {actor_name} you need {needed_points:.1f} more!")