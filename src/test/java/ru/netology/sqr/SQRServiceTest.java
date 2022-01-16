package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @Test
    public void shouldSquareAmount() {
        SQRService service = new SQRService();
        int expected = 6;

        int actual = service.squareAmount(10, 99);

        assertEquals(expected, actual);
    }
}