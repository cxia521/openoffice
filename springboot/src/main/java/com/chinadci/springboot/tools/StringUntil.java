package com.chinadci.springboot.tools;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;

/**
 * @program: springboot
 * @description:
 * @author: keke
 * @create: 2021-05-13 17:47
 **/
public class StringUntil {
    public static boolean IsNullOrEmpty(Object obj) {
        boolean isEmpty = false;
        if (obj == null) {
            isEmpty = true;
        } else if (obj instanceof String) {
            isEmpty = ((String) obj).trim().isEmpty();
        } else if (obj instanceof Collection) {
            isEmpty = (((Collection) obj).size() == 0);
        } else if (obj instanceof Map) {
            isEmpty = ((Map) obj).size() == 0;
        } else if (obj.getClass().isArray()) {
            isEmpty = Array.getLength(obj) == 0;
        }
        return isEmpty;

    }
}
