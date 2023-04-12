package de.ptb.codataapi.model;

import lombok.*;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@NoArgsConstructor
public class Report  implements Serializable {
    private String pidReport;
    private List<Participant> participantList;
}
