package task_6;
import java.util.ArrayList;
import java.util.Arrays;
 class DList<E> 
{
  private int size = 0;
  private static final int DEFAULT_CAPACITY = 10;
  private Object ele[];
  public DList() {
      ele = new Object[DEFAULT_CAPACITY];
  }
  public void add(E e) {
      if (size == ele.length) {
          ensureCapacity();
      }
      ele[size++] = e;
  }
  public E get(int i) {
      if (i >= size || i < 0) {
          throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
      }
      return (E) ele[i];
  }
  public E remove(int i) {
      if (i >= size || i < 0) {
          throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
      }
      Object item = ele[i];
      int num = ele.length - ( i + 1 ) ;
      System.arraycopy( ele, i + 1, ele, i, num ) ;
      size--;
      return (E) item;
  }
  public int size() {
      return size;
  }
  public String toString() 
  {
       StringBuilder sb = new StringBuilder();
       sb.append('[');
       for(int i = 0; i < size ;i++) {
           sb.append(ele[i].toString());
           if(i<size-1){
               sb.append(",");
           }
       }
       sb.append(']');
       return sb.toString();
  }
   
  private void ensureCapacity() {
      int newSize = ele.length * 2;
      ele = Arrays.copyOf(ele, newSize);
  }
}
public class Custom_coll {
		  public static void main(String[] args) 
		  {
			 
		      DList<Integer> list = new DList<Integer>();
		DList<String> sList=new DList<String>();
		      list.add(1);
		      list.add(5);
		      list.add(8);
		      list.add(4);
		      list.add(3);
		      list.add(7);

		      list.add(9);
		      list.add(3);
		      list.add(1);

		      list.add(0);
		      list.add(7);
		      list.add(9);
		      sList.add("sunday");
		      sList.add("monday");
		      sList.add("tuesday");
		      sList.add("wednesday");
		      sList.add("thursday");
		      System.out.println("Elements in String List : "+sList);
		      System.out.println("Elements in the Integer List: "+list);
		       
		      //Remove elements from index
		     
		      
		      list.remove(3);
		      
		      System.out.println("List After Removing: "+list);
		     
		      //Get element with index
		      
		      System.out.println( "ELEMENT AT 0TH INDEX : "+list.get(3) );
		      System.out.println("ELEMENT AT 1ST INDEX : "+ list.get(2) );
		      System.out.println("ELEMENT AT 5TH INDEX : "+ list.get(10) );
		      //List Size
		      System.out.println("SIZE OF THE STRING LIST : "+sList.size());
		      System.out.println("SIZE OF THE INTEGER LIST : "+list.size());
		  }
}