BEGIN
   FOR loan IN (
      SELECT customer_id, loan_id, due_date 
      FROM loans 
      WHERE due_date <= SYSDATE + 30
   ) LOOP
      DBMS_OUTPUT.PUT_LINE(
         'Reminder: Loan ID ' || loan.loan_id || ' for Customer ' || loan.customer_id || 
         ' is due on ' || TO_CHAR(loan.due_date, 'DD-MON-YYYY')
      );
   END LOOP;
END;
/
