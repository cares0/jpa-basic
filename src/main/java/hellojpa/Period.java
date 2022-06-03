package hellojpa;

import javax.persistence.Embeddable;
import java.time.LocalDateTime;

@Embeddable
public class Period {

    private LocalDateTime startDate;
    private LocalDateTime endDate;

    public boolean isWork() {
        if(startDate.isAfter(LocalDateTime.now()) && endDate.isBefore(LocalDateTime.now())) {
            return true;
        }
        return false;
    }
}
