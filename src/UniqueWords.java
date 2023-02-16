import java.util.ArrayList;

public class UniqueWords
{
   /**
		counts the number of unique strings in a list
		@param list ArrayList of strings to be examined
		@return number of unique strings in the list
   */
   public static int countUnique(ArrayList<String> list)
   {
	  int count = 0;
		  ArrayList copy = (ArrayList)list.clone();
	      for (int i = 0; i < copy.size(); i++) {		 
	    	  for (int j = i+1; j < copy.size(); j++)
			 {
				if(copy.get(i).equals(copy.get(j))) {
					copy.remove(i);
				}
			 }
	      }
	      count=copy.size()-1;
		  return count;
		
	  //Alternative option
	  //return (int) list.stream().distinct().count();
   }

   public static void main(String[] args)
   {
      ArrayList <String> words = new ArrayList<>();
      words.add("apple");
	  words.add("orange");
	  words.add("blackboard");
	  words.add("apple");
	  words.add("orange");
	  words.add("sun");
	  words.add("moon");
   
	  int unique = countUnique(words);
      System.out.println(words + " has " + unique + " unique words");
   }
}
