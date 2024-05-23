package interfacefordatabase;


class OracleDatabase implements DatabaseOperations {
    @Override
    public void create(String data) {
        System.out.println("Oracle: Creating data - " + data);
    }

    @Override
    public String read(int id) {
        System.out.println("Oracle: Reading data with id - " + id);
        return "Data from Oracle for id " + id;
    }

    @Override
    public void update(int id, String newData) {
        System.out.println("Oracle: Updating data with id " + id + " to " + newData);
    }

    @Override
    public void delete(int id) {
        System.out.println("Oracle: Deleting data with id - " + id);
    }
}
