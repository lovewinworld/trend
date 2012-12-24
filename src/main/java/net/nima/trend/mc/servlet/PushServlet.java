package net.nima.trend.mc.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * 请求入口, 所有的请求通过该入口进行注册或者请求处理
 * 
 * @author Kevin Lee
 *
 */
public class PushServlet extends HttpServlet {
	
	private static final long serialVersionUID = 2321473387746120667L;

	@Override
	public void init(){
		// load configurations
	}

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		this.doService(req, res);
	}
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		this.doService(req, res);
	}
	
	/**
	 * 
	 * 
	 * @param req
	 * @param res
	 */
	private void doService(HttpServletRequest req, HttpServletResponse res){
		
	}
	
}
