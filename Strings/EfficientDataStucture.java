## Design a data structure for efficient addition and removal of keys and values. You can use java library.

  public class EfficientDataStructure {
    private Map<Integer, String> map;

    private EfficientDataStructure(){
        map = new LinkedHashMap<>();  // This constructor initializes the map when an instance of EfficientDataStructure is created.
    }                                 // Prevents NullPointerException before performing operations like put or remove
                                      // If the map were reinitialized in each method, every operation would create a new empty map, losing previously stored data.

    private void add(int key, String value){
        map.put(key, value);
    }

    private  void remove(int key){
        map.remove(key);
    }

    private String getValue(int key){
        return map.getOrDefault(key, null);
    }
    public static void main(String[] args) {
      EfficientDataStructure ds = new EfficientDataStructure();
      ds.add(1, "One");
      ds.add(2, "Two");

      System.out.println(ds.getValue(1));  // this gives value

      ds.remove(1);

      System.out.println(ds.getValue(1));
    }
}


//  public void add(int key, String value) {
//  Map<Integer, String> map = new LinkedHashMap<>(); // BAD: New map every time!
//  map.put(key, value);  // Each call creates a fresh map
// }



// Output
- One
- null  (as deleted)
