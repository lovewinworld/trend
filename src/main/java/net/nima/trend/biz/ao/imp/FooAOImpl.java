/**
 * 
 */
package net.nima.trend.biz.ao.imp;

import net.nima.trend.biz.ao.FooAO;
import net.nima.trend.common.base.BaseAO;

/**
 * @author Kevin Lee
 *
 */
public class FooAOImpl extends BaseAO implements FooAO {

	/* (non-Javadoc)
	 * @see net.nima.trend.biz.ao.FooAO#getMessage()
	 */
	public String getMessage() {
		System.out.println("切面FooAOImpl的方法执行完毕...");
		return "HelloWorld";
	}

}
