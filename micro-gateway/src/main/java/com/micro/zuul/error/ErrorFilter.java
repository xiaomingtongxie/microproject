package com.micro.zuul.error;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author 17074711 on 2017/10/14.
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class ErrorFilter extends ZuulFilter {

    private final Logger logger = LoggerFactory.getLogger(ErrorFilter.class);
    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        logger.error("====ErrorFilter===request.getMethod()========" + request.getMethod());
        logger.error("====ErrorFilter===request.getRequestURL()=====" + request.getRequestURL().toString());
        logger.error(ctx.getThrowable().getMessage());
        return null;
    }

    @Override
    public boolean shouldFilter() {// 是否执行该过滤器，此处为true，说明需要过滤
        return true;
    }

    @Override
    public int filterOrder() {// 优先级为0，数字越大，优先级越低
        return 100000;
    }

    @Override
    public String filterType() {
        return "error";// 在请求被处理之后，会进入该过滤器
    }
}
