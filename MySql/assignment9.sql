#1
SELECT DISTINCT 
    c.first_name,
    c.last_name
FROM 
    customer c
JOIN 
    rental r ON c.customer_id = r.customer_id
JOIN 
    inventory i ON r.inventory_id = i.inventory_id
JOIN 
    film f ON i.film_id = f.film_id
WHERE 
    f.title = 'Inception';

#2
SELECT DISTINCT 
    f.title
FROM 
    film f
JOIN 
    inventory i ON f.film_id = i.film_id
JOIN 
    rental r ON i.inventory_id = r.inventory_id
WHERE 
    r.customer_id = 10

#3
SELECT 
    r.*
FROM 
    rental r
ORDER BY 
    r.rental_date DESC
LIMIT 1;
#6
SELECT DISTINCT 
    c2.customer_id,
    c2.first_name,
    c2.last_name
FROM 
    rental r1
JOIN 
    inventory i1 ON r1.inventory_id = i1.inventory_id
JOIN 
    rental r2 ON i1.inventory_id = r2.inventory_id
JOIN 
    customer c2 ON r2.customer_id = c2.customer_id
WHERE 
    r1.customer_id = 10 
    AND r2.customer_id !=10;
    
#8
SELECT DISTINCT 
    a2.actor_id,
    a2.first_name,
    a2.last_name
FROM 
    film_actor fa1
JOIN 
    film_actor fa2 ON fa1.film_id = fa2.film_id
JOIN 
    actor a2 ON fa2.actor_id = a2.actor_id
WHERE 
    fa1.actor_id = 18
    AND fa2.actor_id != 149
    
    #10
    SELECT 
    f.title
FROM 
    film f
LEFT JOIN 
    inventory i ON f.film_id = i.film_id
LEFT JOIN 
    rental r ON i.inventory_id = r.inventory_id
WHERE 
    r.rental_id IS NULL;
    
    
    
