package interfacefordatabase;

interface DatabaseOperations {
    void create(String data);
    String read(int id);
    void update(int id, String newData);
    void delete(int id);
}
