package main.domain;

import java.io.Serializable;

public interface IDevice extends Serializable {
    default void print() {
        System.out.println(toString());
    }
}
