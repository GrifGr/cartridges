DROP TABLE IF EXISTS cartridges;
DROP TABLE IF EXISTS modelcartridge;


CREATE TABLE modelcartridge (  id SERIAL PRIMARY KEY, 
                        name VARCHAR(255));
CREATE TABLE cartridges (  id SERIAL PRIMARY KEY, 
                        number INTEGER,
                        model_id INTEGER REFERENCES modelcartridge (id) ON DELETE CASCADE,                        
                        givetouser_date DATE,
                        getfromuser_date DATE,
                        getfromservice_date DATE,
                        UNIQUE (number));   