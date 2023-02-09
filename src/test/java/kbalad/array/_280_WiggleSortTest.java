package kbalad.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class _280_WiggleSortTest {

    @Test
    void wiggleSort_1() {
        int[] nums = {3,5,2,1,6,4};

        new _280_WiggleSort().wiggleSort(nums);
        int[] e = {3,5,1,6,2,4};

        assertArrayEquals(e, nums);
    }

    @Test
    void wiggleSort_2() {
        int[] nums = {1,2,3};

        new _280_WiggleSort().wiggleSort(nums);
        int[] e = {1,3,2};

        assertArrayEquals(e, nums);
    }

    @Test
    void wiggleSort_3() {
        int[] nums = {6,6,5,6,3,8};

        new _280_WiggleSort().wiggleSort(nums);
        int[] e = {6,6,5,6,3,8};

        assertArrayEquals(e, nums);
    }
}