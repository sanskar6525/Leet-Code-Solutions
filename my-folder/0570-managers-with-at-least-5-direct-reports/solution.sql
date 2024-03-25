-- Write your PostgreSQL query statement below

SELECT E1.name 
FROM Employee E1
JOIN(SELECT managerId 
            FROM Employee 
            GROUP BY managerId 
            HAVING count(managerId) >=5)
E2 ON E1.ID=E2.managerId;

