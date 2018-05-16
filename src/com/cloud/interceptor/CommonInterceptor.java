package com.cloud.interceptor;

import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
import javax.servlet.http.HttpSession;  
  
import org.springframework.web.servlet.HandlerInterceptor;  
import org.springframework.web.servlet.ModelAndView;  
  
//��¼��֤��������  
public class CommonInterceptor implements HandlerInterceptor{  
  
    //ִ��Handler����֮ǰִ��  
    //���������֤�������Ȩ  
    //���������֤�������֤ͨ����ʾ��ǰ�û�û�е�½����Ҫ�˷������ز�������ִ��  
    @Override  
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,  
            Object handler) throws Exception {  
          
        //��ȡ�����url  
        String url=request.getRequestURI();  
          
        //�ж�session  
        HttpSession session=request.getSession();  
        //��session��ȡ���û�����Ϣ  
        String username=(String)session.getAttribute("uName");  
        if(username!=null){  
            //��ݴ��ڣ�����  
            return true;  
        }  
          
        //ִ�������ʾ�û������Ҫ��֤����ת����¼����  
        request.getRequestDispatcher("/WEB-INF/views/userLogin.jsp").forward(request, response);  
          
        //return false��ʾ���أ�������ִ��  
        //return true��ʾ����          
        return false;  
    }  
      
    //����Handler����֮�󣬷���modelAndView֮ǰִ��  
    //Ӧ�ó�����modelAndView�����������õ�ģ������(����˵�����)������  
    //������ͼ��Ҳ����������ͳһָ����ͼ  
    @Override  
    public void postHandle(HttpServletRequest request, HttpServletResponse response,  
            Object handler, ModelAndView modelAndView) throws Exception {  
          
        System.out.println("HandlerInterceptor1......postHandle");  
          
    }  
      
    //ִ��Handler���ִ�д˷���  
    //Ӧ�ó�����ͳһ�쳣����ͳһ��־����  
    @Override  
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response,  
            Object handler, Exception ex)  
            throws Exception {  
          
        System.out.println("HandlerInterceptor1......afterHandle");  
          
    }  
}  
