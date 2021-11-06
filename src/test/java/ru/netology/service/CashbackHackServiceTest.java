package ru.netology.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldRemain1IfAmountIs999() {
        assertEquals(1, service.remain(999));
    }

    @Test
    public void shouldRemain0IfAmountIs1000() {
        assertEquals(0, service.remain(1000));
    }

    @Test
    public void shouldRemain999IfAmountIs1001() {
        assertEquals(999, service.remain(1001));
    }

    @Test
    public void shouldRemain1000IfAmountIs0() {
        assertEquals(1000, service.remain(0));
    }
}
