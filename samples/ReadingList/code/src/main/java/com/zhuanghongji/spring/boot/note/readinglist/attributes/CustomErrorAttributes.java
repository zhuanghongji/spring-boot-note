package com.zhuanghongji.spring.boot.note.readinglist.attributes;

import org.springframework.boot.autoconfigure.web.DefaultErrorAttributes;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;

import java.util.Map;

@Component
public class CustomErrorAttributes extends DefaultErrorAttributes {

    @Override
    public Map<String, Object> getErrorAttributes(RequestAttributes requestAttributes, boolean includeStackTrace) {
        //return super.getErrorAttributes(requestAttributes, includeStackTrace);
        Map<String, Object> attributes = super.getErrorAttributes(requestAttributes, includeStackTrace);
        attributes.put("foo", "bar");
        return attributes;
    }
}
