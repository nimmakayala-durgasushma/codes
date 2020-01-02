import java.util.HashMap;
class Test1
{
  public static void main(String[] args)
  {
    HashMap<String,String> map = new HashMap<>();
	map.put("abc@gmai.com","abc@123");
	map.put("xyz@yahoo.com","xyz@321");
	map.put("someuser@xyz.com","somexyz");
	System.out.println(map.size());
  }
 }