#1
select c.name ,sum(p.amount) as summ 
from payment p
join rental r on p.rental_id=r.rental_id
join inventory i on r.inventory_id=i.inventory_id
join film f on i.film_id =f.film_id
join film_category fc on f.film_id =fc.film_id
join category c on fc.category_id=c.category_id
group by c.name 
order by summ
#2
select c.first_name ,c.last_name,c.customer_id,count(r.rental_id) as rental_count
from customer c
join rental r on r.customer_id =c.customer_id
group by c.first_name ,c.last_name,c.customer_id
order by rental_count
#3
select title ,avg(rental_duration) from film group by title 
#4
select month(p.payment_date),sum(p.amount) from payment p group by month(p.payment_date);
select month(p.payment_date),sum(p.amount) from payment p group by month(p.payment_date);
#5
select s.store_id,sum(p.amount) as total_revenue from payment p
join rental r on  r.rental_id=p.rental_id
join inventory i on r.inventory_id=i.inventory_id 
join store s on i.store_id=s.store_id
group by s.store_id
#6
select s.staff_id , count(r.rental_id) as rentals from staff s
join rental r on r.staff_id=s.staff_id
group by s.staff_id
#7
select fc.category_id,avg(f.rental_rate) from film_category fc join film f on fc.film_id=f.film_id group by fc.category_id;

select fc.category_id,avg(f.rental_rate) from film_category fc
join film f on fc.film_id=f.film_id
group by category_id 

#8
select f.film_id ,f.title,count(r.rental_id) from film f
join inventory i on f.film_id=i.film_id
join rental r on i.inventory_id=r.inventory_id
group by f.film_id ,f.title
#9
select ci.city,ci.city_id,sum(p.amount) as revenue from city ci
join address a on ci.city_id=a.city_id
join customer c on a.address_id=c.address_id
join payment p on c.customer_id = p.customer_id
group by city_id
order by revenue
#10s
select l.language_id,l.name,count(r.rental_id) from language l
join film f on l.language_id=f.language_id
join inventory i on f.film_id=i.film_id
join rental r on i.inventory_id=r.inventory_id
group by language_id



