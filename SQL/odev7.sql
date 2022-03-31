--- 1.Soru Cevap ---

SELECT rating FROM film
GROUP BY rating;

--- 2.Soru Cevap ---

SELECT replacement_cost, COUNT(*) FROM film
GROUP BY replacement_cost
HAVING count(*) > 50

--- 3.Soru Cevap ---

SELECT store_id, COUNT(*) FROM customer
GROUP BY store_id ;

--- 4. Soru Cevap ---

SELECT country_id, COUNT(*) FROM city
GROUP BY country_id
ORDER BY COUNT(*) DESC;