use sakila
create or replace view vw as
select f.film_id ,f.title,count(r.rental_id) from film f
join inventory i on f.film_id=i.film_id
join rental r on i.inventory_id=r.inventory_id
group by f.film_id ,f.title

select * from vw
#1
create or replace view customer_rental_info as
select c.first_name ,c.last_name ,c.email,count(r.rental_id) as total_rented,sum(p.amount) as total_rev from customer c
join  rental r on c.customer_id =r.customer_id
join payment p on r.rental_id = p.rental_id
group by  c.customer_id, c.first_name, c.last_name, c.email

select * from customer_rental_info
#2
create or replace view top_rented_film as
select f.title ,count(r.rental_id) as rented_times from film f
join inventory i on f.film_id = i.film_id 
join rental r on i.inventory_id =r.inventory_id
group by f.title order by rented_times desc limit 10
select * from top_rented_film
#3
create or replace view active_customers as
select c.first_name ,c.last_name,c.email,max(r.rental_date) from customer c
join rental r on c.customer_id=r.customer_id
where rental_date >= curdate()-interval 30 day 
group by c.customer_id,c.first_name,c.last_name,c.email

select * from active_customers

#4
create view inventory_by_store as
select count(f.film_id),s.store_id from film f
join inventory i on f.film_id=i.film_id
join store s on i.store_id=s.store_id
group by s.store_id
select * from inventory_by_store

#5
create or replace view staff_sales_performance as 
select s.first_name ,s.last_name,st.store_id,sum(p.amount) from staff s
join store st on s.store_id=st.store_id
join payment p on s.staff_id=p.staff_id
group by s.first_name ,s.last_name,store_id

select * from staff_sales_performance



