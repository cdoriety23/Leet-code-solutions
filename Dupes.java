import java.util.LinkedList;
import java.util.List;
public class Dupes{
	

// LeetCode Problem that looks for dupes in a LinkedList
}
public static class ListNodedeleteDuplicates(ListNode head) 
	{
        List current = head;
        
        while(current !=null && current.next!=null)
        {
            if(current.next.val== current.val)
            {
            current.next = current.next.next;
        }
        else
         {
            current=current.next;
        }
     }return head;
    }
}