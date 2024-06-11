# Write your MySQL query statement below
select P.product_name, sum(O.unit) as unit 
from Products as P 
inner join Orders as O 
on (P.product_id = O.product_id) 
where date_format(O.order_date, '%Y-%m') = '2020-02'
group by O.product_id 
having sum(O.unit) >= 100 ;
