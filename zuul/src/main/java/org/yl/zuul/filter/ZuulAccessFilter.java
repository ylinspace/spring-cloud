package org.yl.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.commons.lang.StringUtils;
import org.apache.http.HttpStatus;

import javax.servlet.http.HttpServletRequest;
import java.util.logging.Logger;

/**
 * @author yang
 */
public class ZuulAccessFilter extends ZuulFilter {

    private static Logger log = Logger.getLogger(ZuulAccessFilter.class.getName());

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        log.info("should filter !");
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext rtx = RequestContext.getCurrentContext();
        HttpServletRequest request = rtx.getRequest();
        String token = request.getParameter("accessToken");
        if(StringUtils.isBlank(token)){
            log.info("Can not access!");
            rtx.setSendZuulResponse(false);
            rtx.setResponseStatusCode(HttpStatus.SC_UNAUTHORIZED);
            rtx.setResponseBody("nooooooo!");
            return "nooooo!";
        }
        log.info("access ok!");
        return "okeyyyy";
    }
}
