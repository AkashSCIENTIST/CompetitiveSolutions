# Write your MySQL query statement below
select round(100*sum(order_date = customer_pref_delivery_date)/count(customer_id),2) as immediate_percentage
from Delivery 
where (customer_id, order_date) in (
    select customer_id, min(order_date) as order_date
    from Delivery
    group by customer_id
);
