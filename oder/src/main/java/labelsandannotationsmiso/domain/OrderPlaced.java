package labelsandannotationsmiso.domain;

import java.time.LocalDate;
import java.util.*;
import labelsandannotationsmiso.domain.*;
import labelsandannotationsmiso.infra.AbstractEvent;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;

    public OrderPlaced(Order aggregate) {
        super(aggregate);
    }

    public OrderPlaced() {
        super();
    }
}
//>>> DDD / Domain Event
