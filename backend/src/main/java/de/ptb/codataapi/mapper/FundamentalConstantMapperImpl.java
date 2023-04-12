package de.ptb.codataapi.mapper;

import de.ptb.codataapi.dtos.ConstantDto;
import de.ptb.codataapi.dtos.FundamentalConstantDto;
import de.ptb.codataapi.model.FundamentalConstant;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class FundamentalConstantMapperImpl {
    /**
     * @param fundamentalConstant
     * @return fundamentalConstantDto
     */
    public FundamentalConstantDto fromFundConstToFundConstDto(FundamentalConstant fundamentalConstant) {
        FundamentalConstantDto fundamentalConstantDto = new FundamentalConstantDto();
        BeanUtils.copyProperties(fundamentalConstant, fundamentalConstantDto);
        return fundamentalConstantDto;
    }

    /**
     * @param fundamentalConstant
     * @return constantDto
     */
    public ConstantDto fromFundConstToConstDto(FundamentalConstant fundamentalConstant) {
        ConstantDto constantDto = new ConstantDto();
        BeanUtils.copyProperties(fundamentalConstant, constantDto);
        return constantDto;
    }
}
