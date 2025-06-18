package labelsandannotationsmiso.domain;

import java.util.*;
import labelsandannotationsmiso.domain.*;
import labelsandannotationsmiso.infra.AbstractEvent;
import lombok.*;

@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
}
