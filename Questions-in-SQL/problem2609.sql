SELECT 
    categories.name, sum(products.amount)
FROM
    products
        INNER JOIN
    categories ON categories.id = products.id_categories
GROUP BY categories.id