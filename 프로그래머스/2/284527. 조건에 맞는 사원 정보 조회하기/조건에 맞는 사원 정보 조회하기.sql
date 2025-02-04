-- 코드를 작성해주세요
# select sum(g.score) as score, g.emp_no, e.emp_name, e.position, e.email
# from hr_grade g
# join hr_employees e
# on g.emp_no = e.emp_no
# group by g.emp_no
# order by score desc
# limit 1;

# with sum_score as (
#     select sum(g.score) as score, g.emp_no, e.emp_name, e.position, e.email
#     from hr_grade g
#     join hr_employees e
#     on g.emp_no = e.emp_no
#     group by g.emp_no
# )

# select *
# from sum_score
# where score = (select max(score) from sum_score);

with sum_score as (
    select emp_no, sum(score) as score
    from hr_grade
    group by emp_no
),
max_score as (
    select max(score) as score
    from sum_score
)

select s.score, s.emp_no, e.emp_name, e.position, e.email
from hr_employees e
join sum_score s
on e.emp_no = s.emp_no
where s.score = (select score from max_score);