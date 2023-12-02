package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MaxTest {

    @Test
    void when0and3and1Then3() {
        int a = 0;
        int b = 3;
        int c = 1;
        int exepted = 3;
        int result = Max.max(a, b, c);
        assertThat(result).isEqualTo(exepted);
    }
}