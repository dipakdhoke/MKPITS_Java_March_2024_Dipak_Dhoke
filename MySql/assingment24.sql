use sakila
#1
select substring(title,1,10) from film
#2
select upper(title) from film
#3
select length(title) from film
#4
select concat(first_name,last_name) from actor
#5
select replace  (description,'Action','Thriller') from film
#6