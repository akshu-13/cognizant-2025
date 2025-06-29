CREATE OR REPLACE PROCEDURE TransferFunds (
   from_acc_id IN NUMBER,
   to_acc_id IN NUMBER,
   amount IN NUMBER
) IS
   from_balance NUMBER;
BEGIN
   -- Get balance of source account
   SELECT balance INTO from_balance FROM accounts WHERE account_id = from_acc_id FOR UPDATE;

   -- Check sufficient funds
   IF from_balance < amount THEN
      RAISE_APPLICATION_ERROR(-20001, 'Insufficient balance in source account.');
   END IF;

   -- Deduct from source
   UPDATE accounts
   SET balance = balance - amount
   WHERE account_id = from_acc_id;

   -- Add to destination
   UPDATE accounts
   SET balance = balance + amount
   WHERE account_id = to_acc_id;

   COMMIT;
END;
/
