-- 코드를 입력하세요
-- SELECT animal_id, name, 
-- case
--     when sex_upon_intake like '%Neutered%' or 
--     sex_upon_intake like '%Spayed%' then 'O'
--     else 'X'
-- end    
-- from animal_ins
-- order by animal_id;

SELECT ANIMAL_ID
,      NAME
,      CASE
           WHEN SEX_UPON_INTAKE LIKE '%Neutered%' THEN 'O'
           WHEN SEX_UPON_INTAKE LIKE '%Spayed%' THEN 'O'
           ELSE 'X'
       END AS 중성화
FROM ANIMAL_INS
ORDER BY ANIMAL_ID;
