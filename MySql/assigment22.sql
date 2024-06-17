use sakila
# 1. **Retrieve all films with a rental duration of more than 5 days:**
select * from film where rental_duration>=5
# 2. **List all customers who live in the city of 'San Diego':**
select * from customer_list where city='San Diego'
# **Find all films with a rating of 'PG-13' and sort them by title:**
select *from film where rating='PG-13' order by title
#4. **Display all actors whose last name starts with 'A' and order by first name:**
select *from actor where last_name like 'A%' order by first_name
#5. **Retrieve all films released in the year 2006:**
select *from film where release_year=2006
# 6. **Find all customers whose first name is 'John' and sort by last name in descending order:**
select *from customer where first_name='John' order by last_name desc
#7 7. **List all films with a rental rate between 2.99 and 4.99, inclusive:**
select *from film where rental_rate between 2.99 and 4.99
#8. **Retrieve all actors with a last name containing 'son' and order by last name:*
select *from actor where last_name='Son' order by last_name
#9 **Find all stores in city 'Los Angeles' and sort by store ID:**
select *store where city='Los Angeles' order by store_id
#10. **Display all films with a replacement cost greater than 20 and sort by replacement cost in ascending order:**
SELECT* FROM store
JOIN address ON store.address_id = address.address_id
JOIN city ON address.city_id = city.city_id
WHERE city.city = 'Los Angeles'
ORDER BY store.store_id;
#11
select film_id, title, replacement_cost
FROM film
WHERE replacement_cost > 20
ORDER BY replacement_cost ASC
#12 12. **Find all customers who have an active status (status = 1):**
select *from customer where active=1
#13. **Retrieve all films with a rental rate of 0.99 and sort them by length in descending order:**
select *from film where rental_rate=0.99 order by length desc
#22
select *from customer where address_id in(select address_id from address where city_id in(select city_id from city where city="new york" or city="Los Angeles" ))
#14
select *from actor where first_name ="Tom" order by last_name
#15
select *from film where replacement_cost <15 order by title
#16
select *from customer where last_name like '%Son'
#17
select *from film where rating ='R' order by rental_duration
#18 **Find all actors with a last name exactly equal to 'Smith' and order by first name:**
select *from actor where last_name='Smith' order by first_name
#19
select *from film where rental_duration =7 order by replacement_cost
#20
select *from customer where first_name like 'A%' order by last_name desc
#21
select *from film where rental_duration between 3 and 7 and rental_rate >2.99
#23
select *from film where rating ="PG" or "G" and length <= 90
#24
select *from actor where first_name ='SAM' or last_name like 'A%'
#25 
select *from film where replacement_cost between 15 and 25 order by title
#27
select *from film where rental_rate in(4.99,3.99,2.99)
#28
select *from actor where first_name like 'M%' and last_name like '%Y'
#29
select *from film where release_year in(2005,2006,2007) order by release_year
#30
select *from customer where first_name ="emily" or last_name="lee"