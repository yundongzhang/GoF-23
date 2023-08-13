package com.isyundong.gof23.adapter.practice.file;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.UUID;

public class FileProperties extends Properties implements FileIO {

    @Override
    public void readFromFile(String filename) throws IOException {
        try (FileReader fr = new FileReader(filename)) {
            super.load(fr);
        }
    }

    @Override
    public void writeToFile(String filename) throws IOException {
        try (FileWriter fw = new FileWriter(filename)) {
            super.store(fw, UUID.randomUUID().toString());
        }
    }

    @Override
    public void setValue(String key, String value) {
        super.setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return super.getProperty(key);
    }
}
