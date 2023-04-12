package de.ptb.codataapi.service;

import de.ptb.codataapi.dtos.ConstantDto;
import de.ptb.codataapi.dtos.FundamentalConstantDto;
import de.ptb.codataapi.mapper.FundamentalConstantMapperImpl;
import de.ptb.codataapi.model.FundamentalConstant;
import de.ptb.codataapi.repository.FundamentalConstantRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@Slf4j
public class FundamentalConstantServiceImpl implements FundamentalConstantService {
    private FundamentalConstantMapperImpl dtoMapper;
    private FundamentalConstantRepository fundamentalConstantRepository;

    @Override
    public List<FundamentalConstantDto> getFundamentalConstantData() {
        List<FundamentalConstant> fundamentalConstantList = fundamentalConstantRepository.findAll();
        List<FundamentalConstantDto> fundamentalConstantListDto = fundamentalConstantList.stream()
                .map(constant -> dtoMapper.fromFundConstToFundConstDto(constant))
                .collect(Collectors.toList());
        return fundamentalConstantListDto;
    }

    @Override
    public List<ConstantDto> getConstantData() {
        List<FundamentalConstant> fundamentalConstantList = fundamentalConstantRepository.findAll();
        List<ConstantDto> constantListDto = fundamentalConstantList.stream()
                .map(constant -> dtoMapper.fromFundConstToConstDto(constant))
                .collect(Collectors.toList());
        return constantListDto;
    }

    @Override
    public List<FundamentalConstantDto> getFundamentalConstantsByPid(String pid) {
        List<FundamentalConstant> fundamentalConstantListByPid = fundamentalConstantRepository.findFundamentalConstantsByPid(pid);
        List<FundamentalConstantDto> fundamentalConstantListDtoByPid = fundamentalConstantListByPid.stream()
                .map(constant -> dtoMapper.fromFundConstToFundConstDto(constant))
                .collect(Collectors.toList());
        return fundamentalConstantListDtoByPid;
    }
}
