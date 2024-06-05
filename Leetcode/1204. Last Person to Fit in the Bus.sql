# Write your MySQL query statement below
with new_table as (select person_name, sum(weight) over(order by turn) as weight from Queue) select person_name from new_table where weight <= 1000 order by person_name desc limit 1;
