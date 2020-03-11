/*
 * Copyright (C) zedao.com. All rights reserved
 */
package com.dashan.exam.util;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * JSONUtil
 *
 * @author zd
 * @since 2019-10-06
 */
public class JSONUtil {

    private static final Logger logger = LoggerFactory.getLogger(JSONUtil.class);

    /**
     * 将json转化为实体POJO
     *
     * @param jsonStr
     * @param obj
     * @return
     */
    public static <T> Object JSONToObj(String jsonStr, Class<T> obj) {
        T t = null;
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            t = objectMapper.readValue(jsonStr, obj);
        } catch (Exception e) {
            logger.error("提交jsonStr: {} 格式错误，转换失败", jsonStr);
            return null;
        }
        return t;
    }

    /**
     * json数组转换为List
     *
     * @param jsonStr
     * @param collectionClass
     * @param elementClasses
     * @param <T>
     * @return
     * @throws IOException
     */
    public static <T> Object JSONToList(String jsonStr, Class<T> collectionClass, Class<?>... elementClasses) {
        T t = null;
        if (StringUtils.isEmpty(jsonStr)) {
            return null;
        }
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            JavaType javaType = objectMapper.getTypeFactory().constructParametricType(collectionClass, elementClasses);
            t = objectMapper.readValue(jsonStr, javaType);
        } catch (Exception e) {
            logger.error("提交jsonStr: {} 格式错误，转换失败", jsonStr);
            return null;
        }
        return t;
    }

    /**
     * 将实体POJO转化为JSON
     *
     * @param obj
     * @return
     * @throws JsonProcessingException
     */
    public static <T> String objectToJSON(T obj) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        // Convert object to JSON string
        //Include.NON_NULL 属性为NULL 不序列化
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        String jsonStr = null;
        try {
            jsonStr = mapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            throw e;
        }
        return jsonStr;
    }

    public static String mapToJSON(Map<String, Object> map) {
        ObjectMapper mapper = new ObjectMapper();
        // Convert object to JSON string
        String jsonStr = null;
        try {
            jsonStr = mapper.writeValueAsString(map);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return jsonStr;
    }

    public static String convMapToJSON(Map<String, String> map) {
        ObjectMapper mapper = new ObjectMapper();
        // Convert object to JSON string
        String jsonStr = null;
        try {
            jsonStr = mapper.writeValueAsString(map);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return jsonStr;
    }

    public static String convMsg(String[][] params, String message) {
        try {
            Map<String, Object> map = new HashMap<>();
            for (String[] param : params) {
                map.put(param[0], param[1]);
            }
            map.put("message", message);
            return objectToJSON(map);
        } catch (Exception ex) {
            //ignore
        }
        return "";
    }

    /**
     * 产生JSON数据,但对象模式
     *
     * @param object the object
     * @return string
     */
    public static String toString(Object object) {
        if (object == null) {
            return null;
        }
        if (object instanceof Collection) {
            if (CollectionUtils.isEmpty((Collection) object)) {
                return null;
            }
        }
        return JSON.toJSONString(object);
    }

    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("entityId", null);
        map.put("seatCode", null);
        map.put("orderId", null);
//        Cart cart = new Cart();
//        cart.setImagePath("");
//        map.put("customerRegisterId", cart);
//        String method = Thread.currentThread().getStackTrace()[1].getMethodName();
//        System.err.println(mapToJSON(map) + method);

    }

}
