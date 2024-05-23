package interfacefordatabase;

public class Main {
    public static void main(String[] args) {
        DatabaseOperations mysqlDB = new MySQLDatabase();
        mysqlDB.create("Some data");
        System.out.println(mysqlDB.read(1));
        mysqlDB.update(1, "New data");
        mysqlDB.delete(1);

        DatabaseOperations oracleDB = new OracleDatabase();
        oracleDB.create("Some data");
        System.out.println(oracleDB.read(2));
        oracleDB.update(2, "New data");
        oracleDB.delete(2);
    }
}