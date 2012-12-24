package net.nima.trend.home.module.screen;

import net.nima.trend.biz.ao.FooAO;
import net.nima.trend.common.base.BaseScreen;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.citrus.turbine.Context;
import com.alibaba.citrus.turbine.TurbineRunData;

public class Index extends BaseScreen {

	@Autowired
	private FooAO fooAO;
	
	@Override
	public void execute(TurbineRunData runData, Context context) {
		String msg = fooAO.getMessage();
		context.put("msg", "welcome to webx");
	}

}
