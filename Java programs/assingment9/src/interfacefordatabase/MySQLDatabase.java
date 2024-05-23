package interfacefordatabase;

class MySQLDatabase implements DatabaseOperations {
    @Override
    public void create(String data) {
        System.out.println("MySQL: Creating data - " + data);
    }

    @Override
    public String read(int id) {
        System.out.println("MySQL: Reading data with id - " + id);
        return "Data from MySQL for id " + id;
    }

    @Override
    public void update(int id, String newData) {
        System.out.println("MySQL: Updating data with id " + id + " to " + newData);
    }

    @Override
    public void delete(int id) {
        System.out.println("MySQL: Deleting data with id - " + id);
    }
}