package labelsandannotationsmiso.domain;

import java.time.LocalDate;
import java.util.*;
import labelsandannotationsmiso.domain.*;
import labelsandannotationsmiso.infra.AbstractEvent;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class StockDecreased extends AbstractEvent {

    private Long id;

    public StockDecreased(Inventory aggregate) {
        super(aggregate);
    }

    public StockDecreased() {
        super();
    }
}
//>>> DDD / Domain Event
