package cn.mldn.enterpriseauth.dao;

import cn.mldn.myenterpriseauth.vo.Member;

public interface IMemberDAO {
	public Member findById(String id);
}