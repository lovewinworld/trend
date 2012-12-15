package net.nima.trend.home.module.screen;

import com.alibaba.citrus.turbine.Context;
import com.alibaba.citrus.turbine.TurbineRunData;

import net.nima.trend.common.base.BaseScreen;

public class Index extends BaseScreen {

	@Override
	protected void execute(TurbineRunData runData, Context context) {
		context.put("msg", "welcome to webx");
	}

}
