import java.util.HashMap;
import java.util.Set;
import java.util.Collection;
class Test1
{
  public static void main(String[] args)
  {
    HashMap<String,String> map = new HashMap<>();
	map.put("abc@gmai.com","abc@123");
	map.put("xyz@yahoo.com","xyz@321");
	map.put("someuser@xyz.com","somexyz");
	Set(<String> keys = map.keySet());
	for(String k : keys)
	  System.out.println(k+" "+map.get(k));
	  Collection<String> values = map.values();
	for(String v : values)
	 System.out.println(v);
  }
 }