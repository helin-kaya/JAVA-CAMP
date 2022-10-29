package abstractDemo;

public class CustomerManager {
    BaseDatabaseManager databaseManager;

    public void getCustomers() {
        databaseManager.getData();
        // OracleDatabaseManager oracleDatabaseManager=new OracleDatabaseManager();
        // oracleDatabaseManager.getData(); bu şekilde yapılırsa oracle a bağımlı oluyor o yuzden başka şekidle yaazmaılıyız
    }
}
