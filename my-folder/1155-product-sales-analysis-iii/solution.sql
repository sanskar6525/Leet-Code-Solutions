# Write your MySQL query statement below
SELECT
    Sales.product_id, 
    SubSales.first_year,
    Sales.quantity,
    Sales.price
FROM
    Sales
JOIN
    (
        SELECT
            product_id,
            MIN(year) AS first_year
        FROM
            Sales
        GROUP BY
            product_id
    ) AS SubSales   #subtable 1
ON Sales.product_id = SubSales.product_id AND Sales.year = SubSales.first_year;
