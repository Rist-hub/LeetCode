# Write your MySQL query statement below
SELECT c.name AS Customers FROM orders o RIGHT JOIN customers c ON c.id = o.customerId WHERE o.id IS NULL;