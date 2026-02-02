package com.collectors.wordfrequencycount;

import java.util.*;
import java.util.stream.*;

public class WordCount {
    public static void main(String[] args) {
        String paragraph = "java streams are powerful and java streams are useful";

        Map<String, Integer> wordCount =
            Arrays.stream(paragraph.toLowerCase().split("\\s+"))
                  .collect(Collectors.toMap(
                      word -> word,
                      word -> 1,
                      Integer::sum
                  ));

        wordCount.forEach((word, count) ->
            System.out.println(word + " = " + count)
        );
    }
}
