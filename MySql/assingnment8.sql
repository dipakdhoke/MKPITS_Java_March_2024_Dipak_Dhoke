#1
select c.category_id ,c.name ,avg(p.amount) as revenue from category c
join film_category fc on c.category_id=fc.category_id
join film f on fc.film_id=f.film_id
join inventory i on f.film_id=i.film_id
join rental r on i.inventory_id=r.inventory_id
join payment p on r.customer_id=p.customer_id
group by category_id 
having revenue >10

select c.customer_id , c.first_name ,c.last_name,count(r.rental_id) as rental_count from customer c
join rental r on c.customer_id = r.customer_id
group by c.customer_id ,c.first_name,c.last_name
having count(r.rental_id) > 30

select l.language_id ,l.name ,count(f.film_id) from language l
join film f on l.language_id=f.language_id
group by language_id , name
having count(f.film_id) > 50

#4
SELECT 
    s.store_id,
    SUM(p.amount) AS total_revenue
FROM 
    store s
JOIN 
    staff st ON s.store_id = st.store_id
JOIN 
    rental r ON st.staff_id = r.staff_id
JOIN 
    payment p ON r.rental_id = p.rental_id
GROUP BY 
    s.store_id
HAVING 
    SUM(p.amount) > 5000;
#5
SELECT 
    a.actor_id,
    a.first_name,
    a.last_name,
    COUNT(fa.film_id) AS film_count
FROM 
    actor a
JOIN 
    film_actor fa ON a.actor_id = fa.actor_id
GROUP BY 
    a.actor_id, a.first_name, a.last_name
HAVING 
    COUNT(fa.film_id) > 10;

#6
SELECT 
    st.staff_id,
    st.first_name,
    st.last_name,
    COUNT(r.rental_id) AS transaction_count
FROM 
    staff st
JOIN 
    rental r ON st.staff_id = r.staff_id
GROUP BY 
    st.staff_id, st.first_name, st.last_name
HAVING 
    COUNT(r.rental_id) > 500;

#7
SELECT 
    c.customer_id,
    c.first_name,
    c.last_name
FROM 
    customer c
JOIN 
    rental r ON c.customer_id = r.customer_id
WHERE 
    r.rental_date >= DATE_SUB(CURDATE(), INTERVAL 30 DAY)
GROUP BY 
    c.customer_id, c.first_name, c.last_name;

#8
SELECT 
    f.film_id,
    f.title,
    AVG(DATEDIFF(r.return_date, r.rental_date)) AS avg_rental_duration
FROM 
    film f
JOIN 
    inventory i ON f.film_id = i.film_id
JOIN 
    rental r ON i.inventory_id = r.inventory_id
GROUP BY 
    f.film_id, f.title
HAVING 
    AVG(DATEDIFF(r.return_date, r.rental_date)) > 7;

#9
SELECT 
    f.film_id,
    f.title,
    COUNT(r.rental_id) AS rental_count
FROM 
    film f
JOIN 
    inventory i ON f.film_id = i.film_id
JOIN 
    rental r ON i.inventory_id = r.inventory_id
GROUP BY 
    f.film_id, f.title
HAVING 
    COUNT(r.rental_id) > 30;

#10
SELECT 
    c.customer_id,
    c.first_name,
    c.last_name,
    COUNT(DISTINCT fc.category_id) AS category_count
FROM 
    customer c
JOIN 
    rental r ON c.customer_id = r.customer_id
JOIN 
    inventory i ON r.inventory_id = i.inventory_id
JOIN 
    film f ON i.film_id = f.film_id
JOIN 
    film_category fc ON f.film_id = fc.film_id
GROUP BY 
    c.customer_id, c.first_name, c.last_name
HAVING 
    COUNT(DISTINCT fc.category_id) >= 5;



