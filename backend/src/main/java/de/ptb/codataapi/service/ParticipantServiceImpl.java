package de.ptb.codataapi.service;

import de.ptb.codataapi.model.Participant;
import de.ptb.codataapi.model.Report;
import de.ptb.codataapi.repository.ParticipantRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
@Service
@AllArgsConstructor
@Slf4j
public class ParticipantServiceImpl implements ParticipantService{
    ParticipantRepository participantRepository;

    @Override
    public List<Participant> getParticipantList() {

        return participantRepository.getAllParticipants() ;
    }

    @Override
    public List<Report> getReportList() {
        return participantRepository.getAllReports();
    }


    @Override
    public boolean delete(long id) {
        var isRemoved = participantRepository.delete(id);
        return  isRemoved;
    }

    @Override
    public void deleteAll() {
        participantRepository.deleteAll();
    }

    @Override
    public Participant addParticipant(Participant participant) {
        return  participantRepository.addParticipant(participant);
    }

    @Override
    public Participant update(Participant participant) {
        return participantRepository.update(participant);
    }

    @Override
    public Report addReport(Report report) {
        return participantRepository.addReport(report);
    }

}