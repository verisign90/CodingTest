-- 코드를 작성해주세요
# select i.item_id, i.item_name, i.rarity
# from item_tree t
# join item_info i
# on t.item_id = i.item_id
# where t.parent_item_id in (select item_id from item_info
#                            where rarity = 'rare')
# order by i.item_id desc;   

# select item_id, item_name, rarity
# from item_info
# where item_id in (select t.item_id 
#                   from item_tree t, item_info i
#                   where i.item_id = t.parent_item_id
#                   and i.rarity = 'rare')
# order by item_id desc;      

# select item_id, item_name, rarity
# from item_info
# where item_id in (select t.item_id
#                   from item_tree t
#                   join item_info i
#                   on i.item_id = t.parent_item_id
#                   where i.rarity = 'rare')
# order by item_id desc;

select i.item_id, i.item_name, i.rarity
from item_info i
join item_tree t on i.item_id = t.item_id -- 이전(부모)/다음(자식) 관계
join item_info p on t.parent_item_id = p.item_id -- 부모의 상세 정보
where p.rarity = 'rare'
order by i.item_id desc;