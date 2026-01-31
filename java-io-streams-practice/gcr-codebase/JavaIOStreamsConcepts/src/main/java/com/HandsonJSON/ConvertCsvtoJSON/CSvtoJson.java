package com.HandsonJSON.ConvertCsvtoJSON;

import com.fasterxml.jackson.dataformat.csv.*;
import com.fasterxml.jackson.databind.*;
import java.io.File;

public class CSvtoJson {
    public static void main(String[] args) throws Exception {

        CsvSchema schema = CsvSchema.emptySchema().withHeader();
        CsvMapper csvMapper = new CsvMapper();

        MappingIterator<JsonNode> it =
            csvMapper.readerFor(JsonNode.class)
                     .with(schema)
                     .readValues(new File("data.csv"));

        ObjectMapper jsonMapper = new ObjectMapper();
        System.out.println(jsonMapper.writeValueAsString(it.readAll()));
    }
}

