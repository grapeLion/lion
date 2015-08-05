package cn.grape.lion.annotation;

import com.alibaba.fastjson.JSONObject;

/**
 * Created by solis on 2015/6/16.
 */
public class JSONObjectWrapper {

    private JSONObject JsonObject;

    public JSONObjectWrapper(JSONObject jsonObject) {
        JsonObject = jsonObject;
    }

    public JSONObject getJsonObject() {
        return JsonObject;
    }

    public void setJsonObject(JSONObject jsonObject) {
        JsonObject = jsonObject;
    }
}
