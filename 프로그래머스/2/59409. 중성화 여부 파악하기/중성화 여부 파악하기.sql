-- 코드를 입력하세요
SELECT animal_id, name,
       decode(sex_upon_intake, 'Neutered Male', 'O', 'Spayed Female', 'O', 'X') as "중성화"
from animal_ins
order by animal_id;