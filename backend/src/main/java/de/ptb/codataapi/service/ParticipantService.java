package de.ptb.codataapi.service;



import de.ptb.codataapi.model.Participant;
import de.ptb.codataapi.model.Report;

import java.util.List;

public interface ParticipantService {
    List<Participant> getParticipantList();
    List<Report> getReportList();

     boolean delete(long id);
     void deleteAll();
     Participant addParticipant(Participant participant);
     Participant update(Participant p);
     Report addReport(Report report);
//    public String encode(String value);
//    public String decode(String base64);
}
