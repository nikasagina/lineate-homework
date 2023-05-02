-- First select
use sql_store;
select o.order_date, o.order_id, c.first_name, s.name, os.name
from orders o
join customers c on o.customer_id = c.customer_id
left join shippers s on o.shipper_id = s.shipper_id
join order_statuses os on o.status = os.order_status_id
where o.order_id <= 10
order by os.name, o.order_id;
-- 

-- Second select
use sql_invoicing;
select p.date, c.name as client, p.amount, pm.name
from invoices i
join clients c on i.client_id = c.client_id
join payments p on i.invoice_id = p.invoice_id
join payment_methods pm on p.payment_method = pm.payment_method_id;
-- 

-- Third select
use sql_store;
select customer_id, first_name, points,
	case
		when points < 2000 then 'bronze'
        when points < 3000 then 'silver'
        else 'gold'
	end as type
from customers
where customer_id <= 10
order by first_name asc;