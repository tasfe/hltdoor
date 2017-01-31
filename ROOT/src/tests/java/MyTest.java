import com.hltdoor.MyHttpRequest;
import org.apache.commons.lang.RandomStringUtils;
import org.junit.Test;
import redis.clients.jedis.Jedis;

/**
 * Created by linwei on 2016/12/27.
 *
 */
public class MyTest {

    @Test
    public void get()
    {
        String res = new MyHttpRequest().httpsGet("https://www.baidu.com");
        System.out.println(res);
    }


    @Test
    public void testJedis()
    {
        Jedis jedis = new Jedis("127.0.0.1");
        jedis.set("foo","1111");
        System.out.println(jedis.get("foo"));
        String key;
        do {
            key = RandomStringUtils.randomAlphanumeric(10);
        }while (jedis.get(key)!=null);

        jedis.set(key,"0");
        jedis.expire(key,90);
        System.out.println(key);
        System.out.println(jedis.get(key));
    }
}
