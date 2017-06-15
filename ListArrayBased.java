/*
Jemma Tiongson
Comp 182
Prof Wang
Lab5 - Ch.4: ADT List
Purpose: Interface ListArrayBased

Instructions:
Compile - javac ListInterface.java ListArrayBased.java
Run - java ListIntferface ListArrayBased

 */
public class ListArrayBased implements ListInterface{
   private static final int MAX_LIST = 50;
   private Object items[];
   private int numItems;
   
   public ListArrayBased(){
      items = new Object[MAX_LIST];
      numItems = 0;
   }
   public boolean isEmpty(){
      return (numItems == 0);
   }
   public int size(){
      return numItems;
   }
   public void removeAll(){
      items = new Object[MAX_LIST];
      numItems = 0;
   }
   public void add(int index, Object item){
      if(index >= 0 && index <= numItems){
         for(int pos = numItems; pos >= index; pos--){
            items[pos+1] = items[pos];
         }
         items[index] = item;
         numItems++;
      }
   }
   public Object get(int index){
      Object res = 0;
      if(index >= 0 && index <numItems){
         res  = items[index];
      }
      return res;
   }
   public void remove(int index){
      if(index >= 0 && index < numItems){
         for(int pos = index+1; pos <= size(); pos++){
            items[pos-1] = items[pos];
         }
         numItems--;
      }
   }
   
   public static void main(String [] args){
      ListArrayBased aList = new ListArrayBased();
      System.out.println("Is list Empty? "+aList.isEmpty());
      aList.add(0,"Cathryn");
      String dataItem = (String)aList.get(0);
      System.out.println(dataItem);
      aList.add(1,"James");
      String dataItem1 = (String)aList.get(1);
      System.out.println(dataItem1);
      aList.add(2,"Mari");
      String dataItem2 = (String)aList.get(2);
      System.out.println(dataItem2);
      aList.add(3,"Max");
      String dataItem3 = (String)aList.get(3);
      System.out.println(dataItem3);
      aList.add(4,"Jonathan");
      String dataItem4 = (String)aList.get(4);
      System.out.println(dataItem4);
      aList.add(5,"Natalie");
      String dataItem5 = (String)aList.get(5);
      System.out.println(dataItem5);
      
      
      System.out.print("Is list Empty? "+aList.isEmpty());
      
      int numItems = aList.size();
      System.out.println(" = "+numItems+" items");
   
      aList.remove(2);
      int numItems2 = aList.size();
      System.out.println("After removing index 2: "+numItems2+" items left");
      aList.remove(0);
      int numItems3 = aList.size();
      System.out.println("After removing index 0: "+numItems3+" items left");
   
      String res = (String)aList.get(3);
      System.out.println("After removing 2 indexes, who is now at index 3?: "+res);
      
      aList.removeAll();
      int numItems4 = aList.size();
      System.out.println("After calling method 'removeAll': "+numItems4+" items left");
   }
}

/*
Result:

Is list Empty? true
Cathryn
James
Mari
Max
Jonathan
Natalie
Is list Empty? false = 6 items
After removing index 2: 5 items left
After removing index 0: 4 items left
After removing 2 indexes, who is now at index 3?: Natalie
After calling method 'removeAll': 0 items left

 */