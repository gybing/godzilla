package cn.godzilla.service;

import java.util.List;

import cn.godzilla.common.response.ResponseBodyJson;
import cn.godzilla.model.OperateLog;

public interface OperateLogService {

	public List<OperateLog> queryList(String projectCode,String profile);
	
	public List<OperateLog> queryAll(String projectCode,String profile, Long id);

	public int addOperateLog(String projectCode, String profile, String username, String realname,String operation, String operateCode, String executeResult, String resultInfo) ;

	public OperateLog queryLogById(String projectCode, String profile, Long logid);

	public Long addOperateLog(String projectCode, String profile, String mvnlog, String jarlog);

	public int updateOperateLog(String projectCode, String profile, int logid, String username, String realname,String operation, String operateCode, String executeResult, String resultInfo) ;

	public int updateOperateLog(String projectCode, String profile, String catalinaLog, Long logid);
	
	public ResponseBodyJson logThenReturn(String projectCode, String profile, ResponseBodyJson response) ;
	
	public ResponseBodyJson updateLogThenReturn(String projectCode, String profile, ResponseBodyJson response);

}
