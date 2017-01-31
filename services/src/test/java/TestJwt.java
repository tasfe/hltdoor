import com.hltdoor.JwtUtil;
import org.junit.Test;

import java.io.UnsupportedEncodingException;

/**
 * Created by linwei on 2016/12/26.
 * test jwt
 */

public class TestJwt {
    @Test
    public void testEncode()
    {
        String test = JwtUtil.getToken("zlinwei");
        System.out.println(test);


        System.out.println(JwtUtil.getOpenId(test));


    }


}
