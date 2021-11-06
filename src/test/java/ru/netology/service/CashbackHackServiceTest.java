package ru.netology.service;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @org.junit.Test
    public void shouldRemain1IfAmountIs999() {
        assertEquals(1, service.remain(999));
    }

    @org.junit.Test
    public void shouldRemain0IfAmountIs1000() {
        assertEquals(0, service.remain(1000));
    }

    @org.junit.Test
    public void shouldRemain999IfAmountIs1001() {
        assertEquals(999, service.remain(1001));
    }

    @org.junit.Test
    public void shouldRemain1000IfAmountIs0() {
        assertEquals(1000, service.remain(0));
    }
}
