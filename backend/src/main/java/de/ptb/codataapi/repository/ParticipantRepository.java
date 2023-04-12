package de.ptb.codataapi.repository;

import de.ptb.codataapi.model.Participant;

import de.ptb.codataapi.model.Report;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ParticipantRepository {
    public List<Participant> participantList = new ArrayList<Participant>();
    public List<Report> reportList = new ArrayList<Report>();

    public List<Participant> getAllParticipants() {
        return participantList;
    }

    public List<Report> getAllReports() {
        return reportList;
    }

    //    public Participant findById(int id){
//        for (int i = 0; i < participantList.size(); i++) {
//            if (participantList.get(i).getId() == (id)) {
//                return participantList.get(i);
//            }
//        }
//        return null;
//    }
    public boolean delete(Long id) {
        var isRemoved = participantList.removeIf(x -> x.getId().equals(id));
        return isRemoved;
    }
public void deleteAll(){
        participantList.removeAll(participantList);
}
    public Participant update(Participant p) {
        int idx = 0;
        int id = 0;
        for (int i = 0; i < participantList.size(); i++) {
            if (participantList.get(i).getId() == (p.getId())) {
                id = Math.toIntExact(p.getId());
                idx = i;
                break;
            }
        }
        Participant participant = new Participant();
        participant.setId(p.getId());
        participant.setName(p.getName());
        participant.setDccPid(p.getDccPid());
        participantList.add(participant);
        return participant;
    }

    public Participant addParticipant(Participant p) {
        Participant participant = new Participant();
        participant.setId(p.getId());
        participant.setName(p.getName());
        participant.setDccPid(p.getDccPid());
        participantList.add(participant);
        return participant;
    }

    public Report addReport(Report r) {
        Report report = new Report();
        report.setPidReport(r.getPidReport());
        report.setParticipantList(r.getParticipantList());
        reportList.add(report);
        return report;
    }
}
