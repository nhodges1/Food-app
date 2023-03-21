CREATE TABLE food (
 foodId INT NOT NULL,
 foodName VARCHAR(255),
 categoryId INT,
 description VARCHAR(255),
 priceOfItem DECIMAL(10,2),
 foodTag VARCHAR(255),
 PRIMARY KEY (foodId)
 );

INSERT INTO food (foodId, foodName, categoryId, description, priceOfItem, foodTag)
VALUES (1, 'Avocado Toast', 1, 'Toast, fresh smashed avocado, lemon and sea salt', 6.00, 'Gluten-free'),
(2, 'Spicy Poblano Omelette',1,'Eggs, Poblano peppers, red peppers, onions, shredded beef, cheese', 13.00, 'Contains gluten'),
(3, 'Power Wrap', 1, 'Egg whites, turkey, spinach, mushrooms and Mozzarella.', 10.00, 'Cage-free'),
(4, 'Pancakes', 1, 'Two pancakes topped with seasonal berries, creamy lemon curd and powdered cinnamon sugar.', 8.00, 'Multi-grain'),
(5, 'French Toast', 1, 'Custard-dipped brioche bread with whipped butter, powdered cinnamon sugar and berry compote.', 7.00, 'Multi-grain'),
(6, 'Monterrey Club Sandwich', 1,  'Turkey, bacon, avocado, organic mixed greens, tomato, Monterey Jack and mayo on sourdough.', 13.00, 'Multi-grain'),
(7, 'The Traditional', 1, 'Scrambled eggs, bacon, seasoned potatoes, and toast', 12.00, 'Contains gluten'),
(8, 'Cheese Burger', 2, 'Sandwich, Ground beef, dill pickle chips, dill pickle relish, american', 6.00, 'Contains gluten'),
(9, 'Cauliflower Tacos', 2, 'Avocado, radishes, cilantro leaves with tender stems, and lime wedges', 15.00, 'Vegan'),
(10,'BBQ Ribs', 2, 'Full rack of barbecue ribs with a side of fries', 25.00, 'Gluten-free'),
(11, 'Chicken & Veggie Salad', 2, 'Salad, grilled chicken breast, greens, cheese,sour cream', 13.00, 'Gluten-free'),
(12, 'Filet Mignon', 2,'8oz filet mignon with a side of mashed potatoes and green beans', 25.00, 'Gluten-free'),
(13, 'Chicken quesadilla',2, 'Grilled chicken breast, peppers, cheese on a tortilla', 13.00, 'Contains gluten'),
(14, 'Chicken Parmesan', 2, 'Fried chicken topped with Mariana sauce and Parmesan cheese, with a side of spaghetti and mariana sauce', 20.00, 'Contains gluten'),
(15, 'Buffalo Chicken melt',2,'Sandwich Crispy chicken tossed in sauce, cheese', 13.00, 'Contains gluten');