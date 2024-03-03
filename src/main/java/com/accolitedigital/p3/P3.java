package com.accolitedigital.p3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class P3 {

    /*
    the purpose of this method is to real file and return contents in List<String>
    Do not change this method.
     */
    public List<String> readFile() throws IOException {
        var lines=Files.readAllLines(Path.of("src/main/resources/datafile.txt"));
        return lines;
    }
}
