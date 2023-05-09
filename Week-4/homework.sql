use sql_invoicing;

-- First select
select case when i.invoice_date >= '2019-07-01' then 'Second half of 2019'
			  when i.invoice_date >= '2019-01-01' then 'First half of 2019'
		 end as "data range",
         sum(i.invoice_total) as "total sales",
         sum(i.payment_total) as "total payment",
         sum(i.invoice_total) - sum(i.payment_total) as "what we expect"
from invoices i
group by case when i.invoice_date >= '2019-07-01' then 'Second half of 2019'
			  when i.invoice_date >= '2019-01-01' then 'First half of 2019'
		 end;
-- 

-- Second select
select p.date, pm.name as payment_method, sum(p.amount) as total_payments
from payments p
join payment_methods pm
on p.payment_method = pm.payment_method_id
group by p.date, pm.name
order by p.date, pm.name desc;
-- 

-- Third select
select payment_method, sum(amount) as total
from payments
group by payment_method

union all

select null as payment_method, sum(amount) as total
from payments;
-- 