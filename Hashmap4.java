import java.util.HashMap;
import java.util.Set;
import java.util.Collection;
import java.util.Map.Entry;
class Test1
{
  public static void main(String[] args)
  {
    HashMap<String,String> map = new HashMap<>();
	map.put("abc@gmai.com","abc@123");
	map.put("xyz@yahoo.com","xyz@321");
	map.put("someuser@xyz.com","somexyz");
	Set<Entry<String,String>> set = map.entrySet();
	for(Entry<String,String> s : set)
	  System.out.println(s.getKey()+"  "+s.getValue());
  }
 }