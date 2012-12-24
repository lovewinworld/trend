/**
 * 
 */
package net.nima.trend.mc;

import static org.jboss.netty.channel.Channels.pipeline;

import java.net.InetSocketAddress;

import org.jboss.netty.bootstrap.ServerBootstrap;
import org.jboss.netty.channel.ChannelPipeline;

/**
 * 服务器启动类
 * 
 * @author Kevin Lee
 *
 */
public class Bootstrap {

	/**
	 * 获取配置的服务器信息
	 */
	private void config(){
		
	}
	
	private void start(){
		ServerBootstrap server = new ServerBootstrap();
		
		// 
		ChannelPipeline pipeline = pipeline();
		server.setPipeline(pipeline);
		server.bind(new InetSocketAddress(8090));
	}
	
	public static void main(String[] args) {
		
	}
}
