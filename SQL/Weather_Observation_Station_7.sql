select distinct(city) 
from station 
where substr(city,length(city),1) in ("A","E","I","O","U") ;
