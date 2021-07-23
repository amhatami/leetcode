// time Complexity O(NLOGN)
// space Complexity O(N)
public class Main {
    public static void main(String[] args) {
        //input array = [1, 4, 8, 4]
        List<Integer> input1 = new ArrayList<Integer>() {{
            add(1);
            add(4);
            add(8);
            add(4);
                } };
        System.out.println(input1);
        System.out.println(minimizePriority(input1));
        //input array = [1, 4, 8, 4]
        List<Integer> input2 = new ArrayList<Integer>() {{
            add(1);
            add(40);
            add(8);
            add(800);
            add(10000000);
            add(2);
            add(4);
                } };
        System.out.println(input2);
        System.out.println(minimizePriority(input2));
    }
    
// function to minimize input List of integers 
// time Complexity O(NLOGN)
// space Complexity O(N)
static List<Integer> minimizePriority(List<Integer> inputArray) {
      int n = inputArray.size();
// putting the array into a TreeSet
      TreeSet<Integer> tempTreeSet = new TreeSet<>();
      for (int val : inputArray) {
         tempTreeSet.add(val);
      }
//putting the TreeSet into a Map with the priority numbers as keys in sorted order.
      Map<Integer, Integer> tempHashMap = new HashMap<>();
      int priority = 1;
      for(int value : tempTreeSet){
         tempHashMap.put(value,priority);
         priority++;
      }
// putting the Map's with new priorities into array 
      for(int i=0;i<n;i++){
	     inputArray.set(i, tempHashMap.get(inputArray.get(i)));
      }
      
      return inputArray;
   }
    
    
}
