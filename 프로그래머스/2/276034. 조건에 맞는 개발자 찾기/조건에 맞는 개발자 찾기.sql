# SELECT ID, EMAIL, FIRST_NAME, LAST_NAME
# FROM DEVELOPERS
# WHERE SKILL_CODE & (SELECT CODE FROM SKILLCODES WHERE NAME = 'Python') > 0
#    OR SKILL_CODE & (SELECT CODE FROM SKILLCODES WHERE NAME = 'C#') > 0
# ORDER BY ID;

# SELECT DISTINCT D.ID, D.EMAIL, D.FIRST_NAME, D.LAST_NAME
# FROM DEVELOPERS D
# JOIN SKILLCODES S
# ON D.SKILL_CODE & S.CODE > 0
# WHERE S.NAME IN ('Python', 'C#')
# ORDER BY D.ID;

# select d.id, d.email, d.first_name, d.last_name, bin(d.skill_code) as skill_code,
#        s.name, s.category, s.code, bin(s.code) as code
# from developers d
# join skillcodes s
# on d.skill_code & s.code = s.code
# order by d.id;

# select distinct d.id, d.email, d.first_name, d.last_name
# from developers d
# join skillcodes s
# on d.skill_code & s.code = s.code
# where s.name in ('Python', 'C#')
# order by d.id;

select d.id, d.email, d.first_name, d.last_name
from developers d
where exists (select 1 from skillcodes s
              where d.skill_code & s.code != 0
              and s.name in ('Python', 'C#'))
order by id;