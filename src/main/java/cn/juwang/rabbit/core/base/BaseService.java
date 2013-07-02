package cn.juwang.rabbit.core.base;

import org.springframework.transaction.annotation.Transactional;

/**
 * service基类.
 * 
 * @author yangzhibin
 * @param <T>
 *            实体类类�?
 */
@Transactional
public abstract class BaseService<T extends BaseEntity> {

	
}
