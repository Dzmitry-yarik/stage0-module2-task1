package com.mjc.stage0;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.charset.StandardCharsets.UTF_8;

public class FirstApplication {
    public static void main(String[] args) throws IOException {
        String fileName = "src/main/java/talks/mjc/FirstApplication.java";
         String searc = "Write your code here!";
        String replac = "Hello, World! System.out.println";
        Charset charset = UTF_8;
        Path path = Paths.get(fileName);
        String content = new String(Files.readAllBytes(path), charset);
        content = content.replaceAll(searc, replac);
        Files.write(path, content.getBytes(charset));
        System.out.println(content);
    }
}
