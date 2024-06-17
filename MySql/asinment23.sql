use sakila
#1)
select *from film
select count(film_id) from film
#2
select avg(rental_rate) from film
#3
select count(*) from rental
#4
select max(replacement_cost) from film
#5
select sum(amount) from payment
#6
select avg(length) from film
#7
select min(rental_duration) from film
#8
select distinct(customer_id) from rental
#9
select avg(amount) from payment
#10
select count(inventory_id) from inventory
#11
select distinct (
#12
select max(amount) from payment
#13
select avg(length) from film where rating='PG'
#14
select count(payment_id) from payment where payment_date between '2005-05-01' and '2005-05-31'
#15
select count(film_id) from film where rental_duration=7
#16
select avg(replacement_cost) from film where rental_rate=2.99



