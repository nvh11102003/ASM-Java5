package com.example.asm.service.impl;

import com.example.asm.entities.GioHang;
import com.example.asm.entities.GioHangChiTiet;
import com.example.asm.entities.TuLanh;
import com.example.asm.repository.IGioHangChiTietRepository;
import com.example.asm.service.IGioHangChiTietService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class GioHangChiTietServiceImpl implements IGioHangChiTietService {

    @Autowired
    IGioHangChiTietRepository repository;

    @Override
    public List<GioHangChiTiet> getByGh(GioHang gh) {
        return repository.getByGh(gh);
    }

    @Override
    public GioHangChiTiet getByTuLanhAndGh(TuLanh tn, GioHang gh) {
        return repository.getByTuLanhAndGh(tn, gh);
    }

    @Override
    public GioHangChiTiet saveGHCT(GioHangChiTiet ghct) {
        return repository.save(ghct);
    }

    @Override
    public void deleteGHCT(GioHangChiTiet ghct) {
        repository.delete(ghct);
    }

}
