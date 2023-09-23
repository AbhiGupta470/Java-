// It is solved using a naive approach
import java.util.*;
public class Main
{
    static String Sort(String str)
    {
        String emp = "";
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        for(char ele: arr)
        {
            emp+=ele;
        }
        return emp;
    }
    static void Set(ArrayList<String> list, int index, String o)
    {
       for(int i=0; i<list.size(); i++)
       {
           if(i==index)
           {
               
               String element = list.get(i);
               list.remove(index);
               element = o;
               list.add(index, element);
               break;
           }
       }
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String str = sc.nextLine();
		String[] arr = str.split(" ");
		ArrayList<String> list = new ArrayList<String>();
		for(String ele: arr)
		{
		    list.add(Sort(ele));
		}
		List<List<String>> res = new ArrayList<>();
		for(String ele: arr)
		{
		    List<String> li = new ArrayList<String>();
		    while(list.contains(Sort(ele))) 
		    {
		        int idx = list.indexOf(Sort(ele));
		        li.add(arr[idx]);
		      //  list.set(idx, null);
		      Set(list, idx, null);
		    }
		    if(!li.isEmpty())
		    res.add(li);
		    
		}
		System.out.println(res);
	}
}
