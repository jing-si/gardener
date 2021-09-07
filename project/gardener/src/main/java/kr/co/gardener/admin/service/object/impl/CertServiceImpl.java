package kr.co.gardener.admin.service.object.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.gardener.admin.dao.object.CertDao;
import kr.co.gardener.admin.model.object.Cert;
import kr.co.gardener.admin.service.object.CertService;

@Service
public class CertServiceImpl implements CertService{

	@Autowired
	CertDao dao;
	
	@Override
	public List<Cert> list() {
		return dao.list();
	}

	@Override
	public Cert item(int certId) {
		return dao.item(certId);
	}

	@Override
	public void update(Cert item) {
		dao.update(item);
	}

	@Override
	public void delete(int certId) {
		dao.delete(certId);
	}

	@Override
	public void add(Cert item) {
		dao.add(item);
	}
	
}
