-- 1. Soru Cevabı --

SELECT title, description FROM film;

-- 2. Soru Cevabı --

SELECT * FROM film
WHERE length > 60 AND length < 75;

-- 3. Soru Cevabı--

SELECT * FROM film
WHERE rental_rate = 0.99 AND replacement_cost = 12.99 or replacement_cost = 28.99;

-- 4. Soru Cevabı --

SELECT last_name FROM customer
WHERE first_name = 'Mary';

-- 5.Soru Cevabı --

SELECT * FROM film 
WHERE NOT length > 50 and (rental_rate = 2.99 OR rental_rate = 4.99);


