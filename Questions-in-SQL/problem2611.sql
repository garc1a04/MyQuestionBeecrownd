SELECT 
    movies.id, movies.name
FROM
    movies,
    genres
WHERE
    genres.id = movies.id_genres
        AND genres.description = 'Action'