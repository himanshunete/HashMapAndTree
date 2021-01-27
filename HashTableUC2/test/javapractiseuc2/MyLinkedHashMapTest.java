package javapractiseuc2;

import org.junit.Assert ;
import org.junit.Test;

public class MyLinkedHashMapTest {

	@Test
    public void givenParagraph_WhenWordsAreAddedToList_ShouldReturnWordFrequency() {
        String sentence =   "Paranoids are not paranoid because they are paranoid but "+ 
        		            "because they keep putting themselves deliberately into "+
        		            "paranoid avoidable situations";
        MyLinkedHashMap<String, Integer> myLinkedHashMap = new MyLinkedHashMap<>() ;
        String[] words = sentence.toLowerCase().split(" ");
        for ( String word : words ) {
        	Integer value = myLinkedHashMap.get(word) ;
        	if (value == null )  value = 1;
        	else value = value + 1;
        	myLinkedHashMap.add(word, value) ;
        }
        
        myLinkedHashMap.remove("avoidable") ;
        
        int frequency = myLinkedHashMap.get("they") ;
        System.out.println(myLinkedHashMap);
        Assert.assertEquals( 3, frequency);
    }
}
