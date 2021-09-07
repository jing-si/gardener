package kr.co.gardener.admin.service.object.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.gardener.admin.dao.object.CertReasonDao;
import kr.co.gardener.admin.model.object.CertReason;
import kr.co.gardener.admin.service.object.CertReasonService;

@Service
public class CertReasonServiceImpl implements CertReasonService{

	@Autowired
	CertReasonDao dao;

	@Override
	public List<CertReason> list() {
		return dao.list();
	}

	@Override
	public void add(CertReason item) {
		dao.add(item);
	}

	@Override
	public CertReason item(int certReasonId) {
		return dao.item(certReasonId);
	}

	@Override
	public void update(CertReason item) {
		dao.update(item);
	}

	@Override
	public void delete(int certReasonId) {
		dao.delete(certReasonId);
	}
	
	 
	
}
