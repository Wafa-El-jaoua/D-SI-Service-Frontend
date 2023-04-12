package de.ptb.codataapi.repository;

import de.ptb.codataapi.model.FundamentalConstant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FundamentalConstantRepository extends JpaRepository<FundamentalConstant, Integer> {

    public List<FundamentalConstant> findFundamentalConstantsByPid(String pid);
}
