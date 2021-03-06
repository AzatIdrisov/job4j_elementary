package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {

    @Test
    public void whenSortArrayWith3Elements() {
        int[] input = new int[]{3, 4, 1};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[]{1, 3, 4};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortArrayWith5Elements() {
        int[] input = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[]{1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortArrayWith8Elements() {
        int[] input = new int[]{3, 4, 1, 2, 5, 10, 15, 20};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[]{1, 2, 3, 4, 5, 10, 15, 20};
        assertThat(result, is(expect));
    }
}