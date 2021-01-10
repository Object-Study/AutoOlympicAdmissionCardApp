package object.olympic.domain.Ticket.entity;

import java.time.LocalDateTime;

public class Ticket {
    private QRcode qrCode;
    private String eventName;//경기 종목
    private LocalDateTime gameDate; //경기 일자
    private String venue; //경기 장소
    private int SeatNumber; //좌석 번호
}
