select
	o.product_name
from
	orders as o
join customers as c on
	o.customer_id = c.id
where
	LOWER(c.name) = LOWER(?);