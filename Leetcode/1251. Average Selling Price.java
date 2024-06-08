# Write your MySQL query statement below
select 
    Prices.product_id,
    round(ifnull(sum(Prices.price * UnitsSold.units)/sum(UnitsSold.units), 0), 2) as average_price
from Prices
left join UnitsSold
on (
    Prices.product_id = UnitsSold.product_id
    and 
    UnitsSold.purchase_date between Prices.start_date and Prices.end_date
)
group by Prices.product_id
