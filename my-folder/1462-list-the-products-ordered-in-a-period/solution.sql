#Approach 3-Subquey Filtering
SELECT product_name, total_units AS unit
FROM (
    SELECT p.product_name, SUM(o.unit) AS total_units
    FROM Products p
    JOIN Orders o ON p.product_id = o.product_id
    WHERE o.order_date BETWEEN '2020-02-01' AND '2020-02-29'
    GROUP BY p.product_id, p.product_name
) AS FebruaryOrders
WHERE total_units >= 100;

