/*Copyright (c) 2015-2016 wavemaker-com All Rights Reserved.This software is the confidential and proprietary information of wavemaker-com You shall not disclose such Confidential Information and shall use it only in accordance with the terms of the source code license agreement you entered into with wavemaker-com*/

package com.salesdb.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import java.util.HashMap;
import java.util.Map;
import java.util.Collections;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.wavemaker.runtime.data.model.CustomQuery;
import com.wavemaker.runtime.data.dao.query.WMQueryExecutor;
import com.wavemaker.runtime.data.exception.QueryParameterMismatchException;

@Service
public class SalesdbQueryExecutorServiceImpl_V1 implements SalesdbQueryExecutorService_V1 {
	private static final Logger LOGGER = LoggerFactory.getLogger(SalesdbQueryExecutorServiceImpl_V1.class);

	@Autowired
	@Qualifier("salesdbWMQueryExecutor")
	private WMQueryExecutor queryExecutor;

	@Transactional(value = "salesdbTransactionManager")
	@Override
	public Page<Object> executeCustomersRatio(Pageable pageable, java.lang.Integer year, java.lang.Integer month)
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("year", year);
        params.put("month", month);
        return queryExecutor.executeNamedQuery("customersRatio", params, pageable);
	}
	@Transactional(value = "salesdbTransactionManager")
	@Override
	public Page<Object> executeEachRepCustomerWiseSales(Pageable pageable, java.lang.Integer id)
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("id", id);
        return queryExecutor.executeNamedQuery("eachRepCustomerWiseSales", params, pageable);
	}
	@Transactional(value = "salesdbTransactionManager")
	@Override
	public Page<Object> executeLeadsByChannel(Pageable pageable, java.lang.Integer channel)
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("channel", channel);
        return queryExecutor.executeNamedQuery("leadsByChannel", params, pageable);
	}
	@Transactional(value = "salesdbTransactionManager")
	@Override
	public Page<Object> executeLeadsCount(Pageable pageable, java.lang.Integer channel)
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("channel", channel);
        return queryExecutor.executeNamedQuery("leadsCount", params, pageable);
	}
	@Transactional(value = "salesdbTransactionManager")
	@Override
	public Page<Object> executeRepsCount(Pageable pageable, java.lang.Integer channel)
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("channel", channel);
        return queryExecutor.executeNamedQuery("repsCount", params, pageable);
	}
	@Transactional(value = "salesdbTransactionManager")
	@Override
	public Page<Object> executeRevenueHeatMap(Pageable pageable, java.lang.Integer year, java.lang.Integer month)
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("year", year);
        params.put("month", month);
        return queryExecutor.executeNamedQuery("revenueHeatMap", params, pageable);
	}
	@Transactional(value = "salesdbTransactionManager")
	@Override
	public Page<Object> executeSalesByChannels(Pageable pageable, java.lang.Integer year, java.lang.Integer month)
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("year", year);
        params.put("month", month);
        return queryExecutor.executeNamedQuery("salesByChannels", params, pageable);
	}
	@Transactional(value = "salesdbTransactionManager")
	@Override
	public Page<Object> executeSalesByEachRep(Pageable pageable, java.lang.Integer id)
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("id", id);
        return queryExecutor.executeNamedQuery("salesByEachRep", params, pageable);
	}
	@Transactional(value = "salesdbTransactionManager")
	@Override
	public Page<Object> executeSalesByReps(Pageable pageable, java.lang.Integer channel)
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("channel", channel);
        return queryExecutor.executeNamedQuery("salesByReps", params, pageable);
	}
	@Transactional(value = "salesdbTransactionManager")
	@Override
	public Page<Object> executeSalesRevenueAndCount(Pageable pageable, java.lang.Integer channel)
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("channel", channel);
        return queryExecutor.executeNamedQuery("salesRevenueAndCount", params, pageable);
	}
	@Transactional(value = "salesdbTransactionManager")
	@Override
	public Page<Object> executeTopTrendingProducts(Pageable pageable, java.lang.Integer year, java.lang.Integer month)
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("year", year);
        params.put("month", month);
        return queryExecutor.executeNamedQuery("topTrendingProducts", params, pageable);
	}
	@Transactional(value = "salesdbTransactionManager")
	@Override
	public Page<Object> executeWeeklyConverted(Pageable pageable, java.lang.Integer year, java.lang.Integer month)
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("year", year);
        params.put("month", month);
        return queryExecutor.executeNamedQuery("weeklyConverted", params, pageable);
	}
	@Transactional(value = "salesdbTransactionManager")
	@Override
	public Page<Object> executeWeeklyFollowUps(Pageable pageable, java.lang.Integer year, java.lang.Integer month)
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("year", year);
        params.put("month", month);
        return queryExecutor.executeNamedQuery("weeklyFollowUps", params, pageable);
	}
	@Transactional(value = "salesdbTransactionManager")
	@Override
	public Page<Object> executeWeeklyLeads(Pageable pageable, java.lang.Integer year, java.lang.Integer month)
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("year", year);
        params.put("month", month);
        return queryExecutor.executeNamedQuery("weeklyLeads", params, pageable);
	}
	@Transactional(value = "salesdbTransactionManager")
	@Override
	public Page<Object> executeWeeklyQuotes(Pageable pageable, java.lang.Integer year, java.lang.Integer month)
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("year", year);
        params.put("month", month);
        return queryExecutor.executeNamedQuery("weeklyQuotes", params, pageable);
	}
	@Transactional(value = "salesdbTransactionManager")
	@Override
	public Page<Object> executeWeeklySales(Pageable pageable, java.lang.Integer year, java.lang.Integer month)
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("year", year);
        params.put("month", month);
        return queryExecutor.executeNamedQuery("weeklySales", params, pageable);
	}

	@Transactional(value = "salesdbTransactionManager")
	@Override
	public Page<Object> executeWMCustomQuerySelect(CustomQuery query, Pageable pageable) {
	    return queryExecutor.executeCustomQuery(query, pageable);
	}

	@Transactional(value = "salesdbTransactionManager")
    @Override
    public int executeWMCustomQueryUpdate(CustomQuery query) {
        return queryExecutor.executeCustomQueryForUpdate(query);
    }
}

