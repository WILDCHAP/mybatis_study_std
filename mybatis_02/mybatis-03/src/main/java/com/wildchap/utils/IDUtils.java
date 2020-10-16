package com.wildchap.utils;

import org.apache.ibatis.annotations.Delete;
import org.junit.jupiter.api.Test;

import java.util.UUID;

public class IDUtils {
    public int getRandomId(){
        return UUID.randomUUID().clockSequence();
    }
}
