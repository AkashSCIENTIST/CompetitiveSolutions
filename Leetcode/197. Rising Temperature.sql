# Write your MySQL query statement below
select A.id from Weather A inner join Weather B on (date_sub(A.recordDate, interval 1 day) = B.recordDate) where A.temperature > B.temperature;
