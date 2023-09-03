package com.isyundong.gof23.singleton;

public class Triple {

    private static Triple[] triples = new Triple[] {
            new Triple(),
            new Triple(),
            new Triple()
    };

    private Triple() {
    }

    public static Triple getInstance(int id) {
        if (id > 2) {
            throw new RuntimeException("Triple 不存在.");
        }
        return triples[id];
    }
}
