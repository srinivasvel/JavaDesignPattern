package com.srini.design.patterns.decorator;

public interface DataSource {
    void writeData(String data);

    String readData();
}