-- 코드를 입력하세요
-- SELECT name
-- from (select name 
--       from animal_ins
--       order by datetime)
-- where rownum = 1;      

select name
from animal_ins
order by datetime
fetch first 1 row only;