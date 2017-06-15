/*
Jemma Tiongson
Comp 182
Prof Wang
Lab5 - Ch.4: ADT List
Purpose: Interface ListInterface

Instructions:
Compile - javac ListInterface.java ListArrayBased.java
Run - java ListIntferface ListArrayBased

 */
public interface ListInterface{
   public boolean isEmpty();
   public int size();
   public void add (int index, Object item);
   public Object get(int index);
   public void remove(int index);
   public void removeAll();
}