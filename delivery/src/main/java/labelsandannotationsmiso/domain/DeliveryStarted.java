package labelsandannotationsmiso.domain;

import java.time.LocalDate;
import java.util.*;
import labelsandannotationsmiso.domain.*;
import labelsandannotationsmiso.infra.AbstractEvent;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class DeliveryStarted extends AbstractEvent {

    private Long id;

    public DeliveryStarted(Delivery aggregate) {
        super(aggregate);
    }

    public DeliveryStarted() {
        super();
    }
}
//>>> DDD / Domain Event
