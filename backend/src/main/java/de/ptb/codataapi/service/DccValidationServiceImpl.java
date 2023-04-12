package de.ptb.codataapi.service;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class DccValidationServiceImpl implements DccValidationService {
    @Override
    public boolean validate(String validDcc, String dccPid) {
        return validDcc.equals(dccPid);
    }

}
