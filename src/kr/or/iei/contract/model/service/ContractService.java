package kr.or.iei.contract.model.service;

import java.util.ArrayList;

import kr.or.iei.company.model.vo.Company;
import kr.or.iei.contract.model.vo.Contract;

public interface ContractService {

	ArrayList<Company> selectConditionCompany(String area, String cleanType);

	int insertCondition(Contract con);
	
}
