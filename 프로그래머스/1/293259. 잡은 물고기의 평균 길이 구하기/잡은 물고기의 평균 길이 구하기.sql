select round(avg(greatest(ifnull(length, 10), 10)), 2) as average_length
from fish_info;