package roomescape.dto;

public record ReservationResponse(Long id, String name, String date, ReservationTimeResponse time) {
}
