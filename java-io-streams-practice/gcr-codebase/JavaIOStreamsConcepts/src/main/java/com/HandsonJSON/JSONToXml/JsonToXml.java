package com.HandsonJSON.JSONToXml;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToXml {
    public static void main(String[] args) throws Exception {

        String json = "{\"name\":\"Ishan\",\"age\":22}";

        ObjectMapper jsonMapper = new ObjectMapper();
        Object obj = jsonMapper.readValue(json, Object.class);

        XmlMapper xmlMapper = new XmlMapper();
        System.out.println(xmlMapper.writeValueAsString(obj));
    }
}
