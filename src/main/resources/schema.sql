DROP TABLE IF EXISTS TBL_EMPLOYEES;
  
CREATE TABLE OrderEntity  (
  orderId INT AUTO_INCREMENT  PRIMARY KEY,
  restaurantId varchar(20),
  totalPrice decimal(8,2) NOT NULL,
  orderTime Number(250) NOT NULL,
  specialNote VARCHAR(250),
  deliveryTime Number(20),
  note varchar(250),
  CONSTRAINT fk_menu FOREIGN KEY (menuid) REFERENCES menuitem (menuid),
  CONSTRAINT fk_restaurant FOREIGN KEY (restaurantid) REFERENCES Restaurant (restaurantid)
);