-- 코드를 입력하세요
SELECT count(*) as users
from user_info
where age between 20 and 29
and year(joined) = '2021';

# select count(*) as users
# from user_info
# where age >= 20 and age <=29
# and joined >= '2021-01-01' and joined < '2022-01-01';