# Write your MySQL query statement below
DELETE a FROM person a INNER JOIN person b ON a.email = b.email WHERE a.id > b.id;