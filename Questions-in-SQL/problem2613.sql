select 
	movies.id,
    movies.name
from movies, prices
where prices.id = movies.id_prices and prices.value < 2