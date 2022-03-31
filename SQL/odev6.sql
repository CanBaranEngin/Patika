--- 1. Soru Cevap ---

SELECT AVG(rental_rate) FROM film;

--- 2. Soru Cevap ---

SELECT COUNT(title) FROM film
WHERE title LIKE 'C%' ;

--- 3.Soru Cevap ---

SELECT MAX(length) FROM film
WHERE rental_rate = 0.99 ;

--- 4.Soru Cevap ---

SELECT COUNT(DISTINCT(replacement_cost)) FROM film
WHERE length>150 ;


