package priv.cjb.demo.authorization;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Repository;

import priv.cjb.demo.utils.CodecUtil;
import priv.cjb.demo.utils.StringUtil;
  
/**        
 * Title: TokenManager的默认实现    
 * Description: 管理 Token
 * @created 2017年7月4日 下午4:41:32    
 */      
public class DefaultTokenManager implements TokenManager {

	/** 将token存储到JVM内存(ConcurrentHashMap)中   (@author: rico) */      
	private static Map<String, String> tokenMap = new ConcurrentHashMap<String, String>();

	/** 
	 * @description 利用UUID创建Token(用户登录时，创建Token)
	 * @author rico       
	 * @created 2017年7月4日 下午4:46:46      
	 * @param username
	 * @return     
	 * @see cn.edu.tju.rico.authorization.TokenManager#createToken(java.lang.String)     
	 */  
	public String createToken(String username) {
		String token = CodecUtil.createUUID();
		tokenMap.put(token, username);
		return token;
	}

	  
	/** 
	 * @description Token验证(用户登录验证)
	 * @author rico       
	 * @created 2017年7月4日 下午4:46:50      
	 * @param token
	 * @return     
	 * @see cn.edu.tju.rico.authorization.TokenManager#checkToken(java.lang.String)     
	 */  
	public boolean checkToken(String token) {
		return !StringUtil.isEmpty(token) && tokenMap.containsKey(token);
	}

	  
	/** 
	 * @description Token删除(用户登出时，删除Token)
	 * @author rico       
	 * @created 2017年7月4日 下午4:46:54      
	 * @param token     
	 * @see cn.edu.tju.rico.authorization.TokenManager#deleteToken(java.lang.String)     
	 */  
	public void deleteToken(String token) {
		// TODO Auto-generated method stub
		tokenMap.remove(token);
	}
}
