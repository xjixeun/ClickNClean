package kr.or.iei.company.model.service;

import java.sql.Connection;
import java.util.ArrayList;

import kr.or.iei.common.JDBCTemplate;
import kr.or.iei.company.model.dao.CompanyDAO;
import kr.or.iei.company.model.vo.Company;

public class CompanyServiceImpl implements CompanyService{
	private CompanyDAO comDAO = new CompanyDAO();
	@Override
	public ArrayList<Company> selectAllCompany() {
		Connection conn= JDBCTemplate.getConnection();
		ArrayList<Company> list= comDAO.selectAllCompany(conn);
		JDBCTemplate.close(conn);
		
		return list;
	}
	@Override
	public Company selectOneUser(String coId, String coPwd) {
		Connection conn= JDBCTemplate.getConnection();
		Company com = comDAO.selectOneUser(conn, coId, coPwd);
		JDBCTemplate.close(conn);
		return com;
	}
	@Override
	public String searchIdUsingEmail(String roll, String userName, String email) {
		Connection conn = JDBCTemplate.getConnection();
		String coId = comDAO.searchIdUsingEmail(conn, roll, userName, email);
		JDBCTemplate.close(conn);
		return coId;
	}

}
