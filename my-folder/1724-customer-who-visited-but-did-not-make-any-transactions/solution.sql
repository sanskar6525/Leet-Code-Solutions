
select customer_id , COUNT(VISIT_ID) AS count_no_trans
from VISITS 
where 
  visit_id NOT IN (
      SELECT 
         VISIT_ID 
     FROM TRANSACTIONS
  )
  GROUP BY 
  CUSTOMER_ID ;
