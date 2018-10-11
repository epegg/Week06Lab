/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tags;

import javax.servlet.jsp.tagext.TagSupport;

/**
 *
 * @author 752814
 */
public class DebugTag extends TagSupport {
    @Override
    public int doStartTag() {
        
        boolean test = (pageContext.getRequest().getServerName().equalsIgnoreCase("test") || pageContext.getRequest().getServerName().equalsIgnoreCase("localhost"));
        boolean debug = (pageContext.getRequest().getParameter("debug") != null);
        
        if(test && debug){
            return EVAL_BODY_INCLUDE;
        }else{
            return SKIP_BODY;
        }
    }
}
