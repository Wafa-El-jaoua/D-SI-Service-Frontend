package de.ptb.codataapi.service;

import de.ptb.codataapi.dtos.ConstantDto;
import de.ptb.codataapi.dtos.FundamentalConstantDto;
import de.ptb.codataapi.model.FundamentalConstant;


import java.util.List;

public interface FundamentalConstantService {
    List<FundamentalConstantDto> getFundamentalConstantData();
    List<ConstantDto> getConstantData();
    List<FundamentalConstantDto> getFundamentalConstantsByPid(String pid);
}
