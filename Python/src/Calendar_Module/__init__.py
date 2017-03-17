from calendar import day_name, weekday
MM,DD,YYYY = map(int,raw_input().split())
print(day_name[weekday(YYYY,MM,DD)].upper())