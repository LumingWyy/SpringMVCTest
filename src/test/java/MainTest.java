import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void test() {
        JSONObject object = new JSONObject();
        object.put("name", "杰哥");
        object.put("age", 18);
        JSONArray array = new JSONArray();
        array.add(object);
        System.out.println(array.toJSONString());
        System.out.println(object.toJSONString());
    }
}
