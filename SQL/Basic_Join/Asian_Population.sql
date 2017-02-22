select sum(city.population) 
from CITY ,COUNTRY 
where city.countrycode = country.code 
and CONTINENT = "Asia";
