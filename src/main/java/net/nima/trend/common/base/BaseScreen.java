package net.nima.trend.common.base;

import com.alibaba.citrus.turbine.Context;
import com.alibaba.citrus.turbine.TurbineRunData;

public abstract class BaseScreen {
	
	/**
	 * the base method of screen
	 * 
	 * @param runData
	 * @param context
	 */
	protected abstract void execute(TurbineRunData runData, Context context);

}
