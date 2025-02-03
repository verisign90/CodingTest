-- 코드를 입력하세요
SELECT board_id, writer_id, title, price, 
       decode(status, 'SALE', '판매중', 'DONE', '거래완료', '예약중') as status
from used_goods_board
-- where to_char(created_date, 'yyyy-mm-dd') = '2022-10-05'
where created_date = to_date('2022-10-05', 'yyyy-mm-dd')
order by board_id desc;