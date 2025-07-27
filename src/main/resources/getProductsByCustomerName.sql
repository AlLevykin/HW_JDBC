SELECT O.product_name
FROM ORDERS AS O
JOIN CUSTOMERS AS C ON O.customer_id = C.id
WHERE LOWER(C.name) = ?;