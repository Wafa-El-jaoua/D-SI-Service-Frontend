package de.ptb.codataapi.model;

import lombok.*;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Participant implements Serializable {
    static long instanceCounter=0;
    private  Long  id= Long.valueOf(0);
    private  String name;
    private String  dccPid;
    public Participant() {
        instanceCounter++;
        id=instanceCounter;
    }
}
