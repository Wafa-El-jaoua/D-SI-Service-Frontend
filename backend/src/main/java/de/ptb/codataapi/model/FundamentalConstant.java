package de.ptb.codataapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import de.ptb.codataapi.dtos.ConstantDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Immutable;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

import static jakarta.persistence.TemporalType.TIMESTAMP;

@Entity
@Table(name = "codata")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FundamentalConstant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String pid;
    private String bipmPID;
    private Boolean dSIApproved;
    private String label;
    private String quantityType;
    private Double value;
    private String unit;
//    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private Date dateTime;
    private int uncertainty;
    private String distribution;
}
