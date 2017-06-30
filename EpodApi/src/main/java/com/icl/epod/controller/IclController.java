
package com.icl.epod.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.icl.epod.model.ResponseModel;
import com.icl.epod.model.UserModel;
import com.icl.epod.service.IclEpodService;

/**
 * @author Vijendra.y
 *
 */
@RestController
public class IclController {

	@Autowired
	private IclEpodService iclEpodService;		
	private Logger logger = Logger.getLogger(IclController.class);

	
	@RequestMapping(value = "/resource-inventory/api/saveIclUser", method = RequestMethod.POST, produces = { "application/json", "application/xml"}, consumes = { "application/json", "application/xml" })
	public ResponseModel saveIclUser(@RequestBody UserModel model) {
		ResponseModel rm = new ResponseModel();
		try {			
			logger.debug("EpodAPI Controller saveIclUser Enter");
			Integer recordVal = iclEpodService.saveIclUser(model);
				if (recordVal != null) 
				{
					rm.setSuccess("success");
					rm.setRecord_Number(recordVal);
					rm.setFailure("No Exception");
				}
			logger.debug("EpodAPI Controller saveIclUser Exits");
		} catch (Exception e) {			
			logger.error(e.getMessage());
			rm.setFailure("Error while deleting record"+e.getMessage());
			e.printStackTrace();
		}
		return rm;
	}	
	

	@RequestMapping(value = "/resource-inventory/api/v1/saveIclUser", method = RequestMethod.POST, produces = { "application/json", "application/xml"}, consumes = { "application/json", "application/xml" })
	public ResponseModel createIclUser(@RequestBody UserModel model) {
		
	
		ResponseModel rm = new ResponseModel();
		try {			
			logger.debug("EpodAPI Controller saveIclUser Enter");
			Integer recordVal = iclEpodService.saveIclUser(model);
				if (recordVal != null) 
				{
					rm.setSuccess("success");
					rm.setRecord_Number(recordVal);
					rm.setFailure("No Exception");
				}
			logger.debug("EpodAPI Controller saveIclUser Exits");
		} catch (Exception e) {			
			logger.error(e.getMessage());
			rm.setFailure("Error while deleting record"+e.getMessage());
			e.printStackTrace();
		}
		return rm;
	}	
	
	
}
