package jihekuangjia.t04;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class T04 {
    public static void main(String[] args) {
        HashMap map=new HashMap();

        map.put("01","小明");
        map.put("02","小美");
        map.put("03","小亮");

        //根据key获取对应的value
        String value1 = (String) map.get("01");
        System.out.println(value1);
        //打印key集合
        Set set = map.keySet();
        System.out.println(set);
        //打印value集合
        Collection values = map.values();
        System.out.println(values);
        //直接打印，格式是键值对的形式
        System.out.println(map);

        //遍历Map
        //先获取key集合
        //再通过Set继承的Collection中的iterator方法，创建一个迭代器对象。注意，不是所有的对象创建都是new出来的，还可以通过引用方法来创建
        Iterator iterator = set.iterator();
        //通过iterator中的hasNext()来判断是否存在下一个可访问元素
        while (iterator.hasNext()){
            //通过iterator中的next()来获取下一个元素
            String key = (String)iterator.next();
            //通过get(key)来获取value
            String v=(String)map.get(key);

            //输出
            System.out.println(key+":"+v);
        }

        //containsKey判断key中是否存在该值
        boolean b = map.containsKey("01");
        System.out.println(b);
        //containsValue判断value中是否存在该值
        boolean c = map.containsValue("01");
        System.out.println(c);

    }
}
