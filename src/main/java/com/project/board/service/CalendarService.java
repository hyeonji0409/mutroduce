package com.project.board.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.project.board.dao.ICalendarDAO;
import com.project.board.model.CalendarVO;

@Service
public class CalendarService implements ICalendarService{
    @Autowired
    @Qualifier("ICalendarDAO")
    ICalendarDAO dao;


    @Override
    public List<Map<String, Object>> calenList() {
        return dao.calenList();
    }
}
