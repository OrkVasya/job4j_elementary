package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax3To5Then5() {
        int left = 3;
        int right = 5;
        int result = Max.max(left, right);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax10To10Then10() {
        int num = 10;
        int result = Max.max(num, num);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax3To5To7Then7() {
        int first = 3;
        int second = 5;
        int third = 7;
        int result = Max.max(first, second, third);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax3To5To7To10Then10() {
        int first = 3;
        int second = 5;
        int third = 7;
        int forth = 10;
        int result = Max.max(first, second, third, forth);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }
}