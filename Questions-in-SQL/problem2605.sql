SELECT 
    p.name, pro.name
FROM
    products p,
    providers pro,
    categories c
WHERE
    p.id_providers = pro.id
        AND p.id_categories = c.id
        AND p.id_categories = 6