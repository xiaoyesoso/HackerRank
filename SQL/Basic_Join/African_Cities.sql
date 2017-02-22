select c.name
from city c,COUNTRY co
where c.COUNTRYCODE = co.code 
and CONTINENT = "Africa";
