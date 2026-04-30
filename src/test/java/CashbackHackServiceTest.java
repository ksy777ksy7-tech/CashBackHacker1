package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {

    @Test
    public void test900() {
        CashbackHackService service = new CashbackHackService();

        int result = service.remain(900);

        Assert.assertEquals(result, 100);
    }

    @Test
    public void test1000() {
        CashbackHackService service = new CashbackHackService();

        int result = service.remain(1000);

        Assert.assertEquals(result, 0); // 💥 УПАДЁТ
    }
}