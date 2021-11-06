package ru.netology.service;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @org.testng.annotations.Test
    public void shouldRemain1IfAmountIs999() {
        assertEquals(service.remain(999), 1);
    }

    @org.testng.annotations.Test
    public void shouldRemain0IfAmountIs1000() {
        assertEquals(service.remain(1000), 0);
    }

    @org.testng.annotations.Test
    public void shouldRemain999IfAmountIs1001() {
        assertEquals(service.remain(1001), 999);
    }

    @org.testng.annotations.Test
    public void shouldRemain1000IfAmountIs0() {
        assertEquals(service.remain(0), 1000);
    }
}
