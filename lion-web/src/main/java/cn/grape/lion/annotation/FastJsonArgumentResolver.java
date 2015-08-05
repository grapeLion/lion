package cn.grape.lion.annotation;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.codehaus.jackson.map.util.JSONWrappedObject;
import org.springframework.core.MethodParameter;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;

/**
 * Created by solis on 2015/6/16.
 */
public class FastJsonArgumentResolver implements HandlerMethodArgumentResolver {

    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        return parameter.getParameterAnnotation(FastJson.class)!=null;
    }

    @Override
    public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer, NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {

        HttpServletRequest request = webRequest.getNativeRequest(HttpServletRequest.class);
        // content-type����json�Ĳ�����
//        if (!request.getContentType().contains("application/json")) {
//            return null;
//        }

        // ��reqeust��body��ȡ��StringBuilder
        BufferedReader reader = request.getReader();
        StringBuilder sb = new StringBuilder();

        char[] buf = new char[1024];
        int rd;
        while((rd = reader.read(buf)) != -1){
            sb.append(buf, 0, rd);
        }

        // ����fastjsonת��Ϊ��Ӧ������
        if(JSONObjectWrapper.class.isAssignableFrom(parameter.getParameterType())){
            return new JSONObjectWrapper(JSON.parseObject(sb.toString()));
        } else {
            return JSON.parseObject(sb.toString(), parameter.getParameterType());
        }
    }
}
