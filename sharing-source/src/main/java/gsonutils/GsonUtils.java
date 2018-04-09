package gsonutils;

import com.google.gson.Gson;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2018 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Author rongbin.xie
 * @Description:
 * @Date: Created at 17:30 2018/4/9.
 */
public class GsonUtils {
    private static final Gson gson;
    //初始化
    static {
        gson = new Gson();
    }

    public static String bean2Json(Object object){
        return gson.toJson(object);
    }
}
