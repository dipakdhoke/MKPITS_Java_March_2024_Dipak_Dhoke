#1
select c.first_name,c.last_name,f.title from customer c
join rental r on c.customer_id=r.customer_id
join inventory i on r.inventory_id=i.inventory_id
join film f on i.film_id=f.film_id

#2
select r.rental_date,r.return_date,c.first_name,c.last_name
 from customer c
join rental r on c.customer_id=r.customer_id
#3
select a.first_name,a.last_name from actor a
join film_actor fa on fa.actor_id=a.actor_id 
join  film f on f.film_id=fa.film_id where title="Chamber Itallian"
#4
select 
 
