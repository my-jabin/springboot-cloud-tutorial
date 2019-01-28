package com.jiujiu.springboot.gateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName SimpleFilter
 * @AuThor yanbin.hu
 * @Date 1/28/2019
 * @Description
 **/
public class SimpleFilter extends ZuulFilter {

    private static final Logger logger = LoggerFactory.getLogger("SimpleFilter");

    @Override
    public String filterType() {
        //    pre filters are executed before the request is routed,
        //    route filters can handle the actual routing of the request,
        //    post filters are executed after the request has been routed, and
        //    error filters execute if an error occurs in the course of handling the request.

        // filterType() returns a String that stands for the type of the filter---in this case, pre, or it could be route for a routing filter.
        return "pre";
    }

    @Override
    public int filterOrder() {
        //filterOrder() gives the order in which this filter will be executed, relative to other filters
        return 1;
    }

    @Override
    public boolean shouldFilter() {
//        shouldFilter() contains the logic that determines when to execute this filter (this particular filter will always be executed).
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();

        // business logic,
        logger.info(String.format("%s request to %s", request.getMethod(), request.getRequestURL().toString()));

        return null;
    }
}