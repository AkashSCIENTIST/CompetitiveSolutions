# Write your MySQL query statement below
select start.machine_id, round(avg((end.timestamp - start.timestamp)),3) as processing_time from Activity as start inner join Activity as end on ((start.machine_id = end.machine_id) and (start.process_id = end.process_id))  where (start.activity_type='start' and end.activity_type='end') group by machine_id;
