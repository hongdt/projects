/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2016-10-16 13:03:31 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class offer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod_005fid_005fenctype_005faction;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod_005fid_005fenctype_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod_005fid_005fenctype_005faction.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Offre</title>\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/CSS/Stylesdf20.css\"\r\n");
      out.write("\trel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"aval fr-fr home\">\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"smart-app-banner-ipad\" style=\"display: none;\">\r\n");
      out.write("\t\t<div class=\"wrapper background-smartbanner-ipad\">\r\n");
      out.write("\t\t\t<div class=\"txt-button\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div id=\"btn-install-app-ipad\">\r\n");
      out.write("\t\t\t\t\t<a href=\"#\"></a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div id=\"btn-launch-app-ipad\">\r\n");
      out.write("\t\t\t\t\t<a></a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"close-smartbanner\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"headerMarqueBlanche\"></div>\r\n");
      out.write("\r\n");
      out.write("\t<!-- MENU -->\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"container-auth\">\r\n");
      out.write("\t\t<div class=\"col-container\">\r\n");
      out.write("\t\t\t<div class=\"wrapper\">\r\n");
      out.write("\t\t\t\t<div class=\"bloc-top auth\" style=\"height: 480px\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_form_005fform_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<span class=\"back-to-top\" title=\"Remonter\"></span>\r\n");
      out.write("\t<div class=\"pre-footer\">\r\n");
      out.write("\t\t<div class=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"breadcrumb\" id=\"footer-breadcrumb\"></div>\r\n");
      out.write("\t\t\t<div class=\"bottom-mentions\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<footer>\r\n");
      out.write("\t\t<div class=\"footer-brands-wrapper\">\r\n");
      out.write("\t\t\t<div class=\"brands\">\r\n");
      out.write("\t\t\t\t<div class=\"so-local\">\r\n");
      out.write("\t\t\t\t\t<a href=\"http://www.solocalgroup.com/\" target=\"_blank\"\r\n");
      out.write("\t\t\t\t\t\trel=\"nofollow\"></a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"pages-jaunes\">\r\n");
      out.write("\t\t\t\t\t<a href=\"http://www.pagesjaunes.fr/\" target=\"_blank\" rel=\"nofollow\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"mappy\">\r\n");
      out.write("\t\t\t\t\t<a href=\"http://fr.mappy.com/\" target=\"_blank\" rel=\"nofollow\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"comprendre-choisir\">\r\n");
      out.write("\t\t\t\t\t<a href=\"https://www.ooreka.fr/\" target=\"_blank\" rel=\"nofollow\">\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</footer>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"hiddenappversion\">25/07/2016 05:23:22 - Prod -\r\n");
      out.write("\t\tAVAL-FO_002 - v3.4.7.47 - rev 6844edf</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_form_005fform_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  form:form
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_005fform_005f0 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod_005fid_005fenctype_005faction.get(org.springframework.web.servlet.tags.form.FormTag.class);
    _jspx_th_form_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005fform_005f0.setParent(null);
    // /WEB-INF/views/offer.jsp(41,5) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setAction((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}/offre", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/offer.jsp(41,5) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setId("offerForm");
    // /WEB-INF/views/offer.jsp(41,5) name = modelAttribute type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setModelAttribute("offerForm");
    // /WEB-INF/views/offer.jsp(41,5) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setMethod("post");
    // /WEB-INF/views/offer.jsp(41,5) name = enctype type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setEnctype("multipart/form-data");
    int[] _jspx_push_body_count_form_005fform_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005fform_005f0 = _jspx_th_form_005fform_005f0.doStartTag();
      if (_jspx_eval_form_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t<span class=\"title\">Déposez votre offre ici...</span>\r\n");
          out.write("\t\t\t\t\t\t<br>\r\n");
          out.write("\t\t\t\t\t\t<br>\r\n");
          out.write("\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t<input id=\"nom_annonce\" name=\"nameAdvertise\" maxlength=\"50\" name=\"nom_annonce\" placeholder=\"Nom de l'annonce* \" type=\"text\" value=\"\"/>\r\n");
          out.write("\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t<input id=\"surface\" name=\"area\" maxlength=\"50\" name=\"surface\" placeholder=\"Surface (m x m)* \" type=\"text\" value=\"\" />\r\n");
          out.write("\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t<input id=\"nombre\" name=\"numberOfParts\" maxlength=\"50\" placeholder=\"Nombre de pièces * \" type=\"text\" value=\"\" />\r\n");
          out.write("\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t<input id=\"prix\" name=\"price\" maxlength=\"50\" placeholder=\"Prix (USD)* \" type=\"text\" value=\"\" />\r\n");
          out.write("\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t<!-- <select path=\"country\" name=\"pays\">\r\n");
          out.write("\t\t\t\t\t\t\t<option value=\"NONE\" label=\"--- Choisissez votre pays ---\" />\r\n");
          out.write("\t\t\t\t\t\t\t<options items=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${countryList}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\" />\r\n");
          out.write("\t\t\t\t\t\t</select>  -->\r\n");
          out.write("\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t<input id=\"pays\" maxlength=\"50\" name=\"country\" placeholder=\"Pays* \" type=\"text\" value=\"\" />\r\n");
          out.write("\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t<input id=\"ville\" maxlength=\"50\" name=\"city\" placeholder=\"Ville* \" type=\"text\" value=\"\" />\r\n");
          out.write("\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t<input id=\"rue\" maxlength=\"50\" name=\"street\" placeholder=\"Rue* \" type=\"text\" value=\"\" />\r\n");
          out.write("\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t<input type=\"file\" name=\"image1\" size=\"40\" maxlength=\"50\" style=\"position: relative; left: -30px\" />\r\n");
          out.write("\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t<input type=\"file\" name=\"image2\" size=\"40\" maxlength=\"50\" style=\"position: relative; left: -30px\" />\r\n");
          out.write("\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t<input type=\"file\" name=\"image3\" size=\"40\" maxlength=\"50\" style=\"position: relative; left: -30px\" />\r\n");
          out.write("\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t<textarea name=\"description\" rows=\"4\" cols=\"41\" placeholder=\"Décrivez votre offre ici...\"></textarea>\r\n");
          out.write("\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t<input type=\"hidden\" name=\"status\" value=\"1\"/>\r\n");
          out.write("\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t<input id=\"bt-auth\" type=\"submit\" class=\"validBtn\" value=\"Sauvegardez\" style=\"position: relative; left: -290px; top: 30px\" />\r\n");
          out.write("\t\t\t\t\t\t<input id=\"bt-auth\" type=\"reset\" class=\"validBtn\" value=\"Annulez\" style=\"position: relative; left: 55px; top: 30px; width: 100px\" />\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t<div id=\"fb-root\"></div>\r\n");
          out.write("\t\t\t\t\t\t<div id=\"GoogleSigninButton\">\r\n");
          out.write("\t\t\t\t\t\t\t<div class=\"google-signin\"></div>\r\n");
          out.write("\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_form_005fform_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005fform_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005fform_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005fform_005f0.doFinally();
      _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod_005fid_005fenctype_005faction.reuse(_jspx_th_form_005fform_005f0);
    }
    return false;
  }
}
