package object.olympic.domain.Games.entity;

import java.time.LocalDateTime;

public class GameForTicketing {
    private String eventName;//경기 종목
    private LocalDateTime gameDate; //경기 일자
    private String venue; //경기 장소
    private int remainingSeats; //잔여 좌석
}
