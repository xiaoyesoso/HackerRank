/*
Enter your query here.
*/
select concat(name,'(',substr(OCCUPATION,1,1),')')
from OCCUPATIONS
order by name;
select concat("There are total ",count(name),' ',lower(OCCUPATION),"s.")
from OCCUPATIONS
group by OCCUPATION
order by count(name) , OCCUPATION;

