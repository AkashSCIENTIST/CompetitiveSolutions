# Write your MySQL query statement below
select round(ifnull(count(distinct A.player_id)/count(distinct C.player_id), 0), 2) as fraction
from (
    select player_id, min(event_date) as event_date 
    from Activity group by player_id
) as A 
left join Activity B
on (A.player_id = B.player_id),
(
    select distinct player_id from Activity
) as C
where (datediff(B.event_date, A.event_date) = 1)
