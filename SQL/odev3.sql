-- 1.soru 

SELECT country FROM country
WHERE country LIKE 'A%a';

-- 2. soru 

SELECT country FROM country
WHERE country LIKE '_____n';

-- 3. Soru 

SELECT title FROM film
WHERE title ILIKE '%T%T%t%T%'

-- 4.Soru 

SELECT * FROM film
WHERE title LIKE 'C%' AND length>90 AND rental_rate = 2.99 
