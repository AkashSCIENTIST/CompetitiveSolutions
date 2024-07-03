select product.product_id, ifnull(prices.price, 10) as price from (
    select distinct product_id from Products
) as product
left join (
    select product_id, new_price as price from Products 
    where (product_id,change_date) in (
        select product_id, MAX(change_date) AS change_date
        from Products
        where change_date <= '2019-08-16'
        group by product_id
    )
) as prices
on (product.product_id = prices.product_id)
