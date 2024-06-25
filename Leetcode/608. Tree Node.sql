# Write your MySQL query statement below
select distinct parent.id as id, (
    case
        when parent.p_id is null then 'Root'
        when parent.p_id is not null and child.p_id is not null then 'Inner'
        when parent.p_id is not null and child.p_id is null then 'Leaf'
    end
    ) as type
from tree as parent left join tree as child on (child.p_id = parent.id);
