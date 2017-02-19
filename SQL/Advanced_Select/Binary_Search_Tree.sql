/*
Enter your query here.
*/
select
case 
     when b2.p is null
     then concat(b2.n,' ',"Root")
     when (select count(p) from BST b1 where b1.p = b2.n) = 0 
     then concat(b2.n,' ',"Leaf")
     when (select count(p) from BST b3 where b3.p = b2.n) > 0 
     then concat(b2.n,' ',"Inner")
end
from BST b2
order by b2.n;
