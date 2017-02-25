select s.hacker_id,h.name
from submissions s,challenges c,hackers h,difficulty d
where s.challenge_id = c.challenge_id
and c.difficulty_level = d.difficulty_level
and s.hacker_id = h.hacker_id
and s.score = d.score
group by h.hacker_id
  having count(s.hacker_id) > 1
order by count(s.hacker_id) desc,hacker_id;
