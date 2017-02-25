select if(Grade < 8, "NULL",Name),grade ,marks
from Students s, Grades g
where marks >= min_mark 
and marks <= max_mark
order by  grade desc,name,marks;

