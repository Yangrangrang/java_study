package time.test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TestZone {

    public static void main(String[] args) {
        LocalDateTime seoulDateTime = LocalDateTime.of(2024, 1, 1, 9, 0, 0);
        ZonedDateTime zoneSeoul = ZonedDateTime.of(seoulDateTime, ZoneId.of("Asia/Seoul"));
        ZonedDateTime zoneLondon = zoneSeoul.withZoneSameInstant(ZoneId.of("Europe/London"));
        ZonedDateTime zonedNewYork = zoneSeoul.withZoneSameInstant(ZoneId.of("America/New_York"));

        System.out.println("서울의 회의 시간 = " + zoneSeoul);
        System.out.println("런던의 회의 시간 = " + zoneLondon);
        System.out.println("뉴욕의 회의 시간 = " + zonedNewYork);
    }
}
