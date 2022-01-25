package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @Test
    public void shouldSquareAmount() {
        SQRService service = new SQRService();
        int expected = 1;

        int actual = service.squareAmount(10, 100);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSquareNumberRange() {
        SQRService service = new SQRService();
        int expected = 3;

        int actual = service.squareAmount(200, 300);

        assertEquals(expected, actual);
    }
}