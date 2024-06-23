use sakila
select last_name from actor
#1
delimiter $$
create procedure actor_info(in actor_last_name varchar (30))
begin 
select first_name,last_name, actor_id from actor
where last_name = actor_last_name;
end $$
delimiter ;
call actor_info('ALLEN')

#2
delimiter $$
create procedure film_list(in category_name varchar(25))
begin
select f.title ,f.description,f.release_year,f.rating from film f
join film_category fc on f.film_id=fc.film_id
join category c on fc.category_id=c.category_id
where  c.name=category_name;
end $$
delimiter ;
drop procedure film_list
select name from category
#3
delimiter $$
create procedure total_payment_customer(in customer_id int)
begin
select c.customer_id ,c.first_name,c.last_name,sum(p.amount) as total_payment from customer c
join payment p on c.customer_id=p.customer_id
where c.customer_id =customer_id
group by c.first_name,c.last_name,c.customer_id;
end $$ 
delimiter ;
call total_payment_customer(1)
select customer_id from customer
drop procedure total_payment_customer