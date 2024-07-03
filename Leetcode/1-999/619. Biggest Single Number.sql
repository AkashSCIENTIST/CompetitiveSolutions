with temp as (select * from MyNumbers group by num having count(num) = 1) select max(num) as num from temp
