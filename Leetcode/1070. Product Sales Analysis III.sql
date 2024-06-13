# Write your MySQL query statement below
with temp as (
    select product_id as id, min(year) as fyear from Sales group by product_id
)
select product_id, year as first_year, quantity, price from Sales
inner join temp 
on (Sales.product_id = temp.id)
where Sales.year = temp.fyear
