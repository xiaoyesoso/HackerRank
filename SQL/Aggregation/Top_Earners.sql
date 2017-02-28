select salary*months,count(employee_id)
from Employee
where salary*months = (select max(earnings)
from (
select salary*months earnings
from Employee ) tmp) ;
