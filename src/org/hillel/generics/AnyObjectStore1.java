package org.hillel.generics;

public class AnyObjectStore1<T> {

    private T id;

    private String name;

    public AnyObjectStore1(T id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("AnyObjectStore1\n");
        sb.append("id = ").append(id);
        sb.append(", name = '").append(name);
        sb.append(" \n");
        return sb.toString();
    }


}

