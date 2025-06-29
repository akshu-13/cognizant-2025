BEGIN
   FOR cust IN (SELECT customer_id, age FROM customers WHERE age > 60) LOOP
      UPDATE customers
      SET interest_rate = interest_rate * 0.99
      WHERE customer_id = cust.customer_id;
   END LOOP;
   COMMIT;
END;
/
