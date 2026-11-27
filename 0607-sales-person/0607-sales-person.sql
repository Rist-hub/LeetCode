# Write your MySQL query statement below

select s.name
from SalesPerson s
where s.name not in (SELECT s.name FROM salesperson s INNER JOIN orders o INNER JOIN company c ON s.sales_id = o.sales_id AND o.com_id = c.com_id WHERE c.name = "RED")


