-- 코드를 입력하세요
-- select sex_upon_intake
-- from animal_ins
-- where sex_upon_intake not in ('Neutered Male', 'Spayed Female');

-- SELECT animal_id, name, 
--        decode(sex_upon_intake, 'Neutered Male', 'O', 'Spayed Female', 'O', 'X') as 중성화
-- from animal_ins
-- order by animal_id;

SELECT animal_id, name,
    case
        when sex_upon_intake like 'Intact%' then 'X'
        else 'O'
    end as 중성화
from animal_ins
order by animal_id;